/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Telle
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.ArrayList;

public class caja  extends JFrame implements ActionListener {

   
     private final String numeroTarjeta = "papis";
    private String pin = "1234"; // Ahora  variable
    private double saldo = 100.0;
    private final ArrayList<String> movimientos = new ArrayList<>();

    private final JLabel labelTarjeta = new JLabel("USUARIO:");
    private final JLabel labelPIN = new JLabel("PIN:");

    private final JTextField fieldTarjeta = new JTextField(10);
    private final JTextField fieldPIN = new JTextField(10);

    private final JButton botonIngresar = new JButton("Ingresar");
    private final JButton botonDepositar = new JButton("Depositar");
    private final JButton botonRetirar = new JButton("Retirar");
    private final JButton botonTransferir = new JButton("Transferir");
    private final JButton botonPagarServicio = new JButton("Pagar Servicio");
    private final JButton botonRecargarCelular = new JButton("Recargar Celular");
    private final JButton botonCambiarContraseña = new JButton("Cambiar Contraseña");
    private final JButton botonConsultaMovimientos = new JButton("Consulta de Movimientos");
    private final JButton botonEstadoCuenta = new JButton("Estado de Cuenta");
    
    
    
    
    public caja() {
        setTitle("CAJERO DEL PAPI");
        setSize(660, 430);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icono = new ImageIcon(getClass().getResource("CAJERO DEL PAPI.png"));
        setIconImage(icono.getImage());

        JPanel panelPrincipal = new JPanel(new GridLayout(5, 2));
        JPanel panelTarjeta = new JPanel();
        JPanel panelPIN = new JPanel();
        JPanel panelSaldo = new JPanel();
        JPanel panelBotones = new JPanel(new GridLayout(3, 3));
        
        
        
        panelTarjeta.add(labelTarjeta);
        panelTarjeta.add(fieldTarjeta);

        panelPIN.add(labelPIN);
        panelPIN.add(fieldPIN);

        panelBotones.add(botonIngresar);
        panelBotones.add(botonDepositar);
        panelBotones.add(botonRetirar);
        panelBotones.add(botonTransferir);
        panelBotones.add(botonPagarServicio);
        panelBotones.add(botonRecargarCelular);
        panelBotones.add(botonCambiarContraseña);
        panelBotones.add(botonConsultaMovimientos);
        panelBotones.add(botonEstadoCuenta);

        Border borde = BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY),
                BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panelTarjeta.setBorder(BorderFactory.createCompoundBorder(
                borde,
                BorderFactory.createLoweredBevelBorder()));
        panelPIN.setBorder(BorderFactory.createCompoundBorder(
                borde,
                BorderFactory.createLoweredBevelBorder()));
       

        panelPrincipal.add(panelTarjeta);
        panelPrincipal.add(panelPIN);
        panelPrincipal.add(panelBotones);
        panelPrincipal.add(panelSaldo);
        
         botonIngresar.addActionListener(this);
        botonIngresar.setPreferredSize(new Dimension(150, 100));
        botonIngresar.setBackground(new Color(204, 153, 255));
        botonDepositar.addActionListener(this);
        botonDepositar.setPreferredSize(new Dimension(150, 100));
        botonDepositar.setBackground(new Color(204, 153, 255));
        botonRetirar.addActionListener(this);
        botonRetirar.setPreferredSize(new Dimension(150, 100));
        botonRetirar.setBackground(new Color(204, 153, 255));
        botonTransferir.addActionListener(this);
        botonTransferir.setPreferredSize(new Dimension(150, 100));
        botonTransferir.setBackground(new Color(204, 153, 255));
        botonPagarServicio.addActionListener(this);
        botonPagarServicio.setPreferredSize(new Dimension(150, 100));
        botonPagarServicio.setBackground(new Color(204, 153, 255));
        botonRecargarCelular.addActionListener(this);
        botonRecargarCelular.setPreferredSize(new Dimension(150, 100));
        botonRecargarCelular.setBackground(new Color(204, 153, 255));
        botonCambiarContraseña.addActionListener(this);
        botonCambiarContraseña.setPreferredSize(new Dimension(150, 100));
        botonCambiarContraseña.setBackground(new Color(204, 153, 255));
        botonConsultaMovimientos.addActionListener(this);
        botonConsultaMovimientos.setPreferredSize(new Dimension(150, 100));
        botonConsultaMovimientos.setBackground(new Color(204, 153, 255));
        botonEstadoCuenta.addActionListener(this);
        botonEstadoCuenta.setPreferredSize(new Dimension(150, 100));
        botonEstadoCuenta.setBackground(new Color(204, 153, 255));

       add(panelPrincipal);

