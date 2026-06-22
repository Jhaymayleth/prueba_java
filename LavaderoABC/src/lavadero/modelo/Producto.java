package lavadero.modelo;


public class Producto {


    private String codigo;
    private String nombre;
    private String marca;
    private double precio;
    private int stock;
    private String descripcion;

    private Categoria categoria;


    public Producto(
        String codigo,
        String nombre,
        String marca,
        double precio,
        int stock,
        String descripcion,
        Categoria categoria
    ){

        this.codigo=codigo;
        this.nombre=nombre;
        this.marca=marca;
        this.precio=precio;
        this.stock=stock;
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


    public int getStock(){
        return stock;
    }


    public double getPrecioVenta(){

        return precio * 1.35;

    }


    public String toString(){

        return nombre + " $" + precio;

    }

}