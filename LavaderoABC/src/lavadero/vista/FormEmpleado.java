package lavadero.vista;


import javax.swing.*;
import java.awt.*;

import lavadero.modelo.Empleado;



public class FormEmpleado extends JFrame {


    private JTextField txtId;
    private JTextField txtNombres;
    private JTextField txtApellidos;
    private JTextField txtDocumento;
    private JTextField txtCorreo;
    private JTextField txtTelefono;



    public FormEmpleado(){


        setTitle("Registro de Empleados");

        setSize(450,350);

        setLocationRelativeTo(null);



        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(7,2,10,10));



        panel.add(new JLabel("ID:"));
        txtId = new JTextField();
        panel.add(txtId);



        panel.add(new JLabel("Nombres:"));
        txtNombres = new JTextField();
        panel.add(txtNombres);



        panel.add(new JLabel("Apellidos:"));
        txtApellidos = new JTextField();
        panel.add(txtApellidos);



        panel.add(new JLabel("Documento:"));
        txtDocumento = new JTextField();
        panel.add(txtDocumento);



        panel.add(new JLabel("Correo:"));
        txtCorreo = new JTextField();
        panel.add(txtCorreo);



        panel.add(new JLabel("Teléfono:"));
        txtTelefono = new JTextField();
        panel.add(txtTelefono);



        JButton guardar = new JButton("Guardar");
        panel.add(guardar);



        guardar.addActionListener(e -> {


            Empleado empleado = new Empleado(

                    Integer.parseInt(txtId.getText()),
                    txtNombres.getText(),
                    txtApellidos.getText(),
                    txtDocumento.getText(),
                    txtCorreo.getText(),
                    txtTelefono.getText()

            );


            JOptionPane.showMessageDialog(
                    null,
                    "Empleado registrado:\n" +
                    empleado.getNombreCompleto()
            );

        });



        add(panel);


    }


}