package restaurante.Entidades;

import java.time.LocalDate;
import java.util.Date;

public class Reserva {

    private int idReserva;
    private String nombreCliente;
    private int dniCliente;
    private String fechaHora;
    private int capacidad;
    private Mesa mesa;

    public Reserva(int idReserva, String nombreCliente, int dniCliente, String fechaHora, int capacidad, Mesa mesa) {
        this.idReserva = idReserva;
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaHora = fechaHora;
        this.capacidad = capacidad;
        this.mesa = mesa;
    }

    public Reserva(String nombreCliente, int dniCliente, String fechaHora, int capacidad, Mesa mesa) {
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
       this.fechaHora = fechaHora;
        this.capacidad = capacidad;
        this.mesa = mesa;
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

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
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

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", nombreCliente=" + nombreCliente + ", dniCliente=" + dniCliente + ", fechaHora=" + fechaHora + ", capacidad=" + capacidad + ", mesa=" + mesa +'}';
    }
}
