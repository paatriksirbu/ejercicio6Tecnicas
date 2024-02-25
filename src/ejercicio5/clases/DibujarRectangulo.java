package ejercicio5.clases;
import ejercicio5.interfaz.ComandoDibujo;

public class DibujarRectangulo implements ComandoDibujo{
    private int i1, j1, i2, j2;
    private char caracter;

    public DibujarRectangulo(int i1, int j1, int i2, int j2, char caracter){
        this.i1 = i1;
        this.j1 = j1;
        this.i2 = i2;
        this.j2 = j2;
        this.caracter = caracter;
    }


    public void ejecutar(Lienzo lienzo){
        lienzo.dibujarRectangulo(i1, j1, i2, j2, caracter);
    }


}
