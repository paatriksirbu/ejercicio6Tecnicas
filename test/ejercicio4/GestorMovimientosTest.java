package ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

class GestorMovimientosTest {

    @org.junit.jupiter.api.Test
    void validarMovimiento() {
        Tablero tablero = new Tablero(8, 8);
        tablero.crearTablero();
        Movimiento movimiento = new Movimiento(0, 0, 1, 1);
        GestorMovimientos gestorMovimientos = new GestorMovimientos(tablero, movimiento);
        ValidadorMovimientosInt validadorMovimientos = new ValidadorMovimientos();
        gestorMovimientos.setValidadorMovimientos(validadorMovimientos);
        assertTrue(gestorMovimientos.validarMovimiento());
    }

    @org.junit.jupiter.api.Test
    void realizarMovimiento() {
        Tablero tablero = new Tablero(8, 8);
        tablero.crearTablero();
        Movimiento movimiento = new Movimiento(0, 0, 1, 1);
        GestorMovimientos gestorMovimientos = new GestorMovimientos(tablero, movimiento);
        ValidadorMovimientosInt validadorMovimientos = new ValidadorMovimientos();
        gestorMovimientos.setValidadorMovimientos(validadorMovimientos);
        gestorMovimientos.realizarMovimiento(tablero, movimiento);
    }

    @org.junit.jupiter.api.Test
    void crearMovimiento() {
        Tablero tablero = new Tablero(8, 8);
        tablero.crearTablero();
        Movimiento movimiento = new Movimiento(0, 0, 1, 1);
        GestorMovimientos gestorMovimientos = new GestorMovimientos(tablero, movimiento);
        assertNotNull(gestorMovimientos.crearMovimiento());
    }

}