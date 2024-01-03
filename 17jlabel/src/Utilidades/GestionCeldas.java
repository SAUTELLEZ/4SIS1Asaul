package Utilidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Telle
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

public class GestionCeldas extends DefaultTableCellRenderer{
    // ESTA CLASE NOS PERMITE NGESTIONAR LA TABLA Y LOS EVENTOS QUE´Ç
    // SE VAN A REALIZAR DENTRO DE ELLA HACIUENDO 
    //QUE SEA UN OBJETO PERSONALIZABLE CADA CELDA
    
    private String tipo = "text";
    // definir los tipos de datos
    private Font normal= new Font("Verdana",Font.PLAIN,12);
     private Font bold= new Font("Verdana",Font.BOLD,12);
     private  JLabel label = new JLabel();
     // a qui van agregar los iconos de busqueda 
     private ImageIcon iconoGuardar = new  ImageIcon(getClass().
             getResource("/Recursos/nombredelelemento.png"));
     private ImageIcon iconoBuscar = new  ImageIcon(getClass().
             getResource("/Recursos/nombredelelemento.png"));
     
     public GestionCeldas(){
         
     }
     public GestionCeldas (String tipo){
         this.tipo = tipo;
     }
      // un metodo que se encarge de manipular la tabla
     public Component getTableCellRendererComponent(JTable table,
             Object value, boolean selected, boolean focused,
             int row, int columna){
         
         // definimos los colores 
         Color colorFondo =  null;
         Color colorFondoPorDefecto = new Color(192,192,192);
         Color colorFondoSeleccionado =new Color (140,140,140);
         // si la celda del evento esta seleccionada entonces asigno un color 
         
         if (selected){
             this.setBackground(colorFondoPorDefecto);
             
         }else{
             //para las que no esten seleccionadas
             this.setBackground(Color.WHITE);
         }
         // se definen los tipos de datos que contendran las celdas 
         // basado en la instancia y la bentana de la tabla
         // al momento de construirla
         
         if(tipo.equals("texto")){
             //si el< tipo de texto define el color de fondo y la celda
             
             if(focused){
                 colorFondo = colorFondoSeleccionado;
                 
             }else{
                 colorFondo = colorFondoPorDefecto;
             }
               this.setHorizontalAlignment(JLabel.LEFT);
         this.setText((String)value);
         this.setBackground((selected)? colorFondo: Color.WHITE) ;
         this.setFont(bold);
         
         return this;
         }
         // si el tipo es icono entoces valida cual icono es 
         if(tipo.equals("icono")){
             if(String.valueOf(value).equals("PERFIL")){
                 label.setIcon(iconoBuscar);
             }else if (String.valueOf(value).equals("EVENTO")){
                 label.setIcon(iconoGuardar);
                 
                
             }
             label.setHorizontalAlignment(JLabel.LEFT);
             label.setBorder(javax.swing.BorderFactory.createBevelBorder(
                     javax.swing.border.BevelBorder.RAISED));
             return label;
         }
       //cuando sea un numero 
            if (tipo.equals("NUMERICO")){
                if(focused){
                colorFondo = colorFondoSeleccionado;
            }else{
                colorFondo =colorFondoPorDefecto;
            }
             this.setHorizontalAlignment(JLabel.CENTER);
             this.setText((String)value);
             this.setForeground((selected)? new Color(255,255,255): new Color(32,117,32));
             this.setBackground((selected)? colorFondo : Color.MAGENTA);
             
             return this;
             
         }
     return this;
     
  
         
     }
}
     
    
