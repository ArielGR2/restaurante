package restaurante.Entidades;

import java.time.LocalDate;

public class Reserva {

    private int idReserva;
    private String nombreCliente;
    private int dniCliente;
    private LocalDate fechaReserva;
    private int capacidad;
    private Mesa mesa;
    private boolean estado;

    public Reserva(int idReserva, String nombreCliente, int dniCliente, LocalDate fechaReserva, int capacidad, Mesa mesa, boolean estado) {
        this.idReserva = idReserva;
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaReserva = fechaReserva;
        this.capacidad = capacidad;
        this.mesa = mesa;
        this.estado = estado;
    }

    public Reserva(String nombreCliente, int dniCliente, LocalDate fechaReserva, int capacidad, Mesa mesa, boolean estado) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaReserva = fechaReserva;
        this.capacidad = capacidad;
        this.mesa = mesa;
        this.estado = estado;
    }

    public Reserva() {
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", nombreCliente=" + nombreCliente + ", dniCliente=" + dniCliente + ", fechaReserva=" + fechaReserva + ", capacidad=" + capacidad + ", mesa=" + mesa + ", estado=" + estado + '}';
    }
}
