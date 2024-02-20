package ejercicio1;

public class FuncionesNumeros {

    public String clasificar(int a, int b) {    //Metodo que recibe dos numeros y los compara para saber si son iguales, si el primero es mayor o si el segundo es mayor y devuelve el valor correspondiente.
        if (a == b ) {
            return "0";
        } else if (a > b) {
            return "1";
        } else {
            return "-1";
        }
    }

    public int mayor(int a, int b) {    //Metodo que recibe dos numeros y los compara para saber cual es el mayor
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
