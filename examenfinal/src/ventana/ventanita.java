/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventana;

/**
 *
 * @author Telle
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
public class ventanita  extends JFrame implements MouseListener{
  
    
    
    
    
    //constructor
    public ventanita (){
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(1120,450);
       iniciarComponentes();
       setLocationRelativeTo(null);
       construirTabla();
        
    }
  

    private void iniciarComponentes() {
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
    }

    private void construirTabla() {
       
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   
       
       
    
    

  

  
}
