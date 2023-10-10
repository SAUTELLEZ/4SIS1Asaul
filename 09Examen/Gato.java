import java.util.Random;
import java.util.Scanner;


public class Gato {
    static char [][] tablero = {
        {' ',' ',' '},
        {' ',' ',' '},
        {' ',' ',' '}
        
    };
static char jugador='A';
static boolean jugadorvsmaquina = false;
static Random rand = new Random();
static char letra;
public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("");
    System.out.println("UNIVERSIDAD TRES CULTURAS PLANTEL LONDRES");
    System.out.println("        EXAMEN PRIMER PARCIAL");
    System.out.println("    PROGRAMACION ORIENTADA A OBJETOS");
    System.out.println("           JUEGO DE GATO");
    System.out.println("        INTEGRANTES DEL EQUIPO");
    System.out.println("     MARTINEZ RAMIREZ LUIS ANTONIO");
    System.out.println("       TELLEZ TELLEZ SAUL");
    System.out.println(" ");
    System.out.println("   HOLA BIENBENIDO A JUGAR GATO ");
    System.out.println("instrucciones "+ 
    " ingresa las coordenadas para hacer un tiro ");
    System.out.println(" ejemplo: 1,2 te colocara en la fila 1, columna 2");
    System.out.println();
    while(true){
        imprimirtablero();
        hacermovimiento();
        
        if(verificarvictoria()) {
            imprimirtablero();
            System.out.println(" el jugador " + jugador + "ganador");
            reiniciarjuego(scanner);

        }else if( verificarempate() ){
            imprimirtablero();
            System.out.println("EMPATE");
            reiniciarjuego(scanner);

        }
        cambiarjugador();

    }

}
static void imprimirtablero(){
  System.out.println("----------");

    for(int i = 0; i<3;i++){
    System.out.print("|");
    for(int j = 0; j<3;j++){
    System.out.print(tablero[i][j]+ " |");

}
System.out.println();
System.out.println("----------");

    }
} 
static void hacermovimiento(){
    Scanner scanner = new Scanner(System.in);
    int fila, columna;
    if (jugadorvsmaquina&& jugador=='0'){
        System.out.println("turno de maquina(O)...");
        fila = rand.nextInt(3);
        columna = rand.nextInt(3);

    }else {
        System.out.println("turno jugador" + jugador + ":");
        System.out.println(" ingresa la fila y columna(ejemplo 1,2)");
        fila = scanner.nextInt()-1;
        columna = scanner.nextInt()-1;

    }
if (fila >=0  && fila<3 && columna >= 0 && columna <3 && tablero[fila][columna] ==' '){
tablero[fila][columna] = jugador;

}else{
    System.out.println("movimiento invalido, vuelva a intentar");
    hacermovimiento();
}
} 
static void cambiarjugador(){
    if (jugador == 'A'){
        jugador = 'O';

    }else {
        jugador ='A';
    }
}  
static boolean verificarvictoria(){
    for (int i=0; i<3;i++){
        if ((tablero[i][0] == jugador && tablero[i][1]  == jugador && tablero[i][2]==
        jugador) || ( tablero [0][i] == jugador && tablero[1][i] == jugador && tablero[2][i]==
        jugador ) ){
            return true;
        }
        }
        if ((tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
            (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)) {
            return true;
            }
        return false;
    }
    static boolean verificarempate(){
        for(int i=0;i<3; i ++){
            for(int j= 0; j<3; j ++){
                if (tablero[i][j]==' '){
                    return false ;
                }
            }
        }
        return true;
    }
    static void reiniciarjuego(Scanner scanner){
        System.out.print("Dceas repetir el juego? escribe S para si" );
        char respuesta = scanner.next().charAt(0);
        if (respuesta == 'S' || respuesta == 's') {
            tablero = new char[][] {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
            };
            jugador = 'X';
            System.out.println("Nuevo juego iniciado.");
        } else {
            System.out.println("¡Gracias por jugar!");
            System.exit(0);
        }
}
}
