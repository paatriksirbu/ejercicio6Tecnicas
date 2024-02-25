package ejercicio5.clases;

import static org.junit.jupiter.api.Assertions.*;

class DibujarCaracterTest {

    @org.junit.jupiter.api.Test
    void ejecutar() {
        Lienzo lienzo = new Lienzo(10, 10);
        DibujarCaracter dibujarCaracter = new DibujarCaracter(5, 5, 'X');
        dibujarCaracter.ejecutar(lienzo);
        assertEquals('X', lienzo.getLienzo()[5][5]);
    }

}