/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylistpersona;

/**
 *
 * @author Telle
 */
public class Persona{
    private int id;
    private String nombre;
    private int edad;
    // apellido paterno y materno
    // direccion 
    //colonia 
    // telefono
    //codigo postal
    public Persona(){

    }
    public Persona(int id, String nombre, int edad){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad ;

    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;

    }
    public String getNombtre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;

    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;

    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
