package restaurante.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import restaurante.Entidades.Empleado;

public class EmpleadoData {

    private Connection con;

    String sql;
    PreparedStatement ps;
    ResultSet rs;

    public EmpleadoData() {
        this.con = Conexion.getConexion();
    }

    public void agregarEmpleado(Empleado empleado) {
        sql = "INSERT INTO empleado (dni, nombre, apellido) VALUES (?,?,?)";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, empleado.getDni());
            ps.setString(2, empleado.getNombre());
            ps.setString(3, empleado.getApellido());
            ps.setBoolean(4, empleado.isEstado());

            ps.executeUpdate();

            rs = ps.getGeneratedKeys();

            if (rs.next()) {
                empleado.setIdEmpleado(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alta exitosa.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al obtener el id.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar empleado. " + ex.getMessage());
        }
    }

    public Empleado buscarEmpleado(int idEmpleado) {
        Empleado empleado = null;
        sql = "SELECT dni, nombre, apellido, estado FROM empleado WHERE idEmpleado = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idEmpleado);

            rs = ps.executeQuery();

            if (rs.next()) {
                empleado = new Empleado();
                empleado.setIdEmpleado(idEmpleado);
                empleado.setDni(rs.getInt("dni"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellido(rs.getString("apellido"));
                empleado.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el empleado.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla empleado. " + ex.getMessage());
        }

        return empleado;
    }

    public Empleado buscarEmpleadoDni(int dni) {
        Empleado empleado = null;
        sql = "SELECT idEmpleado, nombre, apellido, estado FROM empleado WHERE dni = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);

            rs = ps.executeQuery();

            if (rs.next()) {
                empleado = new Empleado();
                empleado.setIdEmpleado(rs.getInt("idEmpleado"));
                empleado.setDni(dni);
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellido(rs.getString("apellido"));
                empleado.setEstado(rs.getBoolean("estado"));
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla empleado. " + ex.getMessage());
        }

        return empleado;
    }

    public List<Empleado> listarEmpleadosActivos() {
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
                empleado.setApellido(rs.getString("apellido"));
                empleado.setEstado(rs.getBoolean("estado"));

                empleados.add(empleado);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla empleado. " + ex.getMessage());
        }

        return empleados;
    }

    public List<Empleado> listarEmpleados() {
        List<Empleado> empleados = new ArrayList<>();

        sql = "SELECT * FROM empleado";

        try {

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                Empleado empleado = new Empleado();

                empleado.setIdEmpleado(rs.getInt("idEmpleado"));
                empleado.setDni(rs.getInt("dni"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellido(rs.getString("apellido"));
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

        sql = "UPDATE empleado SET dni = ?, nombre = ?, apellido = ?, estado = ? WHERE idEmpleado = ?";

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, empleado.getDni());
            ps.setString(2, empleado.getNombre());
            ps.setString(3, empleado.getApellido());
            ps.setBoolean(4, empleado.isEstado());
            ps.setInt(5, empleado.getIdEmpleado());

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
}
