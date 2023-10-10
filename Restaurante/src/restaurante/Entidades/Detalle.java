package restaurante.Entidades;

public class Detalle {

    private int idDetalle;
    private Pedido pedido;
    private Producto producto;
    private int cantProducto;
    private double subtotal;

    public Detalle(int idDetalle, Pedido pedido, Producto producto, int cantProducto) {
        this.idDetalle = idDetalle;
        this.pedido = pedido;
        this.producto = producto;
        this.cantProducto = cantProducto;
        this.subtotal = cantProducto * producto.getPrecio();
    }

    public Detalle(Pedido pedido, Producto producto, int cantProducto) {
        this.pedido = pedido;
        this.producto = producto;
        this.cantProducto = cantProducto;
        this.subtotal = cantProducto * producto.getPrecio();
    }

    public Detalle() {
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantProducto() {
        return cantProducto;
    }

    public void setCantProducto(int cantProducto) {
        this.cantProducto = cantProducto;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "Detalle{" + "idDetalle=" + idDetalle + ", pedido=" + pedido + ", producto=" + producto + ", cantProducto=" + cantProducto + ", subtotal=" + subtotal + '}';
    }
}
