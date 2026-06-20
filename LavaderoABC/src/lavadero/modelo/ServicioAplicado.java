package lavadero.modelo;

import java.util.Date;

public class ServicioAplicado {

    private Date fechaInicio;
    private Date fechaFin;
    private String descripcion;

    private Vehiculo vehiculo;
    private Empleado empleado;
    private Cubiculo cubiculo;
    private Servicio servicio;

    public ServicioAplicado(Vehiculo vehiculo, Empleado empleado,
                            Cubiculo cubiculo, Servicio servicio,
                            String descripcion) {

        this.fechaInicio = new Date();
        this.vehiculo = vehiculo;
        this.empleado = empleado;
        this.cubiculo = cubiculo;
        this.servicio = servicio;
        this.descripcion = descripcion;
    }

    public void finalizarServicio() {
        this.fechaFin = new Date();
        cubiculo.liberar();
    }
}