package restaurante.Entidades;

public class Producto{
    
    private int idProducto;
    private String nombre;
    private int stock;
    private double precio;
    private boolean disponible;

    public Producto(int idProducto, String nombre, int stock, double precio, boolean disponible) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.disponible = disponible;
    }

    public Producto(String nombre, int stock, double precio, boolean disponible) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.disponible = disponible;
    }

    public Producto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", stock=" + stock + ", precio=" + precio + ", disponible=" + disponible + '}';
    }
    
    
    

    
}
