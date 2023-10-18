import java.util.*;


public class palindromo {
  
    public static void main (String[] args){

    }
    Scanner entrada = new Scanner (System.in);
    public void espalindromo(){
   String cadena = "" ;
   System.out.println(" ingresa la palabra o la oracion para saber si es un palindromo ");
   cadena = entrada.nextLine();


   String invertida = "";


   for ( int i = cadena.length()-1; i >= 0; i--){
    if (cadena.charAt(i) == cadena.charAt(i)){
        char car = cadena.charAt(i);
         
        invertida = invertida + car;
   }

System.out.println(" la palabra invertida es " + invertida);

   if (cadena.equals(invertida)){
    System.out.println(" es palindromo");
   }
   else{
    System.out.println(" no es palindromo");
   }
   }

    }
    System.out.println(" deceas repetir el programa ?, escribe s para si")
}

