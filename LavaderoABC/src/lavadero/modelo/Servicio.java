package lavadero.modelo;


public class Servicio {


    private String codigo;
    private String nombre;
    private double precio;
    private String descripcion;


    private Categoria categoria;



    public Servicio(
        String codigo,
        String nombre,
        double precio,
        String descripcion,
        Categoria categoria
    ){

        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
        this.descripcion=descripcion;
        this.categoria=categoria;

    }



    public String getCodigo(){
        return codigo;
    }


    public String getNombre(){
        return nombre;
    }


    public double getPrecio(){
        return precio;
    }


    public String toString(){

        return nombre+" $" + precio;

    }

}