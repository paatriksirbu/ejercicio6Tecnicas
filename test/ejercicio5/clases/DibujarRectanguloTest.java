package ejercicio5.clases;

import static org.junit.jupiter.api.Assertions.*;

class DibujarRectanguloTest {

    @org.junit.jupiter.api.Test
    void ejecutar() {
        // Arrange
        Lienzo lienzo = new Lienzo(10, 40);
        DibujarRectangulo dibujarRectangulo = new DibujarRectangulo(1, 1, 5, 5, '*');

        // Act
        dibujarRectangulo.ejecutar(lienzo);

        // Assert
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                assertEquals('*', lienzo.getCaracter(i, j));
            }
        }
    }
}