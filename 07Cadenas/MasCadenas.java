import java.util.*;
public class MasCadenas {
    Scanner entrada = new Scanner(System.in);
    public void masFuncionescadenas(){
        String s1 = new String(" hola habia ubna vez un patito");
        String s2 = " harry popote es magico";
         String s3 = " Feliz no cumpleaños";
          String s4= " FELIZ NO CUMPLEAÑOS";

          // vamos a concatenar cadenas 
          String salida = " cadenas a concatenar :" + s1 + "\n" + s2 + "\n" + s3 + "\n";
          //vamos a comprobar si dos cadenas son iguales 
          if ( s1.equals(" solo juguito con tigo")){
            // si es verdad 
            salida += " si es igual a la cadena  \n";
            System.out.println(salida);

          }else {
            salida +=" no es la misma cadena  \n";
            System.out.println(salida);
          }
          // si no me importa distinguir mayusculas de minusculas y quiero saber si dice 
          //el mismo mensaje
           if ( s3.equals(s4)){
            // si es verdad 
            salida += " si es igual a la cadena  \n";
            System.out.println(salida);

          }else {
            salida +=" no es la misma cadena  \n";
            System.out.println(salida);
          }
          //metodo compareto
         // salida += "\n s3 compareTo s4" + s3.compareTo(s4);
          //salida += "\n s1 compareTo s4" + s4.compareTo(s4);
          salida += "\n s3 compareTo s4" + s3.compareTo(s4);

          System.out.println(salida); 
          
          // obtener la posicion de un caracter 
          String s5 = " patito patito color de cafe";
          int pos = 0 ;
        pos = s5.indexOf('t', pos + 1);
        System.out.println(" la segunda t esta en la posicion " + pos);
    }
    
}
