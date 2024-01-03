/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author Telle
 */

import java.io.*;
import java.util.*;
import java.swing.*;
import javax.swing.JOptionPane;
public class Funciones {
    //bamos a crear una lista de personas para regidtrar
    ArrayList<Persona>Listapersonas=new ArrayList();
    
    //VARIABLES
    String rep ="si";
    String nombre = "";
    // aqui viene donde aplicamos el polimorfismo
    //ya que vamos a transformar una persona
    
    Persona profesor = new Profesor();
    Persona alumno = new Alumno();
    private int num_;
    private Integer edad;
    private int num_empleado;
    
     public void menu(int boleta, int bol){
        while (true){
            while(rep.equalsIgnoreCase("si")){
                try{
                    String var = JOptionPane.showInputDialog(
                            "ingrese la opcion deceada : \n"
                    + "1.- Registrar nuevo Profesor\n"
                    + " 2.- Registrar nuevo Alumno\n"
                    + " 3.- Registrar Alumno\n" );
                    if (var == null){
                        System.exit(0);
                 }
                    int opcion = Integer.parseInt(var);
                    switch (opcion){
                        case 1 -> {
                            //metodo para solicitar datos
                            PedirDatosProfesor();
                            //se los asigno aun objeto profesor
                            profesor = new Profesor (num_empleado,nombre,edad);
                            //metodo para guardarlo 
                            guardarProfesor();
                        }
                        case 2 -> {
                            //metodo para solicitar datos
                            PedirDatosAlumno();
                            //se los asigno aun objeto profesor
                            profesor = new Alumno(bol, nombre, edad);
                            //metodo para guardarlo 
                            guardarAlumno();
                        }
                            
                        case 3 -> //metodo para leer el archivo de alumnos 
                            leerAlumno();
                            
                        default -> System.out.println("Opcion no valida");
                    }
                    rep = JOptionPane.showInputDialog("Deseas Repetir");
                    
                }catch(Exception e){
                    System.out.println("Error :" + e.getMessage());
                }
            }
        }
    }

    private void PedirDatosProfesor() {
      num_empleado= Integer.parseInt(JOptionPane.showInputDialog(""
              + "ingresa el numero de empleado del profesor "))   ;
      nombre = JOptionPane.showInputDialog(
              "ingresa el nombre del profesor");
      edad = Integer.parseInt(  JOptionPane.showInputDialog(
              "ingresa la edad del Profesor"));
      
    }

    private void guardarProfesor()throws Exception{
      //vamos acrear un metodo para guardarlos
      Listapersonas.add(profesor);
         guardar();
      
    }

    private void PedirDatosAlumno throws Exception (){
        
        int bol = Integer.parseInt(JOptionPane.showInputDialog( ""
                + "ingresa el numero de boleta del alumno "));
      nombre = JOptionPane.showInputDialog(
              "ingresa el nombre del profesor");
      edad = Integer.parseInt(  JOptionPane.showInputDialog(
              "ingresa la edad del Profesor"));
      
       
    }

    private void guardarAlumno() throws Exception{
         //vamos acrear un metodo para guardarlos
      Listapersonas.add(alumno);
      guardar();
      
    }

    private void leerAlumno() throws Exception{
        /*
        aqui es donde se va aplicar la serializacion para generar 
        un archivo donde se pueda guardar los datos de la lista de personas 
        para eso vamos a ocupar flujos para crear el archivo
        */
        FileInputStream archivo= new FileInputStream("archivo");
        //ocupamos un buffer para los datos objetos
        ObjectInputStream entrada = new ObjectInputStream(archivo);
        //vamos a transformar los datos de acuerdo a la entrada de datos 
        Listapersonas = (ArrayList)entrada.readObject();
        //ya que la puede leer vamos  a recorrerla
        for (int i = 0; i < Listapersonas.size();i++){
            //conforme vaya leyendo devemos asignar los datos
            Alumno obj = (Alumno)Listapersonas.get(i);//identificador
            //desplegamos la informacion
            JOptionPane.showMessageDialog(null), "\n" 
            + "Numero de alumnos registrados :"+ "\n"
            +"Boleta:" + obj.getBoleta() + "\n"
                    +"Nombre" + obj.getNombre()+"\n"
                    + " Edad" + obj.getEdad() + "\n"
                    + " Tipo de persona" + obj.tipoPersona() + "\n";
        }
     
    }

    private void guardar()  throws Exception{
        // aqui vamos acrear  el archivo que es el que se graba con la informacion 
        FileOutputStream archivo = new FileOutputStream("archivo");
                ObjectOutputStream salida = new ObjectOutputStream(archivo);
                //vamos a escribir los datos 
                salida.writeObject(Listapersonas);
                salida.close();
                
        
    }
    
    
}

   

   
