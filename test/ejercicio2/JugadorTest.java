package ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

class JugadorTest {

    @org.junit.jupiter.api.Test
    void getNombre() {
        Jugador jugador = new Jugador("Juan", new int[]{1, 2});
        assertEquals("Juan", jugador.getNombre());
    }

    @org.junit.jupiter.api.Test
    void getIntento() {
        Jugador jugador = new Jugador("Juan", new int[]{1, 2});
        assertArrayEquals(new int[]{1, 2}, jugador.getIntento());
    }

}