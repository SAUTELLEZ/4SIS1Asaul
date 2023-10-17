import java.util.Scanner;

public class CadenaInvertida {
    //objeto para la entrada de datos 
    Scanner entrada = new Scanner (System.in);
    public void CadenaInvertidaPalabras(){
String cadena = "";

System.out.println(" ingres al aoracion que deseas invertir ");
cadena = entrada.nextLine();
// el chistes es poder invertir la cadena que ingresa el usuario
String invertida = "";
//habia una vez patito
//con un ciclo for 
for ( int i = cadena.length()-1; i >= 0; i--){
// obtengo los caracteres de la cadena 
char car = cadena.charAt(i);
invertida += car;

    }

    System.out.println("cadena invertida es : " + invertida);

}
}