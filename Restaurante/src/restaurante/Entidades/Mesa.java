package restaurante.Entidades;

public class Mesa {
    
    private int idMesa;
    private int numMesa;
    private int capacidad;
    private EstadoMesa estado;

    public Mesa(int idMesa, int numMesa, int capacidad, EstadoMesa estado) {
        this.idMesa = idMesa;
        this.numMesa = numMesa;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public Mesa(int numMesa, int capacidad) {
        this.numMesa = numMesa;
        this.capacidad = capacidad;
        
    }

    public Mesa() {
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado.toString();
    }

    public void setEstado(EstadoMesa estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        if (idMesa == 0) {
            return "Selecione Mesa";
        }
        return String.valueOf(numMesa);
    }
}
