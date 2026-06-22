package lavadero.vista;


import javax.swing.*;
import java.awt.*;


public class VentanaPrincipal extends JFrame {


    public VentanaPrincipal(){


        setTitle("Sistema Lavadero ABC");

        setSize(600,400);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(3,2,10,10));



        JButton btnClientes = new JButton("Clientes");

        btnClientes.addActionListener(e -> {

            FormCliente formulario =
            new FormCliente();

            formulario.setVisible(true);
            });

        JButton btnVehiculos = new JButton("Vehículos");

        btnVehiculos.addActionListener(e -> {

            FormVehiculo formulario =
            new FormVehiculo();

            formulario.setVisible(true);
            });
        JButton btnProductos = new JButton("Productos");

            btnProductos.addActionListener(e -> {
                
            FormProducto formulario =
            new FormProducto();

            formulario.setVisible(true);    
            });

        JButton btnServicios = new JButton("Servicios");

        btnServicios.addActionListener(e -> {

            FormServicio formulario =
            new FormServicio();

            formulario.setVisible(true);
            });

        JButton btnEmpleados = new JButton("Empleados");

        btnEmpleados.addActionListener(e -> {

            FormEmpleado formulario =
            new FormEmpleado();

            formulario.setVisible(true);
            });
        JButton btnVentas = new JButton("Ventas");

        btnVentas.addActionListener(e -> {

            FormVenta formulario =
            new FormVenta();

            formulario.setVisible(true);
            });



        panel.add(btnClientes);
        panel.add(btnVehiculos);
        panel.add(btnProductos);
        panel.add(btnServicios);
        panel.add(btnEmpleados);
        panel.add(btnVentas);



        add(panel);


    }


}