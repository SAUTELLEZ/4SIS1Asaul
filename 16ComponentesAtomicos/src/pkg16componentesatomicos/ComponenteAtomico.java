/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg16componentesatomicos;

import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Telle
 */
public class ComponenteAtomico extends Frame implements ActionListener,ChangeListener{
    
   private  Container contenedor;
   // declarar todos los componentes que vamos a utilizar
   JLabel labelTitulo;
   JLabel etiquetaLabel1;
   JLabel etiquetaboton;
   JLabel etiquetaToogleButton;
   JLabel etiquetaCheckbox;
   JLabel etiquetaRadioButton;
   JLabel etiquetaCombo;
   JLabel etiquetaSeparador;
   JLabel etiquetaSpinner;
   JLabel etiquetaDeslizador;
   JLabel etiquetaBarra;
   JButton boton;
   JCheckBox checkbox1,checkbox2;
   ButtonGroup gruporadio;
   JRadioButton radio1, radio2;
   JToggleButton tooglebutton;
   JComboBox combo;
   JSeparator separadorVertical, separadorHorizontal;
   JSpinner spinner;
   JSlider deslizador;
   JProgressBar barra;
    private Object java;
   
   public ComponenteAtomico (){
   //vamos acrear un metodo para iniciar las propiedades de los componentes
   iniciarcomponentes();
   //agregamos un titulo al contenedor 
   setTitle("JFrame de componentes atomicos");
   //tamaño 
   setSize(630,250);
   //poner la ventana en el centro
   setLocationRelativeTo(null);
   setResizable(false);
   
    }
  

