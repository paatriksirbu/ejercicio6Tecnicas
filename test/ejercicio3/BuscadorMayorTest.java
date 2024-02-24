package ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

class BuscadorMayorTest {

        @org.junit.jupiter.api.Test
        void buscarNumeroMayor() {
            BuscadorMayor buscador = new BuscadorMayor();
            int[] tabla = {1, 2, 3, 4, 5};
            assertEquals(5, buscador.buscarNumeroMayor(tabla));
        }

}