package ejercicio3;

import java.util.Random;

public class GeneradorAleatorio implements NumAleatorio{    //Clase que implementa la interfaz NumAleatorio y que genera un número aleatorio entre un mínimo y un máximo
    public int generarNumAleatorio(int minimo, int maximo){
        Random r = new Random();
        return r.nextInt(maximo - minimo + 1) + minimo;
    }
}
