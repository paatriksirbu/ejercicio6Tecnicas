package ejercicio2;

import java.util.Random;

public class Barco  {
    private Tablero tablero;
    private String nombreBarco;
    private int[] ubicacion;


    public Barco(int[] ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int[] getUbicacion() {
        return ubicacion;
    }


    public void setUbicacion(int[] ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean disparar(char[][] tablero, int[] intento) {
        if (intento[0] - 1 == this.ubicacion[0] && intento[1] - 1 == this.ubicacion[1]) {

            Tablero.marcarTocadoYHundido(tablero, intento);
            Tablero.mostrarTablero(tablero);
            return true;
        } else {
            Tablero.marcarAgua(tablero, intento);
            Tablero.mostrarTablero(tablero);
            return false;
        }
    }

    public static int[] elegirUbicaciónAleatoria(char[][] tablero) {    // Elegir ubicación aleatoria
        Random rand = new Random();
        int fila = rand.nextInt(tablero.length);
        int columna = rand.nextInt(tablero[0].length);
        return new int[]{fila, columna};


    }
}
