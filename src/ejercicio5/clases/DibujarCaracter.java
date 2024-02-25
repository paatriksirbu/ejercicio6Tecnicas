package ejercicio5.clases;

import ejercicio5.interfaz.ComandoDibujo;

public class DibujarCaracter implements ComandoDibujo {
    private int i, j;
    private char caracter;

    public DibujarCaracter(int i, int j, char caracter){
        this.i = i;
        this.j = j;
        this.caracter = caracter;
    }

    public void ejecutar(Lienzo lienzo){
        lienzo.dibujarCaracter(i, j, caracter);
    }


}
