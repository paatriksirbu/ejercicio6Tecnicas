package ejercicio5.clases;

import static org.junit.jupiter.api.Assertions.*;

class LienzoTest {

    @org.junit.jupiter.api.Test
    void mostrarLienzo() {
        Lienzo lienzo = new Lienzo(10, 40);
        lienzo.mostrarLienzo();
    }

    @org.junit.jupiter.api.Test
    void limpiarLienzo() {
        Lienzo lienzo = new Lienzo(10, 40);
        lienzo.limpiarLienzo();
        lienzo.mostrarLienzo();
    }

    @org.junit.jupiter.api.Test
    void dibujarRectangulo() {
        Lienzo lienzo = new Lienzo(10, 40);
        lienzo.dibujarRectangulo(0, 0, 5, 5, 'X');
        lienzo.mostrarLienzo();
    }

    @org.junit.jupiter.api.Test
    void dibujarCaracter() {
        Lienzo lienzo = new Lienzo(10, 40);
        lienzo.dibujarCaracter(0, 0, 'X');
        lienzo.mostrarLienzo();
    }

    @org.junit.jupiter.api.Test
    void cambiarColor() {
        Lienzo lienzo = new Lienzo(10, 40);
        lienzo.cambiarColor(0, 0, 'X');
        lienzo.mostrarLienzo();
    }

    @org.junit.jupiter.api.Test
    void ejecutar() {
        Lienzo lienzo = new Lienzo(10, 40);
        lienzo.ejecutar();
    }

}