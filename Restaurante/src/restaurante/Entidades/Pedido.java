package restaurante.Entidades;

import java.util.ArrayList;

public class Pedido {
    
    private int idPedido;
    private Mesa mesa;
    private Empleado empleado;
    private double precioPedido;
    private ArrayList<Detalle> listaDetalles;
    private EstadoPedido estado;

    public Pedido(int idPedido, Mesa mesa, Empleado empleado, EstadoPedido estado) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.empleado = empleado;
        this.estado = estado;
    }

    public Pedido(Mesa mesa, Empleado empleado, EstadoPedido estado) {
        this.mesa = mesa;
        this.empleado = empleado;
        this.estado = estado;
    }

    public Pedido() {
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public double getPrecioPedido() {
        return precioPedido;
    }

    public void setPrecioPedido(double precioPedido) {
        this.precioPedido = precioPedido;
    }

    public ArrayList<Detalle> getListaDetalles() {
        return listaDetalles;
    }

    public void setDetalle(Detalle detalle) {
        listaDetalles.add(detalle);
    }
    
    public String getEstado() {
        return estado.toString();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", mesa=" + mesa + ", empleado=" + empleado + ", precioPedido=" + precioPedido + ", estado=" + estado + '}';
    }
}
