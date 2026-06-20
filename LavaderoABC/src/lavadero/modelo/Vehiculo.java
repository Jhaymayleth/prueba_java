package lavadero.modelo;


public class Vehiculo {


    private String placa;
    private String marca;
    private String tipo;
    private String color;


    public Vehiculo(
            String placa,
            String marca,
            String tipo,
            String color
    ){

        this.placa = placa;
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;

    }



    public String getPlaca(){

        return placa;

    }


    public String getMarca(){

        return marca;

    }


    public String getTipo(){

        return tipo;

    }


    public String getColor(){

        return color;

    }

}