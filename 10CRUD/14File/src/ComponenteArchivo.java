/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Telle
 */

import java.awt.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 

import java.io.*;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.*;
import javax.swing.*;

//vamos a crear  una clase que nos permita cargar un archivo desde una ventana 
public class ComponenteArchivo {
    // las variables 
    private Container contenedor;
    JLabel labeltitulo;
    JTextArea areatexto;
    JButton botonabrir;
    JButton botonguardar;
    JScrollPane scrollpane;
    JFileChooser filechooser;
    String texto;
    
    public ComponenteArchivo(){
        contenedor = getContentPane();
        contenedor.setLayout(null);
     
        // hacemos una instancia del objeto de archivos 
        
        filechooser = new JFileChooser();
        labeltitulo = new JLabel ();
        labeltitulo.setText("componente de JFileChooser");
        labeltitulo.setBounds(110, 290, 180, 25);
        
        
        areatexto = new JTextArea();
        //ajustamos el texto dentro del text tarea 
        areatexto.setLineWrap(true);
        //para que no queden las palabras incompletas y se haga su 
        areatexto.setWrapStyleWord(true);
        
        
        //vamos agregar el scroll
        scrollpane = new JScrollPane();
        scrollpane.setBounds(20,50,350,270);
        scrollpane.setViewportView(areatexto);
        
         botonabrir = new JButton ();
         botonabrir.setText("Abrir");
         botonabrir.setBounds(100,330,80,25);
         botonabrir.addActionListener((ActionListener) this);
         
         
         botonguardar = new JButton();
         botonguardar.setText("Guardar");
         botonguardar.setBounds(220,3330,80,25);
         botonguardar.addActionListener((ActionListener) this);
         
         //hay que agrgarlos en el contenedor 
         contenedor.add(labeltitulo);
         contenedor.add(scrollpane);
         contenedor.add(botonabrir);
   contenedor.add(botonguardar);
   
   //que se vea 
   setTitle("Ventana de JFileChooser");
   setSize(400,400);
   setLocationRelativeTo(null);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
         
         
         
        
        
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()== botonabrir){
            try{
                String archivo = abrirArcchivo();
                
                
            }catch (Exception ex){
               System.out.println("Error" + ex.getMessage());
               System.out.println("Fuente" + ex.getStackTrace());
        }
            
        }
        if(e.getSource() == botonguardar){
            try{
            guardarArchivo();
        }catch (Exception ex){
    }

    private String abrirArcchivo()  throws Exception{
        //necesitamos poder abrir el archivo
        String aux = "";
        texto = "";
        
        try {
            //lo primero que necesitamos es cargar la ventana del archivo
            filechooser.showOpenDialog(this);
            //abrimos el archivo
            File abre = filechooser.getSelectedFile();
            
            //vamos a ver la ruta del arcgivo
            System.out.println(abre.getAbsoluteFile());
            System.out.println(abre.getAbsolutePath());
            System.out.println(abre.getPath());
            
            try {
                //comando para que ejecute el archivo
            }catch (IOException ioe){
                
                //ya valio 
                System.out.println("Error feo" + ioe.getMessage());
            }
                Runtime.getRuntime().exec("cmd / c start " + abre);
            }
            if(abre!=null){
                //vamos a ocupar un buffer para recorrer los elementos del archivo
                FileReader archivos = new FileReader(abre);
                BufferedReader lee = new BufferedReader(archivos);
                
                //como no sabesmos cuanta informacion tiene ocupamos un while
        while ((aux = lee.readLine()) !=null){
            texto += aux +"/n";
        }
        lee.close();
                
            }
        }catch (Exception e){
            System.out.println(" Error" + e.getMessage());
            System.out.println(e.getStackTrace());
            
        }
        return texto;
            
        }
        
        
        
        
        
        
       private void guardarArchivo() throws Exception{
       try{
           String nombre = "";
           JFileChooser file = new JFileChooser();
           //mostramos el elemento para guardar el archivo
           file.showSaveDialog(this);
           //con esto escogemos un archivo
           File guardar = file.getSelectedFile();
           
           if (guardar != null) {
               //0btenemos el nombre del archivo
               nombre = file.getSelectedFile().getName();
               //tenemos que guardarlo acorde al formato que queremos 
               FileWriter save = new FileWriter(guardar + " .txt");
               save.write(areatexto.getText());
               save.close();
               JOptionPane.showMessageDialog(null,
                       "/n El archivo se guardo con exito /n");
               
           }
           
       }catch(Exeption e){
            System.out.println(" Error" + e.getMessage());
            System.out.println(e.getStackTrace());
            
       }
    }  
        
        
    private Container getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setTitle(String ventana_de_JFileChooser) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

   

    
    }

    

