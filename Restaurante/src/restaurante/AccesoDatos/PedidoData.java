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
import restaurante.Entidades.EstadoPedido;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Pedido;

public class PedidoData {

    private Connection con;
    private EmpleadoData eData = new EmpleadoData();
    private MesaData mData = new MesaData();

    String sql;
    PreparedStatement ps;
    ResultSet rs;

    public PedidoData() {
        this.con = Conexion.getConexion();
    }

    public void agregarPedido(Pedido pedido) {
        sql = "INSERT INTO pedido (numMesa, idEmpleado, precioPedido) VALUES (?,?,?)";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.getMesa() == null ? 0 :  pedido.getMesa().getNumMesa());
            ps.setInt(2, pedido.getEmpleado() == null ? 0 : pedido.getEmpleado().getIdEmpleado());
            ps.setDouble(3, pedido.getPrecioPedido());

            ps.executeUpdate();

            rs = ps.getGeneratedKeys();

            if (rs.next()) {
                pedido.setIdPedido(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "Error al obtener el id.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar el pedido. " + ex.getMessage());
        }
    }

    public Pedido buscarPedido(int idPedido) {
        Pedido pedido = null;
        sql = "SELECT * FROM pedido WHERE idPedido = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);

            rs = ps.executeQuery();

            if (rs.next()) {
                pedido = new Pedido();
                pedido.setIdPedido(idPedido);
                pedido.setMesa(mData.buscarMesa(rs.getInt("numMesa")));
                pedido.setEmpleado(eData.buscarEmpleado(rs.getInt("idEmpleado")));
                pedido.setPrecioPedido(rs.getDouble("precioPedido"));
                pedido.setEstado(EstadoPedido.valueOf(rs.getString("estado")));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el pedido.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedido. " + ex.getMessage());
        }

        return pedido;
    }

    public Pedido buscarPedido(Mesa mesa, Empleado empleado) {
        Pedido pedido = null;
        sql = "SELECT * FROM pedido WHERE  numMesa = ? AND idEmpleado = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, mesa.getIdMesa());
            ps.setInt(2, empleado.getIdEmpleado());

            rs = ps.executeQuery();

            if (rs.next()) {
                pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setMesa(mesa);
                pedido.setEmpleado(empleado);
                pedido.setPrecioPedido(rs.getDouble("precioPedido"));
                pedido.setEstado(EstadoPedido.valueOf(rs.getString("estado")));
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedido. " + ex.getMessage());
        }

        return pedido;
    }
    
    public List<Pedido> listarPedidos() {
        List<Pedido> pedidos = new ArrayList<>();

        sql = "SELECT * FROM pedido";

        try {

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                Pedido pedido = new Pedido();

                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setMesa(mData.buscarMesa(rs.getInt("numMesa")));
                pedido.setEmpleado(eData.buscarEmpleado(rs.getInt("idEmpleado")));
                pedido.setPrecioPedido(rs.getDouble("precioPedido"));
                pedido.setEstado(EstadoPedido.valueOf(rs.getString("estado")));

                pedidos.add(pedido);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedido. " + ex.getMessage());
        }

        return pedidos;
    }

    public List<Pedido> listarPedidosMesa(int numMesa) {
        List<Pedido> pedidos = new ArrayList<>();

        sql = "SELECT idPedido, idEmpleado, precioPedido, p.estado FROM pedido p, mesa m "
                + "WHERE p.numMesa = ? AND (p.numMesa = m.numMesa);";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, numMesa);

            rs = ps.executeQuery();

            while (rs.next()) {
                Pedido pedido = new Pedido();

                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setMesa(mData.buscarMesa(numMesa));
                pedido.setEmpleado(eData.buscarEmpleado(rs.getInt("idEmpleado")));
                pedido.setPrecioPedido(rs.getDouble("precioPedido"));
                pedido.setEstado(EstadoPedido.valueOf(rs.getString("estado")));

                pedidos.add(pedido);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedido. " + ex.getMessage());
        }

        return pedidos;
    }

    public List<Pedido> listarPedidosEmpleado(int idEmpleado) {
        List<Pedido> pedidos = new ArrayList<>();

        sql = "SELECT idPedido, numMesa, precioPedido, estado FROM pedido WHERE idEmpleado = ?";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, idEmpleado);

            rs = ps.executeQuery();

            while (rs.next()) {
                Pedido pedido = new Pedido();

                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setMesa(mData.buscarMesa(rs.getInt("numMesa")));
                pedido.setEmpleado(eData.buscarEmpleado(idEmpleado));
                pedido.setPrecioPedido(rs.getDouble("precioPedido"));
                pedido.setEstado(EstadoPedido.valueOf(rs.getString("estado")));

                pedidos.add(pedido);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedido. " + ex.getMessage());
        }

        return pedidos;
    }

    public void modificarPedido(Pedido pedido) {

        sql = "UPDATE pedido SET numMesa = ?, idEmpleado = ?, precioPedido = ?, estado = ? WHERE idPedido = ?";

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, pedido.getMesa().getNumMesa());
            ps.setInt(2, pedido.getEmpleado().getIdEmpleado());
            ps.setDouble(3, pedido.getPrecioPedido());
            ps.setString(4, pedido.getEstado());
            ps.setInt(5, pedido.getIdPedido());

            int registroFilas = ps.executeUpdate();

            if (registroFilas == 1) {
                JOptionPane.showMessageDialog(null, "Modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el pedido.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedido . " + ex.getMessage());
        }
    }

    public void eliminarPedido(int idPedido) {

        sql = "DELETE FROM pedido WHERE idPedido = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);

            int registroFilas = ps.executeUpdate();

            if (registroFilas == 1) {
                JOptionPane.showMessageDialog(null, "Pedido eliminado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedido. " + ex.getMessage());
        }
    }

}
