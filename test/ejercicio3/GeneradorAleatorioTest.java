package ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

class GeneradorAleatorioTest {

        @org.junit.jupiter.api.Test
        void generarNumAleatorio() {
            GeneradorAleatorio generador = new GeneradorAleatorio();
            int minimo = 1;
            int maximo = 10;
            int aleatorio = generador.generarNumAleatorio(minimo, maximo);
            assertTrue(aleatorio >= minimo && aleatorio <= maximo);
        }

}