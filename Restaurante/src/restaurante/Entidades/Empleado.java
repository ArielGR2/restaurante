package restaurante.Entidades;

public class Empleado {
    
    private int idEmpleado;
    private int dni;
    private String nombre;
    private boolean estado;

    public Empleado(int idEmpleado, int dni, String nombre, boolean estado) {
        this.idEmpleado = idEmpleado;
        this.dni = dni;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Empleado(int dni, String nombre, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.estado = estado;
    }

    public Empleado() {
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", dni=" + dni + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
}
