package ejercicio3;

import java.util.Random;

public class GeneradorAleatorio implements NumAleatorio{
    public int generarNumAleatorio(int minimo, int maximo){
        Random r = new Random();
        return r.nextInt(maximo - minimo + 1) + minimo;
    }
}
