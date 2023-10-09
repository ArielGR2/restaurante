package restaurante.AccesoDatos;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "restaurante";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Conexion conexion;

    private Conexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase Conexion: Error al cargar Driver");
        }
    }

    public static Connection getConexion() {
        Connection con = null;
        if (conexion == null) {
            conexion = new Conexion();
        }
        try {
            con = DriverManager.getConnection(URL + DB + "?useLegacyDatetimeCode=false&serverTimezone=UTC" + "&user=" + USUARIO + "&password=" + PASSWORD);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion ");
        }

        return con;
    }

}
