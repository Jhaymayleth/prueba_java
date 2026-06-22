package lavadero.vista;


import javax.swing.*;
import java.awt.*;

import lavadero.modelo.Cliente;



public class FormCliente extends JFrame {


    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtTelefono;
    private JTextField txtCorreo;


    public FormCliente(){


        setTitle("Registro de Clientes");

        setSize(400,300);

        setLocationRelativeTo(null);



        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(5,2,10,10));



        panel.add(new JLabel("Nombre:"));

        txtNombre = new JTextField();

        panel.add(txtNombre);



        panel.add(new JLabel("Apellido:"));

        txtApellido = new JTextField();

        panel.add(txtApellido);



        panel.add(new JLabel("Teléfono:"));

        txtTelefono = new JTextField();

        panel.add(txtTelefono);



        panel.add(new JLabel("Correo:"));

        txtCorreo = new JTextField();

        panel.add(txtCorreo);



        JButton guardar = new JButton("Guardar");


        panel.add(guardar);



        guardar.addActionListener(e -> {


            Cliente cliente = new Cliente(

                1,
                txtNombre.getText(),
                txtApellido.getText(),
                txtTelefono.getText(),
                txtCorreo.getText()

            );


            JOptionPane.showMessageDialog(
                    null,
                    "Cliente registrado:\n"
                    + cliente.getNombreCompleto()
            );


        });



        add(panel);


    }


}