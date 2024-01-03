package Utilidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Telle
 */

import javax.swing.table.DefaultTableModel;


public class ModeloTabla  extends DefaultTableModel{
    String [] titulos;
Object[][] datos;
public ModeloTabla(){
    
}

// el primer constructor sera para cuanse se agreguen los datos con un titulo
public ModeloTabla(Object[][] datos,String[ ] titulos){
    super();
    this.titulos = titulos;
    this.datos=datos;
    setDataVector(datos,titulos);
    
}

//definir sinuna selda puede o no ser editada 

public boolean isCellEditable(int row,int columna){
    if(columna != Utilidades.PERFIL && columna !=Utilidades.EVENTO && 
            columna != Utilidades.NOTA1 && columna != Utilidades.NOTA2
            && columna != Utilidades.NOTA3){
        return false;
    }else{
       return true; 
    }
}
}
