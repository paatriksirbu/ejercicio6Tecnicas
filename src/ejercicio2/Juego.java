package ejercicio2;

import java.util.Scanner;

public class Juego {
    private char[][] tablero;
    private Barco barco;
    private Jugador jugador;
    private int intentos;
    private String nombre;
    private String nombreBarco;


    public char[][] getTablero() {
        return this.tablero;
    }

    public Juego() {

        // Jugar Batalla Naval
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a Batalla Naval!");
        System.out.println("Introduzca el nombre del jugador: ");
        nombre = sc.nextLine();
        System.out.println("Introduzca el nombre del barco: ");
        nombreBarco = sc.nextLine();


        this.tablero = Tablero.crearTablero(4, 4);
        this.barco = new Barco(Barco.elegirUbicaciónAleatoria(tablero));

        jugar();

    }
    protected void jugar(){
        Scanner sc = new Scanner(System.in);
        boolean juegoTerminado = false;

        while(!juegoTerminado){
            int[] intento = ControladorEntrada.obtenerIntento();
            juegoTerminado = barco.disparar(getTablero(), intento);
            intentos++;

            if (juegoTerminado){
                System.out.println("¡Felicidades!");
                System.out.println(nombre + " con: "+ nombreBarco + " "+ "consiguió hundir el barco en " + intentos + " intentos.");
                System.out.println("¡Gracias por jugar!");
            }
        }

    }


    public int getContadorIntentos() {
        return intentos;
    }

    public void setContadorIntentos(int intentos) {
        this.intentos = intentos;
    }
}
