package ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

class TableroTest {

    @org.junit.jupiter.api.Test
    void crearTablero() {
        char[][] tablero = Tablero.crearTablero(4, 4);
        assertEquals(4, tablero.length);
        assertEquals(4, tablero[0].length);
    }

    @org.junit.jupiter.api.Test
    void mostrarTablero() {
        char[][] tablero = Tablero.crearTablero(4, 4);
        Tablero.mostrarTablero(tablero);
    }

    @org.junit.jupiter.api.Test
    void marcarAgua() {
        char[][] tablero = Tablero.crearTablero(4, 4);
        int[] intento = {1, 1};
        Tablero.marcarAgua(tablero, intento);
        assertEquals('A', tablero[0][0]);
    }

    @org.junit.jupiter.api.Test
    void marcarTocadoYHundido() {
        char[][] tablero = Tablero.crearTablero(4, 4);
        int[] intento = {1, 1};
        Tablero.marcarTocadoYHundido(tablero, intento);
        assertEquals('X', tablero[0][0]);
    }

}