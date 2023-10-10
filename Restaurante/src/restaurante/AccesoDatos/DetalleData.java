package restaurante.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import restaurante.Entidades.Detalle;

public class DetalleData {

    private Connection con;
    private PedidoData pedidoData = new PedidoData();
    private ProductoData productoData = new ProductoData();
    
    String sql;
    PreparedStatement ps;
    ResultSet rs;

    public DetalleData() {
        this.con = Conexion.getConexion();
    }

    public void agregarDetalle(Detalle detalle) {
        sql = "INSERT INTO detalle (idPedido, idProducto, cantProducto, subtotal) VALUES (?,?,?,?)";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detalle.getPedido().getIdPedido());
            ps.setInt(2, detalle.getProducto().getIdProducto());
            ps.setInt(3, detalle.getCantProducto());
            ps.setDouble(4, detalle.getSubtotal());

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

    public Detalle buscarDetalle(int idDetalle) {
        Detalle detalle = null;
        sql = "SELECT idPedido, idProducto, cantProducto, subtotal FROM detalle WHERE idDetalle = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idDetalle);

            rs = ps.executeQuery();

            if (rs.next()) {
                detalle = new Detalle();
                detalle.setIdDetalle(idDetalle);
                detalle.setPedido(pedidoData.buscarPedido(rs.getInt("idPedido")));
                detalle.setProducto(productoData.buscarProducto(rs.getInt("idProducto")));
                detalle.setCantProducto(rs.getInt("cantProducto"));
                detalle.setSubtotal(rs.getDouble("subtotal"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el detalle.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalle. " + ex.getMessage());
        }

        return detalle;
    }
}
