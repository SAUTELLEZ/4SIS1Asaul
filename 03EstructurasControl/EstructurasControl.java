/* 
vamos a crear un programa mediante el cual debamostener un menu de 
seleccion para eligir alguna de las 14 opciones siguientes :
1.- bono o descuento
2.- convertir numeros decimales binarios
3.- convertir temperaturas
4.- numeros de positivos y nnegativos
5.-tiendita 
5.- area y perimetro
7.-tabla
8.-factorial
9.-dibujitos
10.-figura hueca
11.-patron 
12.- diamante
13.-calculadora
14.-salir

*/
// declarar librerias
// se debe estructurar el tipo de dato acorde asu entrada 
//si es entero btenerlo como entero, si char obtenerlo como caracter,
import java.util.Scanner;
class EstructurasControl{
    // metodo principal 
    public static void main(String[] args){
        // el manejo de objetos, nos ayuda a poder instancear,(mandar a llamar a el objeto)
        //para hacer una istancia , es necesario 1.- identificar el tipo de objeto 
        //2.- nombrar al objeto
        // 3.- crear al objreto
        Scanner entrada = new Scanner(System.in);
        // crear una instancia del objeto de la entrada por defecto de la computadora 
        // vamos a identificar on scanner el tipo de dato que se esta instanceando
        //entrada es el objeto que va a poder identificar si es int, double,float etc
        // es declarar a la bariable que se va a utilizar en el programna 
        //n las variabled son de dos tipos global y local 
        // si la declaro dentro de un metodo es lical 
        int opcion , numbinario , total , cantidadproducto , num1; 
        float precio, resultdo = 0, compra = 0;
        String nombreproducto;
        String binario = "";
        char letra ;
        do {
            // a qui va todo el programa 
         System.out.println(" Bienvenido al programa");
         System.out.println(" Elige alguna opcion deceada ");
         System.out.println(" 1.-Descuento por edad");
         System.out.println(" 2.-Convertir numero decimal a binario");//profe
         System.out.println(" 3.-Convertir temperaturas");
         System.out.println(" 4.-Numeros positivos y negativos");
         System.out.println(" 5.-Tiendita");//profe
         System.out.println(" 6.-Area y Perimetro");
         System.out.println(" 7.-Tabla ");//profe
         System.out.println(" 8.-Factorial");
         System.out.println(" 9.-Dibujito");//profe
         System.out.println(" 10.-Figura hueca");
         System.out.println(" 11.-Patrones de codigo ");
         System.out.println(" 12.-Diamante ");
         System.out.println(" 13.-Calculadora");
         System.out.println(" 14.- Salir");

opcion = entrada.nextInt();
// menu
switch(opcion){
    case 1:
    break;
    case 2:
    //decimal a binario
    System.out.println(" ingresa un numero positivo entero que desee convertir a binario");
    numbinario = entrada.nextInt();
    // primero tengo que saber que sea positivo
    if( numbinario > 0){
    // se cuantas veces el numero se va dividir entre 2?
    while (numbinario%2 == 0) {
        if (numbinario%2 == 0){
            binario = "0" + binario;
        }else{
            binario = "1" + binario;
        }
numbinario = (int)numbinario/2;
    }
}else if (numbinario == 0){
binario = "0" + binario;
}else {
    binario = "no se puede convertir numeros negativos solo positivos";
}
System.out.println("el numero binario es: " + binario);
    break;
    case 3:
    break;
    case 4:
    break;
    case 5:
    break;
    case 6:
    break;
    case 7:
    break;
    case 8:
    break;
    case 9:
    break;
    case 10:
    break;
    case 11:
    break;
    case 12:
    break;
    case 13:
    break;
    case 14:
    break;
    default:
    System.out.println(" elija una opcion valida ");
    break;
}

            // a qui debo de preguntar 
            System.out.println( " deceas repetir el programa ?, escribe s para si");
            //vamos a leer el primer caracter de la entrada por defecto de la coputadora 
           letra = entrada.next().charAt(0);

            
           

        } while(letra =='s'|| letra =='S');
    }
    }
