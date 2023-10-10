import java.util.*;
public class cadena{
    Scanner entrada  = new Scanner(System.in);
    public void cadenas(){
String s1 = " habia una vez un patito que decia miau miau , que queria un chocolatito";
System.out.println(" el tamaño de la cadena es " + s1.length());
//quiero saber si comienza con ??
System.out.println(" la cadena inicia V 0 F con la palabra Hola?" +
s1.startsWith("hola"));
// quiero saber si finaliza con ??
System.out.println(" la cadena fimnaliza  V o F con la palabra chocolatito?"
+ s1.endsWith("chocolatito"));
// ahora bamos a asignar una cadena mas apartir de una variable
System.out.println(" ingresa una palabra");
String s2 = entrada.nextLine();
//vamos a optener  el indice (donde inicia) las subcadenas de la palabra
System.out.println(" parte de una subcadena de s1 es :" + s1.indexOf("patito"));

// expresiones regulares ( CURP, RFC, MATRICULA,CORREO)

// vamos a sustraer palabras 
System.out.println(" primera parte del s1 " + s1.substring(12));
System.out.println(" segunda parte del s1 " + s1.substring(14, 20));

//vamos a convertir una variable lo que sea una cadena
int valor = 24;

// vamos a convertir de int a string 
String s3 = String.valueOf(valor);
System.out.println(" Asi es como se convierte un valor de :" + valor + " en cadena " + s3);
// si es un int 2 + 2 = 4
// si es una cadena de 2 + 2 = 22

// ahora al reves  de una cadena a cualquier valor 

String s4 = "20";
int numero = Integer.parseInt(s4);
System.out.println(" Asi es como se convierte una cadena de :" 
+ s4 + " en un valor " + numero);
int suma = valor + numero;
System.out.println(suma);

// ahora con dobles
String s5 ="542.265";
Double numero1 = Double.parseDouble(s5);
numero1 = valor + numero1;
System.out.println(numero1);

// vamos aconvertir otra forma un numero entero
Integer x = 5;
System.out.println(" el valor de "+ x.toString() + " ahora es una cadena");
System.out.println(" oytra forma de transformarlo"
 + Integer.toString(12)+ "ahoarv es una cadena");
    }
}
