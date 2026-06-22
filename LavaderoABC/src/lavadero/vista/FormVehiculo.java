package lavadero.vista;


import javax.swing.*;
import java.awt.*;

import lavadero.modelo.Vehiculo;


public class FormVehiculo extends JFrame {


    private JTextField txtPlaca;
    private JTextField txtMarca;
    private JTextField txtTipo;
    private JTextField txtColor;


    public FormVehiculo(){


        setTitle("Registro de Vehículos");

        setSize(400,300);

        setLocationRelativeTo(null);


        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(5,2,10,10));



        panel.add(new JLabel("Placa:"));

        txtPlaca = new JTextField();

        panel.add(txtPlaca);



        panel.add(new JLabel("Marca:"));

        txtMarca = new JTextField();

        panel.add(txtMarca);



        panel.add(new JLabel("Tipo:"));

        txtTipo = new JTextField();

        panel.add(txtTipo);



        panel.add(new JLabel("Color:"));

        txtColor = new JTextField();

        panel.add(txtColor);



        JButton guardar = new JButton("Guardar");

        panel.add(guardar);



        guardar.addActionListener(e -> {


            Vehiculo vehiculo = new Vehiculo(

                txtPlaca.getText(),
                txtMarca.getText(),
                txtTipo.getText(),
                txtColor.getText()

            );


            JOptionPane.showMessageDialog(
                null,
                "Vehículo registrado:\n"
                + vehiculo.getPlaca()
            );


        });



        add(panel);


    }


}