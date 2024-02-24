package ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

class GeneradorTablaAleatoriaTest {

    @org.junit.jupiter.api.Test
    void crearTablaAleatoria() {
        NumAleatorio generadorAleatorio = new GeneradorAleatorio();
        GeneradorTablaAleatoria generadorTablaAleatoria = new GeneradorTablaAleatoria(generadorAleatorio);
        int[] tablaAleatoria = generadorTablaAleatoria.crearTablaAleatoria(10,1,100);
        assertEquals(10, tablaAleatoria.length);
        for (int i = 0; i < tablaAleatoria.length; i++) {
            assertTrue(tablaAleatoria[i] >= 1 && tablaAleatoria[i] <= 100);
        }
    }


}