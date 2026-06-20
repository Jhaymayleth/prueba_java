package lavadero.modelo;

public class Cubiculo {

    private String codigo;
    private String estado; // disponible, ocupado

    public Cubiculo(String codigo) {
        this.codigo = codigo;
        this.estado = "DISPONIBLE";
    }

    public void ocupar() {
        this.estado = "OCUPADO";
    }

    public void liberar() {
        this.estado = "DISPONIBLE";
    }

    public String getEstado() {
        return estado;
    }
}