package lavadero.modelo;

import java.util.ArrayList;

public class Empleado {

    private int idEmpleado;
    private String nombres;
    private String apellidos;
    private String documento;
    private String correo;
    private String telefono;

    private Contrato contrato;

    private ArrayList<Cargo> cargos;


    public Empleado(int idEmpleado, String nombres, String apellidos,
                    String documento, String correo, String telefono) {

        this.idEmpleado = idEmpleado;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento = documento;
        this.correo = correo;
        this.telefono = telefono;

        this.cargos = new ArrayList<>();
    }


    public void agregarCargo(Cargo cargo) {
        cargos.add(cargo);
    }


    public String getNombreCompleto() {
        return nombres + " " + apellidos;
    }

    public int getIdEmpleado(){

    return idEmpleado;

    }
}