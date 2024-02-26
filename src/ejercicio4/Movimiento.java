package ejercicio4;

public class Movimiento {
   private int posicionInicial, posicionFinal;

   public Movimiento(int posicionInicial, int posicionFinal, int filaDestino, int columnaDestino) {
      this.posicionInicial = posicionInicial;
      this.posicionFinal = posicionFinal;
   }

   public int getPosicionInicial() {
      return posicionInicial;
   }

    public int getPosicionFinal() {
        return posicionFinal;
    }

    public void setPosicionInicial(int posicionInicial) {
        this.posicionInicial = posicionInicial;
    }

    public void setPosicionFinal(int posicionFinal) {
        this.posicionFinal = posicionFinal;
    }

    public boolean validarMovimiento() {
        return true;
    }

    public int getFilaActual() {
        int pa = posicionInicial;
        int fila = pa / 8;
        return fila;
    }

    public int getColumnaActual() {
        int pa = posicionInicial;
        int columna = pa % 8;
        return columna;
    }

    public int getFilaNueva() {
        int pf = posicionFinal;
        int fila = pf / 8;
        return fila;
    }

    public int getColumnaNueva() {
        int pf = posicionFinal;
        int columna = pf % 8;
        return columna;
    }



}