    private void iniciarcomponentes() {
      contenedor = getContentPane();
      contenedor.setLayout(null);
      
      //definimos las propiedades de cada componente
      
      labelTitulo = new JLabel ();
      labelTitulo.setText("COMPONENTES ATOMICOS DE NETBEANS");
      labelTitulo.setFont(new java.awt.Font("Tahoma",1,20));
       labelTitulo.setBounds(180,5,380,40);
       
       etiquetaLabel1 = new JLabel();
        etiquetaLabel1.setText("esto es una etiqueta");
         etiquetaLabel1.setBounds(20, 50, 280, 25);
         
         etiquetaboton = new JLabel ();
         etiquetaboton.setText("ETIQUETA BOTON ");
         etiquetaboton.setBounds(20, 80, 80, 25);
         
         boton = new JButton();
         boton.setText("este es el boton ");
         boton.addActionListener(this);
         
         etiquetaCheckbox = new JLabel();
          etiquetaCheckbox.setText("Etuqueta checkbox");
           etiquetaCheckbox.setBounds(20, 110, 80, 25);
           
          checkbox1 = new JCheckBox();
          checkbox1.setText("cuadritos");
          checkbox1.setBounds(100, 110, 80, 25);
          
           
          checkbox2 = new JCheckBox();
          checkbox2.setText("cuadritos 2");
          checkbox2.setBounds(100, 110, 80, 25);
          
         etiquetaRadioButton = new JLabel();
         etiquetaRadioButton.setText("etiqueta de radio");
         etiquetaRadioButton.setBounds(20,140,100,23);
          
          
          gruporadio = new ButtonGroup();
          radio1 = new JRadioButton();
          radio1.setText("Radio button");
          radio1.setBounds(110, 140, 80, 25);
          
          radio2 = new JRadioButton();
          radio2.setText("Radio button");
          radio2.setBounds(190, 140, 80, 25);
          
          //agrupo
          gruporadio.add(radio1);
          gruporadio.add(radio2);
          
          etiquetaToogleButton =new JLabel();
          etiquetaToogleButton.setText("etiqueta toogle");
          etiquetaToogleButton.setBounds(20,180,100,25);
          
          tooglebutton = new JToggleButton();
          tooglebutton.setText("Activar");
          tooglebutton.setBounds(120,180,80,25);
          
          etiquetaCombo = new JLabel();
          etiquetaCombo.setText("Combox");
          etiquetaCombo.setBounds(350, 50, 100, 25);
          
          
          
          //AGREGA LAS OPCIONES DEL COMBO
          
          combo = new JComboBox();
          combo.addItem("Opcion");
          combo.addItem("Opcion1");
          combo.addItem("Opcion2");
          combo.addItem("Opcion3");
          combo.addItem("Opcion4");
          etiquetaCombo.setBounds(430,50,100,25);
          
          
          //debo decirle donde iniciar el indice para la lista
          
         combo.setSelectedIndex(0);
         
         separadorVertical = new JSeparator();
         separadorVertical.setOrientation(
         javax.swing.SwingConstants.VERTICAL);
         separadorVertical.setBounds(300,60,10,200);
         
         etiquetaSeparador = new JLabel();
         etiquetaSeparador.setText("separador");
         etiquetaSeparador.setBounds(350, 80, 100, 25);
         
         separadorHorizontal = new JSeparator();
         separadorHorizontal.setBounds(430,90,100,5);
         
         
        etiquetaSpinner = new JLabel();
        etiquetaSpinner.setText("JSpinner");
        etiquetaSpinner.setBounds(350,110,100,25);
        
         spinner = new JSpinner ();
         spinner.setBounds(430,110,50,25);
         spinner.addChangeListener(this);
         
         
        etiquetaDeslizador =new JLabel();
        etiquetaDeslizador.setText("deslizador");
        etiquetaDeslizador.setBounds(350, 140, 100, 25);
        
        deslizador = new JSlider(JSlider.HORIZONTAL,0,100,30);
        deslizador.setBounds(430, 140, 100, 30);
        deslizador.setPaintTicks(true);
        deslizador.setMajorTickSpacing(50);
        deslizador.setMinorTickSpacing(5);
        deslizador.setBorder(new TitledBorder("puede ser lo que sea"));
        deslizador.setValue(0);
        deslizador.addChangeListener(this);
        
        etiquetaBarra =new JLabel();
        etiquetaBarra.setText("Barra de progreso");
        etiquetaBarra.setBounds(350,180,100,25);
        
        barra = new JProgressBar();
        barra.setBounds(450, 180, 110, 20);
        
        //agragar todo
        contenedor.add(labelTitulo);
         contenedor.add(etiquetaLabel1);
        contenedor.add(etiquetaboton);
        contenedor.add(etiquetaCheckbox);
        contenedor.add(checkbox1);
        contenedor.add(checkbox2);
        contenedor.add(etiquetaRadioButton);
        contenedor.add(radio1);
        contenedor.add(radio2);
        contenedor.add(etiquetaToogleButton);
        contenedor.add(tooglebutton);
        contenedor.add(etiquetaCombo);
        contenedor.add(separadorHorizontal);
        contenedor.add(etiquetaSpinner);
        contenedor.add(spinner);
        contenedor.add(etiquetaDeslizador);
        contenedor.add(deslizador);
        contenedor.add(barra);
        contenedor.add(etiquetaBarra);
        contenedor.add(boton);
        
        
    }
   
   
   
   
   

    @Override
    public void actionPerformed(ActionEvent e) {
        //vamos a vlidar cuando se seleccione un check,un radioo el 
        //toogle tenga una accion
        
        if (e.getSource() == boton){
            String salida = "";
            salida = validaEventos();
            JOptionPane.showConfirmDialog(null, salida);
            
        
    }
    }
    @Override
    public void stateChanged(ChangeEvent e) {
     //estas acciones sirven para elementos de cambio de evemto
     //comompor ejemplo mantener o soltar el mause arrastrar,etc
     //en este caso sirven espesificamente para los deslizadores 
     
     int valor;
     if (e.getSource()== deslizador){
         valor = deslizador.getValue();
         barra.setValue(valor);
         spinner.setValue(valor);
     }
    }
        private String validaEventos() {
        String cadena = "selecciona: \n";
        if (checkbox1.isSelected()){
          cadena+="check1\n";  
        }
         if (checkbox2.isSelected()){
            cadena+="check2\n";  
         }
         if (radio1.isSelected()){
             cadena+="radio1\n"; 
         }
         if (radio2.isSelected()){
             cadena+="radio2\n"; 
         } 
          if (tooglebutton.isSelected()){
             cadena+="toogle activo\n"; 
         }else{
              cadena+="toogle inactivo\n";
          }
          cadena+=combo.getSelectedItem()+ "\n";
          return cadena;
    }
    
    



    

    
    