        setVisible(true);
    
    
        
            
        }

     @Override
      public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonIngresar) {
            String numeroTarjetaIngresado = fieldTarjeta.getText();
            String pinIngresado = fieldPIN.getText();
            if (numeroTarjetaIngresado.equals(numeroTarjeta) && pinIngresado.equals(pin)) {
                ImageIcon icono = new ImageIcon("examen3/src/tarjenta-removebg-preview.png");
                JOptionPane.showMessageDialog(this, "Bienvenido " 
                        + numeroTarjetaIngresado, "Ingreso Exitoso",
                        JOptionPane.INFORMATION_MESSAGE, icono);
                
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o PIN incorrectos",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == botonDepositar) {
            String montoIngresado = JOptionPane.showInputDialog(this, "Ingrese el monto a depositar:");
            if (montoIngresado != null && !montoIngresado.isEmpty()) {
                saldo += Double.parseDouble(montoIngresado);
                
                ImageIcon icono = new ImageIcon("Examen3/src/money-removebg-preview.png");
                JOptionPane.showMessageDialog(this, "Depósito exitoso", "Operación exitosa",
                        JOptionPane.INFORMATION_MESSAGE, icono);
            }
        } else if (e.getSource() == botonRetirar) {
            String montoIngresado = JOptionPane.showInputDialog(this, "Ingrese el monto a retirar:");
            if (montoIngresado != null && !montoIngresado.isEmpty()) {
                double montoARetirar = Double.parseDouble(montoIngresado);
                if (montoARetirar > saldo) {
                    ImageIcon icono = new ImageIcon("Examen3/src/error.png");
                    JOptionPane.showMessageDialog(this, 
                            "No cuenta con suficiente saldo para realizar el retiro",
                            "Error", JOptionPane.ERROR_MESSAGE, icono);
                } else {
                    saldo -= montoARetirar;
                   
                    ImageIcon icono = new ImageIcon("Examen3/src/felicidades.png");
                    JOptionPane.showMessageDialog(this, "Retiro exitoso", "Operación exitosa",
                            JOptionPane.INFORMATION_MESSAGE, icono);
                }
            }
        } else if (e.getSource() == botonTransferir) {
            String nombreDestinatario = JOptionPane.showInputDialog(this, 
                    "Ingrese el nombre del destinatario:");
            String numeroCuentaDestinatario = JOptionPane.showInputDialog(this, 
                    "Ingrese el número de cuenta del destinatario:");
            String nombreBancoDestinatario = JOptionPane.showInputDialog(this, 
                    "Ingrese el nombre del banco del destinatario:");

            double montoTransferencia = Double.parseDouble(JOptionPane.showInputDialog(this, 
                    "Ingrese el monto a transferir:"));

            if (saldo >= montoTransferencia) {
                saldo -= montoTransferencia;
                movimientos.add("Transferencia a " + nombreDestinatario + " (" + numeroCuentaDestinatario + " - " + 
                        nombreBancoDestinatario + "): $" + montoTransferencia);
                JOptionPane.showMessageDialog(this, "Transferencia exitosa", 
                        "Operación exitosa", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, 
                        "Saldo insuficiente para realizar la transferencia", "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
            
        } else if (e.getSource() == botonPagarServicio) {
            String numeroServicio = JOptionPane.showInputDialog(this, 
                    "Ingrese el número de servicio (10 dígitos):");

            double montoPago = Double.parseDouble(JOptionPane.showInputDialog(this, 
                    "Ingrese el monto a pagar por el servicio:"));

            if (saldo >= montoPago) {
                saldo -= montoPago;
                movimientos.add("Pago de servicio (Número de servicio: " + numeroServicio + "): $" + montoPago);
                JOptionPane.showMessageDialog(this, "Pago exitoso", 
                        "Operación exitosa", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, 
                        "Saldo insuficiente para realizar el pago", "Error", JOptionPane.ERROR_MESSAGE);
            }
           
        } else if (e.getSource() == botonRecargarCelular) {
            String numeroCelular = JOptionPane.showInputDialog(this, 
                    "Ingrese el número de celular (solo números):");

            // Precios de recarga disponibles
            String[] opcionesRecarga = {"50", "100", "200", "500"};
            String montoRecargaSeleccionado = (String) JOptionPane.showInputDialog(this,
                    "Seleccione el monto de recarga:",
                    "Recarga de Celular",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcionesRecarga,
                    opcionesRecarga[0]);

            if (montoRecargaSeleccionado != null) {
                double montoRecarga = Double.parseDouble(montoRecargaSeleccionado);
                saldo -= montoRecarga;
                movimientos.add("Recarga de celular (Número de celular: " + numeroCelular + "): -$" + montoRecarga);
                JOptionPane.showMessageDialog(this, "Recarga de celular exitosa", "Operación exitosa",
                        JOptionPane.INFORMATION_MESSAGE);
            }


        } else if (e.getSource() == botonCambiarContraseña) {
            String nombreUsuario = JOptionPane.showInputDialog(this, "Ingrese su nombre de usuario:");
            String contraseñaActual = JOptionPane.showInputDialog(this, "Ingrese su contraseña actual:");

            if (nombreUsuario.equals(numeroTarjeta) && contraseñaActual.equals(pin)) {
                String nuevaContraseña = JOptionPane.showInputDialog(this, "Ingrese su nueva contraseña:");
                pin = nuevaContraseña;
                JOptionPane.showMessageDialog(this, 
                        "Contraseña cambiada con éxito", "Operación exitosa", 
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, 
                        "Nombre de usuario o contraseña incorrectos", "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == botonConsultaMovimientos) {
            StringBuilder movimientosText = new StringBuilder("Movimientos:\n");
            for (String movimiento : movimientos) {
                movimientosText.append("- ").append(movimiento).append("\n");
            }
            JOptionPane.showMessageDialog(this, movimientosText.toString(), 
                    "Consulta de Movimientos", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == botonEstadoCuenta) {
            JOptionPane.showMessageDialog(this, 
                    "Saldo actual: $" + saldo, "Estado de Cuenta", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
         
   
}
public static void main(String[] args) {
        new caja();
    }
    
    
}
