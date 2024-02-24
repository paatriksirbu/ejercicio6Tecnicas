package ejercicio3;
import java.util.*;

public class GeneradorTablaAleatoria {  //Clase que genera una tabla aleatoria de un tamaño y rango determinado.
    private NumAleatorio numAleatorio;  //Atributo de la clase NumAleatorio.
    final int tamano = 10;

    public GeneradorTablaAleatoria(NumAleatorio numAleatorio) {
        this.numAleatorio = numAleatorio;
    }   //Constructor

    public int[] crearTablaAleatoria(int tamano, int minimo, int maximo){   //Método que crea una tabla aleatoria de un tamaño y rango determinado.
        int[] tabla = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            tabla[i] = numAleatorio.generarNumAleatorio(minimo, maximo);
        }
        return tabla;

    }
}
