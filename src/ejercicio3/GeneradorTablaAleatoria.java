package ejercicio3;
import java.util.*;

public class GeneradorTablaAleatoria {
    private NumAleatorio numAleatorio;
    final int tamano = 10;

    public GeneradorTablaAleatoria(NumAleatorio numAleatorio) {
        this.numAleatorio = numAleatorio;
    }

    public int[] crearTablaAleatoria(int tamano, int minimo, int maximo){
        int[] tabla = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            tabla[i] = numAleatorio.generarNumAleatorio(minimo, maximo);
        }
        return tabla;

    }
}
