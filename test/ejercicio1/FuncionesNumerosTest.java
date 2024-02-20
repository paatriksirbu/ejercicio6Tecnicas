package ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

class FuncionesNumerosTest {

    @org.junit.jupiter.api.Test
    void clasificar() {
        FuncionesNumeros clasificar = new FuncionesNumeros();
        assertEquals("0", clasificar.clasificar(1, 1));
        assertEquals("1", clasificar.clasificar(2, 1));
        assertEquals("-1", clasificar.clasificar(1, 2));

    }

    @org.junit.jupiter.api.Test
    void mayor() {
        FuncionesNumeros mayor = new FuncionesNumeros();
        assertEquals(2, mayor.mayor(1, 2));
        assertEquals(2, mayor.mayor(2, 1));
    }

}