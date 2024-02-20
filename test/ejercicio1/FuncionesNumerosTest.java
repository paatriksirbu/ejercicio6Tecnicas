package ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

class FuncionesNumerosTest {

    @org.junit.jupiter.api.Test
    void clasificar() {
        FuncionesNumeros clasificar = new FuncionesNumeros();
        assertEquals("Los tres números son iguales", clasificar.clasificar(1, 1, 1));
        assertEquals("Hay dos números iguales", clasificar.clasificar(1, 1, 2));
        assertEquals("Los tres números son distintos", clasificar.clasificar(1, 2, 3));
    }

    @org.junit.jupiter.api.Test
    void mayor() {
        FuncionesNumeros mayor = new FuncionesNumeros();
        assertEquals(2, mayor.mayor(1, 2));
        assertEquals(2, mayor.mayor(2, 1));
    }

}