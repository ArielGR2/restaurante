package restaurante.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
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
        sql = "INSERT INTO mesa (numMesa, capacidad, estado) VALUES (?,?,?)";
        
        
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesa.getNumMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setString(3, mesa.getEstado());

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

    public Mesa buscarMesa(int id) {
        Mesa mesa = null;
        sql = "SELECT numMesa, capacidad, estado FROM mesa WHERE id = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            if (rs.next()) {
                mesa = new Mesa();
                mesa.setNumMesa(rs.getInt("numMesa"));
                //Estado mesa
                mesa.setCapacidad(rs.getInt("capacidad"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe la mesa.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa. " + ex.getMessage());
        }

        return mesa;
    }
/*
    public List<Empleado> listarEmpleados() {
        List<Empleado> empleados = new ArrayList<>();

        sql = "SELECT * FROM empleado WHERE estado = 1";

        try {

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                Empleado empleado = new Empleado();

                empleado.setIdEmpleado(rs.getInt("idEmpleado"));
                empleado.setDni(rs.getInt("dni"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setEstado(rs.getBoolean("estado"));

                empleados.add(empleado);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla empleado. " + ex.getMessage());
        }

        return empleados;
    }

    public void modificarEmpleado(Empleado empleado) {

        sql = "UPDATE empleado SET dni = ?, nombre = ?, estado = ? WHERE idEmpleado = ?";

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, empleado.getDni());
            ps.setString(2, empleado.getNombre());
            ps.setBoolean(3, empleado.isEstado());
            ps.setInt(4, empleado.getIdEmpleado());

            int registroFilas = ps.executeUpdate();

            if (registroFilas == 1) {
                JOptionPane.showMessageDialog(null, "Modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró al empleado.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla empleado. " + ex.getMessage());
        }
    }

    public void eliminarEmpleado(int dni) {

        sql = "UPDATE empleado SET estado = 0 WHERE dni = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);

            int registroFilas = ps.executeUpdate();

            if (registroFilas == 1) {
                JOptionPane.showMessageDialog(null, "Empleado eliminado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla empleado. " + ex.getMessage());
        }
    }
*/
}
