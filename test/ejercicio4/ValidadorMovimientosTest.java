package ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorMovimientosTest {


    @org.junit.jupiter.api.Test
    void validarMovimiento() {
        Movimiento movimiento = new Movimiento(0, 1, 0, 1);
        Tablero tablero = new Tablero(8, 8);
        tablero.crearTablero();
        ValidadorMovimientos validador = new ValidadorMovimientos();
        validador.setPosicionInicial(movimiento.getPosicionInicial());
        validador.setPosicionFinal(movimiento.getPosicionFinal());
        assertTrue(validador.validarMovimiento(movimiento, tablero));
    }
}