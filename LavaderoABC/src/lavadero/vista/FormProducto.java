package lavadero.vista;


import javax.swing.*;
import java.awt.*;

import lavadero.modelo.Categoria;
import lavadero.modelo.Producto;



public class FormProducto extends JFrame {


    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtMarca;
    private JTextField txtPrecio;
    private JTextField txtStock;



    public FormProducto(){


        setTitle("Registro de Productos");

        setSize(450,350);

        setLocationRelativeTo(null);



        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(6,2,10,10));



        panel.add(new JLabel("Código:"));

        txtCodigo = new JTextField();

        panel.add(txtCodigo);



        panel.add(new JLabel("Nombre:"));

        txtNombre = new JTextField();

        panel.add(txtNombre);



        panel.add(new JLabel("Marca:"));

        txtMarca = new JTextField();

        panel.add(txtMarca);



        panel.add(new JLabel("Precio:"));

        txtPrecio = new JTextField();

        panel.add(txtPrecio);



        panel.add(new JLabel("Stock:"));

        txtStock = new JTextField();

        panel.add(txtStock);



        JButton guardar = new JButton("Guardar");

        panel.add(guardar);



        guardar.addActionListener(e -> {


            Categoria categoria = new Categoria(
                    "CAT01",
                    "Productos",
                    ""
            );



            Producto producto = new Producto(

                    txtCodigo.getText(),
                    txtNombre.getText(),
                    txtMarca.getText(),
                    Double.parseDouble(txtPrecio.getText()),
                    Integer.parseInt(txtStock.getText()),
                    "Producto del lavadero",
                    categoria

            );



            JOptionPane.showMessageDialog(
                    null,
                    "Producto registrado:\n"
                    + producto.getNombre()
            );



        });



        add(panel);


    }



}