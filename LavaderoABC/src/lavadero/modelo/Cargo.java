package lavadero.modelo;

public class Cargo {

    private int idCargo;
    private String nombre;
    private String descripcion;

    public Cargo(int idCargo, String nombre, String descripcion) {
        this.idCargo = idCargo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }
}