package ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BarcoTest {

    @Test
    void testDisparar() {
        char[][] tablero = Tablero.crearTablero(4, 4);
        Barco barco = new Barco(Barco.elegirUbicaciónAleatoria(tablero));
        int[] intento = {1, 1};
        boolean resultado = barco.disparar(tablero, intento);
        assertFalse(resultado);
    }

    @Test
    void testElegirUbicaciónAleatoria() {
        char[][] tablero = Tablero.crearTablero(4, 4);
        int[] ubicacion = Barco.elegirUbicaciónAleatoria(tablero);
        assertTrue(ubicacion[0] >= 0 && ubicacion[0] < 4);
        assertTrue(ubicacion[1] >= 0 && ubicacion[1] < 4);
    }
    @Test
    void testGetUbicacion() {
        char[][] tablero = Tablero.crearTablero(4, 4);
        Barco barco = new Barco(Barco.elegirUbicaciónAleatoria(tablero));
        int[] ubicacion = barco.getUbicacion();
        assertTrue(ubicacion[0] >= 0 && ubicacion[0] < 4);
        assertTrue(ubicacion[1] >= 0 && ubicacion[1] < 4);
    }
    @Test
    void testSetUbicacion() {
        char[][] tablero = Tablero.crearTablero(4, 4);
        Barco barco = new Barco(Barco.elegirUbicaciónAleatoria(tablero));
        int[] ubicacion = {1, 1};
        barco.setUbicacion(ubicacion);
        int[] ubicacionObtenida = barco.getUbicacion();
        assertEquals(ubicacion[0], ubicacionObtenida[0]);
        assertEquals(ubicacion[1], ubicacionObtenida[1]);
    }
    @Test
    void testBarco() {
        char[][] tablero = Tablero.crearTablero(4, 4);
        Barco barco = new Barco(Barco.elegirUbicaciónAleatoria(tablero));
        int[] ubicacion = barco.getUbicacion();
        assertTrue(ubicacion[0] >= 0 && ubicacion[0] < 4);
        assertTrue(ubicacion[1] >= 0 && ubicacion[1] < 4);
    }
    @Test
    void testBarco2() {
        int[] ubicacion = {1, 1};
        Barco barco = new Barco(ubicacion);
        int[] ubicacionObtenida = barco.getUbicacion();
        assertEquals(ubicacion[0], ubicacionObtenida[0]);
        assertEquals(ubicacion[1], ubicacionObtenida[1]);
    }



}