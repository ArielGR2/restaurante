package restaurante.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import restaurante.Entidades.Detalle;

public class DetalleData{

     private Connection con;
     
     String sql;
    PreparedStatement ps;
    ResultSet rs;

    public DetalleData() {
        this.con = Conexion.getConexion();
    }
    
    public void agregarDetalle(Detalle detalle) {
        sql = "INSERT INTO detalle (idPedido, idProducto, cantProducto) VALUES (?,?,?)";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detalle.getPedido().getIdPedido());
            ps.setInt(2, detalle.getProducto().getIdProducto());
            ps.setInt(3, detalle.getCantProducto());

            ps.executeUpdate();

            rs = ps.getGeneratedKeys();

            if (rs.next()) {
                detalle.setIdDetalle(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alta exitosa.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al obtener el id.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar el detalle. " + ex.getMessage());
        }
    }
}
