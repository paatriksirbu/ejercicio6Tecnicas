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

    public static int[] elegirUbicaciónAleatoria(char[][] tablero) {    // Elegir ubicación aleatoria
        Random rand = new Random();
        int fila = rand.nextInt(tablero.length);
        int columna = rand.nextInt(tablero[0].length);
        return new int[]{fila, columna};
    }

    public static int[] obtenerIntento() {  // Obtener intento del usuario
        Scanner scanner = new Scanner(System.in);
        int fila = 0;
        int columna = 0;
        boolean entradaValida = false;

        while (!entradaValida){
            try{
                System.out.print("Ingrese fila (1-4): ");
                fila = scanner.nextInt();
                System.out.print("Ingrese columna (1-4): ");
                columna = scanner.nextInt();
                if (fila >= 1 && fila <= 4 && columna >= 1 && columna <= 4){
                    entradaValida = true;
                } else {
                    System.out.println("Entrada inválida. Ingrese un número entre 1 y 4.");
                }
            } catch (Exception e){
                System.out.println("Entrada inválida. Ingrese SOLO numeros.");
                scanner.nextLine();
            }
        }
        return new int[]{fila, columna};
    }

    public static void marcarAgua(char[][] tablero, int[] intento) {
        tablero[intento[0] - 1][intento[1] - 1] = 'A'; // A de Agua
    }

    public static void marcarTocadoYHundido(char[][] tablero, int[] intento) {
        tablero[intento[0] - 1][intento[1] - 1] = 'X'; // X de Tocado y hundido
    }


    public static boolean disparar(char[][] tablero, int[] intento, int[] ubicación_barco) {
        if (intento[0] - 1 == ubicación_barco[0] && intento[1] - 1 == ubicación_barco[1]) {

            marcarTocadoYHundido(tablero, intento);
            mostrarTablero(tablero);
            return true;
        } else {
            marcarAgua(tablero, intento);
            mostrarTablero(tablero);
            return false;
        }
    }
    public static void jugarBatallaNaval() {
        // Jugar Batalla Naval
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a Batalla Naval!");
        System.out.println("Introduzca el nombre del jugador: ");
        String nombre = sc.nextLine();


        char[][] tablero = crearTablero(4, 4);
        int[] ubicación_barco = elegirUbicaciónAleatoria(tablero);
        int[] intento;
        boolean juegoTerminado = false;

        do {
            intento = obtenerIntento();
            juegoTerminado = disparar(tablero, intento, ubicación_barco);
            if (juegoTerminado) {
                System.out.println("¡Felicidades " + nombre + "!" + "¡Hundiste el barco!");
            }
        } while (!juegoTerminado);
    }

}
