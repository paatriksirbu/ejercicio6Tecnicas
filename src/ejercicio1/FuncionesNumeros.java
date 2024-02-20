package ejercicio1;

public class FuncionesNumeros {

    public String clasificar(int a, int b, int c) {
        if (a == b && b == c) {
            return "Los tres números son iguales";
        } else if (a == b || b == c || a == c) {
            return "Hay dos números iguales";
        } else {
            return "Los tres números son distintos";
        }
    }

    public int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
