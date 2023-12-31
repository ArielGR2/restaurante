package restaurante.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import restaurante.Entidades.EstadoMesa;
import restaurante.Entidades.Mesa;

public class MesaData {

    private Connection con;

    String sql;
    PreparedStatement ps;
    ResultSet rs;

    public MesaData() {
        this.con = Conexion.getConexion();
    }

    public void agregarMesa(Mesa mesa) {
        sql = "INSERT INTO mesa (numMesa, capacidad) VALUES (?,?)";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesa.getNumMesa());
            ps.setInt(2, mesa.getCapacidad());

            ps.executeUpdate();

            rs = ps.getGeneratedKeys();

            if (rs.next()) {
                mesa.setIdMesa(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alta exitosa.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al obtener el id.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar mesa. " + ex.getMessage());
        }
    }

    public Mesa buscarMesa(int numMesa) {
        Mesa mesa = null;
        sql = "SELECT idMesa, capacidad, estado FROM mesa WHERE numMesa = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, numMesa);

            rs = ps.executeQuery();

            if (rs.next()) {
                mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumMesa(numMesa);
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado((EstadoMesa.valueOf(rs.getString("estado"))));
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa. " + ex.getMessage());
        }

        return mesa;
    }
    
    public Mesa buscarMesaxCapacidad(int capacidad) {
        Mesa mesa = null;
        sql = "SELECT numMesa FROM mesa WHERE capacidad = ? AND estado = 'LIBRE'";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, capacidad);

            rs = ps.executeQuery();

            if (rs.next()) {
                mesa = new Mesa();
                mesa.setNumMesa(mesa.getNumMesa());
                mesa.setCapacidad(capacidad);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa. " + ex.getMessage());
        }

        return mesa;
    }

    public List<Mesa> listarMesas() {
        List<Mesa> mesas = new ArrayList<>();

        sql = "SELECT * FROM mesa ORDER BY numMesa ASC";

        try {

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                Mesa mesa = new Mesa();

                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumMesa(rs.getInt("numMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setEstado((EstadoMesa.valueOf(rs.getString("estado"))));

                mesas.add(mesa);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa. " + ex.getMessage());
        }

        return mesas;
    }

    public List<Mesa> listarMesasLibres() {
        List<Mesa> mesas = new ArrayList<>();

        sql = "SELECT numMesa, capacidad FROM mesa WHERE estado = 'LIBRE' ORDER BY numMesa ASC";

        try {

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                Mesa mesa = new Mesa();

                mesa.setNumMesa(rs.getInt("numMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));

                mesas.add(mesa);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa. " + ex.getMessage());
        }

        return mesas;
    }

    public int calcularCapacidadTotalMesasLibres() {
        int capacidadTotal = 0;

        sql = "SELECT SUM(capacidad) AS capacidad_total FROM mesa WHERE estado = 'LIBRE'";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                capacidadTotal = rs.getInt("capacidad_total");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al calcular la capacidad total de las mesas. " + ex.getMessage());
        }

        return capacidadTotal;
    }

    public void modificarMesa(Mesa mesa) {

        sql = "UPDATE mesa SET numMesa = ?, capacidad = ?, estado = ? WHERE idMesa = ?";

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, mesa.getNumMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setString(3, mesa.getEstado());
            ps.setInt(4, mesa.getIdMesa());

            int registroFilas = ps.executeUpdate();

            if (registroFilas != 1) {
                JOptionPane.showMessageDialog(null, "No se encontró la mesa.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa. " + ex.getMessage());
        }
    }

    public void eliminarMesa(int numMesa) {
        //Puede ser con el Id
        sql = "DELETE FROM mesa WHERE numMesa = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, numMesa);

            int registroFilas = ps.executeUpdate();

            if (registroFilas == 1) {
                JOptionPane.showMessageDialog(null, "Mesa eliminada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa. " + ex.getMessage());
        }
    }

}
