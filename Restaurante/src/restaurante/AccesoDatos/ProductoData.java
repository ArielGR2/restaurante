/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import restaurante.Entidades.Producto;

/**
 *
 * @author Ariel
 */
public class ProductoData {

    private Connection con;

    String sql;
    PreparedStatement ps;
    ResultSet rs;

    public ProductoData() {
        this.con = Conexion.getConexion();
    }

    public void agregarProducto(Producto producto) {//viene un producto sin id

        sql = "INSERT INTO producto (nombre, stock, precio, disponible) VALUES (?,?,?,?)";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getStock());
            ps.setDouble(3, producto.getPrecio());

            ps.setBoolean(4, producto.isDisponible());

            ps.executeUpdate();//guardo en la bd

            rs = ps.getGeneratedKeys();//recupero la clave primaria

            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));//completo el producto en java
                JOptionPane.showMessageDialog(null, "Alta exitosa.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al obtener el id.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar producto. " + ex.getMessage());
        }
    }

    public Producto buscarProducto(String nombre) {
        Producto producto = null;
        //Para que muestre Todos sin importar el estado
        sql = "SELECT idProducto, stock, precio, disponible FROM producto WHERE nombre = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);

            rs = ps.executeQuery();

            if (rs.next()) {
                producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(nombre);
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setDisponible(rs.getBoolean("disponible"));
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto. " + ex.getMessage());
        }

        return producto;
    }

    public Producto buscarProducto(int idProducto) {
        Producto producto = null;
        //Para que muestre Todos sin importar el estado
        sql = "SELECT nombre, stock, precio, disponible FROM producto WHERE idProducto = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);

            rs = ps.executeQuery();

            if (rs.next()) {
                producto = new Producto();
                producto.setIdProducto(idProducto);
                producto.setNombre(rs.getString("nombre"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setDisponible(rs.getBoolean("disponible"));
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto. " + ex.getMessage());
        }

        return producto;
    }

    public List<Producto> listarProductos() {
        List<Producto> productos = new ArrayList<>();

        sql = "SELECT * FROM producto";

        try {

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                Producto producto = new Producto();

                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setDisponible(rs.getBoolean("disponible"));

                productos.add(producto);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto. " + ex.getMessage());
        }

        return productos;
    }

    public List<Producto> listarProductosXFiltros(String nombrep, String sMinp, String sMaxp, String pMinp, String pMaxp) {
        List<Producto> productos = new ArrayList<>();

        sql = "SELECT * FROM producto WHERE nombre like '%" + nombrep + "%' AND (stock >= " + sMinp + " AND stock <= " + sMaxp + ") AND (precio >= " + pMinp + " AND precio <= " + pMaxp + ")";

        try {

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                Producto producto = new Producto();

                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setDisponible(rs.getBoolean("disponible"));

                productos.add(producto);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto. " + ex.getMessage());
        }

        return productos;
    }

    public void modificarProducto(Producto producto) {

        sql = "UPDATE producto SET nombre = ?, stock = ?, precio = ?, disponible=? WHERE idProducto = ?";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getStock());
            ps.setDouble(3, producto.getPrecio());
            ps.setBoolean(4, producto.isDisponible());
            ps.setInt(5, producto.getIdProducto());

            int registroFilas = ps.executeUpdate();

            if (registroFilas != 1) {
                JOptionPane.showMessageDialog(null, "No se encontró el producto.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto. " + ex.getMessage());
        }
    }

    public void eliminarProducto(int id) {

        sql = "DELETE FROM producto WHERE idProducto = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int registroFilas = ps.executeUpdate();

            if (registroFilas == 1) {
                JOptionPane.showMessageDialog(null, "Producto eliminado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto. " + ex.getMessage());
        }
    }

}
