package restaurante.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import restaurante.Entidades.Reserva;

public class ReservaData {

    private Connection con;

    String sql;
    PreparedStatement ps;
    ResultSet rs;
    
    MesaData mData = new MesaData();

    public ReservaData() {
        this.con = Conexion.getConexion();
    }

    public void agregarReserva(Reserva reserva) {
        sql = "INSERT INTO reserva (nombreCliente, dniCliente, fechaHora, capacidad, numMesa) VALUES (?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, reserva.getNombreCliente());
            ps.setInt(2, reserva.getDniCliente());
            ps.setString(3, (reserva.getFechaHora()));
            ps.setInt(4, reserva.getCapacidad());
            ps.setInt(5, reserva.getMesa().getNumMesa());

            ps.executeUpdate();

            rs = ps.getGeneratedKeys();

            if (rs.next()) {
                reserva.setIdReserva(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alta exitosa.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al obtener el id.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear la reserva. " + ex.getMessage());
        }
    }
    
    public Reserva buscarReserva(int idReserva) {
        Reserva reserva = null;
        sql = "SELECT nombreCliente, dniCliente, fechaHora, capacidad, numMesa FROM reserva WHERE idReserva = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idReserva);

            rs = ps.executeQuery();

            if (rs.next()) {
                reserva = new Reserva();
                reserva.setIdReserva(idReserva);
                reserva.setNombreCliente(rs.getString("nombreCliente"));
                reserva.setDniCliente(rs.getInt("dniCliente"));
                reserva.setFechaHora(rs.getString("fechaHora"));
                reserva.setCapacidad(rs.getInt("capacidad"));
                reserva.setMesa(mData.buscarMesa(rs.getInt("numMesa")));
            } else {
                JOptionPane.showMessageDialog(null, "No existe la reserva.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva. " + ex.getMessage());
        }

        return reserva;
    }
    
    public List<Reserva> listarReservas() {
        List<Reserva> reservas = new ArrayList<>();

        sql = "SELECT * FROM reserva";

        try {

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Reserva reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setNombreCliente(rs.getString("nombreCliente"));
                reserva.setDniCliente(rs.getInt("dniCliente"));
                reserva.setFechaHora(rs.getString("fechaHora"));
                reserva.setCapacidad(rs.getInt("capacidad"));
                reserva.setMesa(mData.buscarMesa(rs.getInt("numMesa")));

                reservas.add(reserva);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa. " + ex.getMessage());
        }

        return reservas;
    }
    
    public void modificarReserva(Reserva reserva) {

        sql = "UPDATE reserva SET nombreCliente = ?, dniCliente = ?, fechaHora = ?, capacidad = ?, numMesa = ? WHERE idReserva = ?";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, reserva.getNombreCliente());
            ps.setInt(2, reserva.getDniCliente());
            ps.setString(3, (reserva.getFechaHora()));
            ps.setInt(4, reserva.getCapacidad());            
            ps.setInt(5, reserva.getMesa().getNumMesa());
            ps.setInt(6, reserva.getIdReserva());
            
            int registroFilas = ps.executeUpdate();

            if (registroFilas == 1) {
                JOptionPane.showMessageDialog(null, "Reserva modificada.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la reserva.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla empleado. " + ex.getMessage());
        }
    }

    public void eliminarReserva(int idReserva) {

        sql = "DELETE FROM reserva WHERE idReserva = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idReserva);

            int registroFilas = ps.executeUpdate();

            if (registroFilas == 1) {
                JOptionPane.showMessageDialog(null, "Reserva Anulada.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalle. " + ex.getMessage());
        }
    }
}
