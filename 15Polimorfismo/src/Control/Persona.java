/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.io.Serializable;

/**
 *
 * @author Telle
 * para poder aplicar el polimorfismo es necesario tener una clase de tipo abtracta
 * entendamos que una clase abtracta es aquella que podemos instanciar
 * de forma tal que sus elementos son abtractos
 * 
 * el definir abtracto es que pude cambiar de forma 
 * es acorde ala perspectiva de su comportamiento por ejemplo.
 * 
 * alumno 
 * docente
 * trabajador 
 * gerente 
 * empleado 
 * director 
 * 
 * o como barbie
 */
public  abstract class Persona implements Serializable {
   private String nombre;
   private int edad;
   public Persona (){
   }
   public Persona (String nombre , int edad){
       this.nombre=nombre;
       this.edad=edad;
       
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
// el metodo abstracto que nos ayuda a definir el<tipo de<persona 
    
    abstract  String tipoPersona();
}
