package ejercicio5.clases;

import static org.junit.jupiter.api.Assertions.*;

class CambiarColorTest {

    @org.junit.jupiter.api.Test
    void ejecutar() {
        Lienzo lienzo = new Lienzo(5, 5);
        CambiarColor cambiarColor = new CambiarColor(2, 2, 'X');
        cambiarColor.ejecutar(lienzo);
        assertEquals('X', lienzo.getCaracter(2, 2));
    }

}