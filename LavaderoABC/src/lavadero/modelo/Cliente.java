package lavadero.modelo;

import java.util.ArrayList;


public class Cliente {

    private int idCliente;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;

    private ArrayList<Vehiculo> vehiculos;


    public Cliente(
            int idCliente,
            String nombres,
            String apellidos,
            String telefono,
            String correo
    ) {

        this.idCliente = idCliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;

        this.vehiculos = new ArrayList<>();
    }


    public void agregarVehiculo(Vehiculo vehiculo){

        vehiculos.add(vehiculo);

    }


    public String getNombreCompleto(){

        return nombres + " " + apellidos;

    }


    public int getIdCliente(){

        return idCliente;

    }


    public String getTelefono(){

        return telefono;

    }


    public String getCorreo(){

        return correo;

    }
    public String getNombres(){

    return nombres;

    }


    public String getApellidos(){

    return apellidos;

    }
}