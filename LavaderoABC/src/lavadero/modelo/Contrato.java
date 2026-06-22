package lavadero.modelo;

import java.util.Date;

public class Contrato {

    private Date fechaInicio;
    private double sueldoBase;
    private String horario;

    public Contrato(Date fechaInicio, double sueldoBase, String horario) {
        this.fechaInicio = fechaInicio;
        this.sueldoBase = sueldoBase;
        this.horario = horario;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }
}