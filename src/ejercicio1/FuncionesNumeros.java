package ejercicio1;

public class FuncionesNumeros {

    public String clasificar(int a, int b) {
        if (a == b ) {
            return "0";
        } else if (a > b) {
            return "1";
        } else {
            return "-1";
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
