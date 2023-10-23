package restaurante.Entidades;

public class Empleado {

    private int idEmpleado;
    private int dni;
    private String nombre;
    private String apellido;
    private boolean estado;

    public Empleado(int idEmpleado, int dni, String nombre, String apellido, boolean estado) {
        this.idEmpleado = idEmpleado;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
    }

    public Empleado(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        if (idEmpleado == 0) {
            return "Selecione Mesero";
        }
        return idEmpleado + ". " + dni + ", " + nombre + "," + apellido + ", " + estado;
    }
}
