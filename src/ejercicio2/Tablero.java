package ejercicio2;
import java.util.Random;
import java.util.Scanner;

public class Tablero {


    public static char[][] crearTablero(int filas, int columnas) { // Crear tablero
        char[][] tablero = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = ' ';
            }
        }
        return tablero;
    }

    public static void mostrarTablero(char[][] tablero) {
        // Imprimir la línea superior del borde
        System.out.print("  +"); // Espacio para alinear con los números de columna
        for (int j = 0; j < tablero[0].length; j++) {
            System.out.print("--");
        }
        System.out.println("+");

        // Imprimir el tablero con bordes laterales
        for (int i = 0; i < tablero.length; i++) {
            System.out.print((i + 1) + " |");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("|"); // Borde derecho
        }

        // Imprimir la línea inferior del borde
        System.out.print("  +");
        for (int j = 0; j < tablero[0].length; j++) {
            System.out.print("--");
        }
        System.out.println("+");
    }


    public static void marcarAgua(char[][] tablero, int[] intento) {
        tablero[intento[0] - 1][intento[1] - 1] = 'A'; // A de Agua
    }

    public static void marcarTocadoYHundido(char[][] tablero, int[] intento) {
        tablero[intento[0] - 1][intento[1] - 1] = 'X'; // X de Tocado y hundido
    }




}
