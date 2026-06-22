package lavadero.vista;


import javax.swing.*;
import java.awt.*;

import lavadero.modelo.Categoria;
import lavadero.modelo.Servicio;



public class FormServicio extends JFrame {


    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtPrecio;
    private JTextField txtDescripcion;



    public FormServicio(){


        setTitle("Registro de Servicios");

        setSize(450,300);

        setLocationRelativeTo(null);



        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(5,2,10,10));



        panel.add(new JLabel("Código:"));

        txtCodigo = new JTextField();

        panel.add(txtCodigo);



        panel.add(new JLabel("Nombre:"));

        txtNombre = new JTextField();

        panel.add(txtNombre);



        panel.add(new JLabel("Precio:"));

        txtPrecio = new JTextField();

        panel.add(txtPrecio);



        panel.add(new JLabel("Descripción:"));

        txtDescripcion = new JTextField();

        panel.add(txtDescripcion);



        JButton guardar = new JButton("Guardar");

        panel.add(guardar);



        guardar.addActionListener(e -> {


            Categoria categoria = new Categoria(
                    "CAT02",
                    "Servicios",
                    ""
            );



            Servicio servicio = new Servicio(

                    txtCodigo.getText(),
                    txtNombre.getText(),
                    Double.parseDouble(txtPrecio.getText()),
                    txtDescripcion.getText(),
                    categoria

            );



            JOptionPane.showMessageDialog(
                    null,
                    "Servicio registrado:\n"
                    + servicio.getNombre()
            );



        });



        add(panel);


    }



}