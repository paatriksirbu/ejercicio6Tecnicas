package ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

class MovimientoTest {

    @org.junit.jupiter.api.Test
    void validarMovimiento() {
        Movimiento movimiento = new Movimiento(0, 9, 0, 0);
        assertTrue(movimiento.validarMovimiento());
    }

    @org.junit.jupiter.api.Test
    void getFilaActual() {
        Movimiento movimiento = new Movimiento(0, 9, 0, 0);
        assertEquals(0, movimiento.getFilaActual());
    }

    @org.junit.jupiter.api.Test
    void getColumnaActual() {
        Movimiento movimiento = new Movimiento(0, 9, 0, 0);
        assertEquals(0, movimiento.getColumnaActual());
    }

    @org.junit.jupiter.api.Test
    void getFilaNueva() {
        Movimiento movimiento = new Movimiento(0, 9, 0, 0);
        assertEquals(1, movimiento.getFilaNueva());
    }

    @org.junit.jupiter.api.Test
    void getColumnaNueva() {
        Movimiento movimiento = new Movimiento(0, 9, 0, 0);
        assertEquals(1, movimiento.getColumnaNueva());
    }

}