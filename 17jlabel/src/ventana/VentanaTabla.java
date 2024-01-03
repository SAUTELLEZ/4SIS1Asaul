/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventana;

/**
 *
 * @author Telle
 */
import Persona.Persona;
import Utilidades.GestionCeldas;
import Utilidades.ModeloTabla;
import Utilidades.Utilidades;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
public class VentanaTabla  extends JFrame implements MouseListener {
    
    //definir las variables 
    private JPanel contentPanel;
    private JScrollPane scrollPaneTable;
    private JTable tablaPersonas;
    ArrayList<Persona> listapersonas;
    ModeloTabla modelo;
    private int filasTabla;
    private int ColumnasTabla;
    
    //constructor
    
    public VentanaTabla(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(1120,450);
       iniciarComponentes();
       setLocationRelativeTo(null);
       construirTabla();
       
        
        
    }
    private void iniciarComponentes() {
     contentPanel = new JPanel();
     contentPanel.setBorder(new EmptyBorder(5,5,5,5));
     setContentPane(contentPanel);
     contentPanel.setLayout(new BorderLayout(0,0));
     
     JLabel  lbltablapersonas = new JLabel("Tabla Pwçersonas");
     lbltablapersonas.setFont(
     new Font("verdana",Font.BOLD,25));
     contentPanel.add(lbltablapersonas,BorderLayout.NORTH);
     
           scrollPaneTable  = new JScrollPane();
           contentPanel.add(scrollPaneTable);
           
           tablaPersonas = new JTable();
           tablaPersonas.setBackground(Color.WHITE);
           tablaPersonas.setBorder(
           new BevelBorder(BevelBorder.RAISED,null,null));
     tablaPersonas.addMouseListener(this);
     tablaPersonas.setOpaque(false);
     scrollPaneTable.setViewportView(tablaPersonas);
     
     
     
    }

    private void construirTabla() {
        //imaginar como es que serian los elementos de la misma 
        listapersonas = consultarListaPersonas ();
        ArrayList<String>titulolista = new  ArrayList<>();
        titulolista.add("Documento");
         titulolista.add("Nombre");
          titulolista.add("Direccion");
           titulolista.add("Telefono");
            titulolista.add("Profesion");
             titulolista.add("Edad");
              titulolista.add("nota1");
               titulolista.add("nota2");
                titulolista.add("nota3");
                 titulolista.add("Promedio");
                  titulolista.add("");
         titulolista.add("");
         // se deben asignar las columnaas del arreglo apara enviarv al momento
         // de construir la tabla
         
         String titulos[] = new String[titulolista.size()];
         for (int i = 0; i< titulos.length; i++){
             titulos[i] = titulolista.get(i);
             
         }
         // obtenemos los datoz de la lista y los guardamos en la 
         //matriz
         Object[][] data = obtenerMatrizDatos(titulolista);
         construirTabla(titulos,data);
        
    }
            private ArrayList<Persona> consultarListaPersonas() {
                //precarga de datos 
                ArrayList<Persona> lista = new ArrayList<>();
                lista.add(new Persona("1234","Juanito Perez Montecionos"," vive por ahi ",
                        "1234567890", "inge",20,6,7,8,(6+7+8)/30));
                lista.add(new Persona("56789","Diana Perez Montecionos"," vive por ahi ",
                        "1234567890", "marca",20,6,7,8,(6+7+8)/30));
                
                return lista;
       
    }

    private Object[][] obtenerMatrizDatos(ArrayList<String> tituloslista) {
        // esta matriz debe de ser dinamica pues corresponde 
        //a todos los usuarios 
        String informacion[][] = new String [listapersonas.size()][tituloslista.size()];
        //vamos a llenar la matriz 
        for ( int x = 0; x < informacion.length; x++){
            informacion[x][Utilidades.DOCUMENTO]= listapersonas.get(x).getDocumento()+ "";
            informacion[x][Utilidades.NOMBRE]= listapersonas.get(x).getNombre()+ "";
            informacion[x][Utilidades.DIRECCION]= listapersonas.get(x).getDireccion()+ "";
            informacion[x][Utilidades.TELEFONO]= listapersonas.get(x).getTelefono()+ "";
            informacion[x][Utilidades.PROFESION]= listapersonas.get(x).getProfesion()+ "";
            informacion[x][Utilidades.EDAD]= listapersonas.get(x).getEdad()+ "";
            informacion[x][Utilidades.NOTA1]= listapersonas.get(x).getNota1()+ "";
            informacion[x][Utilidades.NOTA2]= listapersonas.get(x).getNota2()+ "";
            informacion[x][Utilidades.NOTA3]= listapersonas.get(x).getNota3()+ "";
            informacion[x][Utilidades.PROMEDIO]= listapersonas.get(x).getPromedio()+ "";
            // los ultimos son para los eventos 
            informacion[x][Utilidades.PERFIL]=  "PERFIL ";
            informacion[x][Utilidades.EVENTO]= "EVENTO";
        }
        return informacion;    
      
    }
    private void construirTabla(String[] titulos, Object[][] data) {
        modelo = new ModeloTabla(data,titulos);
        // le asigno el modelo a la tabala 
        tablaPersonas.setModel(modelo);
        filasTabla = tablaPersonas.getRowCount();
        
        // le asingo el tipo de datos que tendran las celdas 
        // de cada columna definida
        
        tablaPersonas.getColumnModel().getColumn(Utilidades.EDAD).setCellRenderer(
        new GestionCeldas("numerico"));
           tablaPersonas.getColumnModel().getColumn(Utilidades.NOTA1).setCellRenderer(
        new GestionCeldas("numerico"));
              tablaPersonas.getColumnModel().getColumn(Utilidades.NOTA2).setCellRenderer(
        new GestionCeldas("numerico"));
                 tablaPersonas.getColumnModel().getColumn(Utilidades.NOTA3).setCellRenderer(
        new GestionCeldas("numerico"));
                    tablaPersonas.getColumnModel().getColumn(Utilidades.PROMEDIO).setCellRenderer(
        new GestionCeldas("numerico"));
                       tablaPersonas.getColumnModel().getColumn(Utilidades.PERFIL ).setCellRenderer(
        new GestionCeldas("icono"));
                          tablaPersonas.getColumnModel().getColumn(Utilidades.EVENTO).setCellRenderer(
        new GestionCeldas("icono"));
                          
         // debenos recorrer el resto y asignar los datos 
    
    for (int i =0; i< titulos.length-7; i++){
        System.out.println(i);
        
    }
        
        
        
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
