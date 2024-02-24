package ejercicio3;

import java.util.Arrays;

public class ManipulacionTablas{    //Clase principal que genera una tabla aleatoria y busca el número mayor de la misma y las imprime en consola.
    public static void main(String[] args) {
        NumAleatorio generadorAleatorio = new GeneradorAleatorio();
        GeneradorTablaAleatoria generadorTablaAleatoria = new GeneradorTablaAleatoria(generadorAleatorio);

        System.out.println("Generando tabla aleatoria de 10 elementos entre 1 y 100...");
        int[] tablaAleatoria = generadorTablaAleatoria.crearTablaAleatoria(10,1,100);
        System.out.println("\nLa tabla aleatoria es: " + Arrays.toString(tablaAleatoria));
        System.out.println("Tabla aleatoria generada.");

        System.out.println("\nBuscando el número mayor de la tabla...");
        NumeroMayor buscadorNumeroMayor = new BuscadorMayor();
        int numeroMayor = buscadorNumeroMayor.buscarNumeroMayor(tablaAleatoria);

        System.out.println("El número mayor de la tabla es: " + numeroMayor);
    }
}
