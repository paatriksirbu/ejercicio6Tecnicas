package ejercicio5.clases;

public class Lienzo {
    private int ancho;
    private int alto;
    private char [][] matriz;

    public Lienzo(int ancho, int alto){
        this.ancho = ancho;
        this.alto = alto;
        matriz = new char[alto][ancho];
    }

    public void mostrarLienzo(){
        for(int i = 0; i < alto; i++){
            for(int j = 0; j < ancho; j++){
                if(matriz[i][j] == 0){
                    System.out.print(" ");
                }else{
                    System.out.print(matriz[i][j]);
                }
            }
            System.out.println();
        }
    }

    public void limpiarLienzo(){
        for(int i = 0; i < alto; i++){
            for(int j = 0; j < ancho; j++){
                matriz[i][j] = 0;
            }
        }
    }

    public void dibujarRectangulo(int i1, int j1, int i2, int j2, char caracter){
        if (i1 < 0 || j1 < 0 || i2 >= alto || j2 >= ancho) {
            throw new IllegalArgumentException("Las coordenadas del rectángulo están fuera de los límites del lienzo.");
        }

        for(int i = i1; i <= i2; i++){
            for(int j = j1; j <= j2; j++){
                matriz[i][j] = caracter;
            }
        }
    }

    public void dibujarCaracter(int i, int j, char caracter){
        matriz[i][j] = caracter;
    }

    public void cambiarColor(int i, int j, char caracter){
        matriz[i][j] = caracter;
    }

    public void ejecutar(){
        mostrarLienzo();
    }



}
