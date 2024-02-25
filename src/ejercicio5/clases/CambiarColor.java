package ejercicio5.clases;
import ejercicio5.interfaz.ComandoDibujo;

public class CambiarColor implements ComandoDibujo{
    private int i, j;
    private char nuevoCaracter;

    public CambiarColor(int i, int j, char nuevoCaracter){
        this.i = i;
        this.j = j;
        this.nuevoCaracter = nuevoCaracter;
    }

    public void ejecutar(Lienzo lienzo){
        lienzo.cambiarColor(i, j, nuevoCaracter);
    }

}
