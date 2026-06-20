package lavadero.modelo;

import java.util.ArrayList;
import java.util.Date;

public class OrdenVenta {

    private String codigo;
    private Date fecha;
    private Cliente cliente;
    private Empleado empleado;

    private ArrayList<DetalleVenta> detalles;

    public OrdenVenta(String codigo, Cliente cliente, Empleado empleado) {
        this.codigo = codigo;
        this.fecha = new Date();
        this.cliente = cliente;
        this.empleado = empleado;

        this.detalles = new ArrayList<>();
    }

    public void agregarDetalle(DetalleVenta detalle) {
        detalles.add(detalle);
    }

    public double calcularTotal() {

        double total = 0;

        for (DetalleVenta d : detalles) {
            total += d.calcularSubtotal();
        }

        return total;
    }

    public String getCodigo() {
        return codigo;
    }
}