import java.util.*;

import javax.sound.sampled.SourceDataLine;
//unidemensional
public class ArreglosMatriz {
    public void main (String[] args){
        //vamos a realizar un arreglo unidemmensional y correrlo para ver que hay 
        //en cada elemento


        //como se define un arreglo
        int arreglo[] = new int (10);
        //estoy difiniendo un entero de ta,año 10

        int valor ;
        Scanner entrada = new Scanner (System.in);
        // vamos a recorrerlo con un bucle ,debido que conocemos el num de elementos
        for(int i = 0 ; i < arreglo.length; i++);
        System.out.println(" ingresa el valor de la posiscion del arreglo");
        arreglo[i] = entrada.nextInt();

    }
    // para saber que almacenamos
    for(int j = 0 ; j < arreglo.length; j++);
        System.out.println(" El valor almacenado es :" + arreglo[j] + "valor");

        //bidemensional


        Scanner entrada = new Scanner(System.in);
        int matriz [][] = new int [3][3];

        // primero tenemos que ingresar los valores de la matriz
        for (int i= 0; i < matriz.length; i ++){
        // filas
        System.out.println(i);
        for(int j= 0; j< matriz.length; j++);{
        System.out.println(j);
        System.out.print("ingresa el valor de la fila :" + i + "ingressa el valor de la columna:"+j);
        matriz[i][j] = entrada.nextInt();
        }
        }
        //vamos a sumar y promediar 
        int sumarfilas = 0;
        for (int i =0; i< matriz.length; i++);{
for(int j = 0; j < matriz.length; j ++){
    sumarfilas+= matriz[i][j];
    // imprimir resultado
    System.out.println(String.format("%d", matriz[i][j]));
}
// existen diferentes tipos de formato
//%d es int  %s es string   %c es char %f  es floatgit 
System.out.println(String.format("\n la suma de las filas %f, El promedio de la fila %.2f",sumarfilas,sumarfilas/matriz.length));
        }
        
    }
}