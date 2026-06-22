package lavadero.modelo;

public class Categoria {

    private String codigo;
    private String nombre;
    private String icono;


    public Categoria(String codigo, String nombre, String icono){

        this.codigo = codigo;
        this.nombre = nombre;
        this.icono = icono;

    }


    public String getCodigo(){

        return codigo;

    }


    public String getNombre(){

        return nombre;

    }


    public String toString(){

        return codigo + " - " + nombre;

    }

}