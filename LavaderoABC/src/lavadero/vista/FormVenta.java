package lavadero.vista;


import javax.swing.*;
import java.awt.*;


public class FormVenta extends JFrame {


    public FormVenta(){


        setTitle("Ventas");

        setSize(400,300);

        setLocationRelativeTo(null);



        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(2,1,10,10));



        JButton crear = new JButton("Crear Orden de Venta");



        panel.add(crear);



        crear.addActionListener(e -> {

            JOptionPane.showMessageDialog(
                    null,
                    "Módulo de ventas en construcción"
            );

        });



        add(panel);


    }


}