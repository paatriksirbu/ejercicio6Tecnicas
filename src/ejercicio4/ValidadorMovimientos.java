package ejercicio4;

public class ValidadorMovimientos implements ValidadorMovimientosInt{
    private int posicionInicial, posicionFinal;

    public ValidadorMovimientos() {
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

    public boolean validarMovimiento(Movimiento movimiento, Tablero tablero) {
        if (posicionInicial < 0 || posicionInicial > 7 || posicionFinal < 0 || posicionFinal > 7) {
            return false;
        } else {
            return true;
        }
    }
}


