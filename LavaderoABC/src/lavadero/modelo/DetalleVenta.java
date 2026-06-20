package lavadero.modelo;

public class DetalleVenta {

    private int cantidad;
    private double precio;
    private double descuento;

    private Producto producto;
    private Servicio servicio;

    public DetalleVenta(int cantidad, double precio, double descuento,
                        Producto producto, Servicio servicio) {

        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;

        this.producto = producto;
        this.servicio = servicio;
    }

    public double calcularSubtotal() {

        double base = cantidad * precio;
        return base - descuento;
    }
}