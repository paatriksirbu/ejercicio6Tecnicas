package ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

class TableroTest {

    @org.junit.jupiter.api.Test
    void crearTablero() {
        Tablero tablero = new Tablero(8, 8);
        tablero.crearTablero();
        char[][] tableroEsperado = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tableroEsperado[i][j] = ' ';
            }
        }
        assertArrayEquals(tableroEsperado, tablero.getTablero());
    }

    @org.junit.jupiter.api.Test
    void colocarOvejaAleatoria() {
        Tablero tablero = new Tablero(8, 8);
        tablero.crearTablero();
        tablero.colocarOvejaAleatoria(1);
        char[][] tableroEsperado = new char[8][8];
        tableroEsperado[0][0] = 'O';
        assertArrayEquals(tableroEsperado, tablero.getTablero());
    }

}