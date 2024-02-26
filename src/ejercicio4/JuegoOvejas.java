package ejercicio4;

public class JuegoOvejas {

    private Tablero tablero;
    private ValidadorMovimientos validador;
    private GestorMovimientos gestor;

    public JuegoOvejas() {
        tablero = new Tablero(8, 8);
        validador = new ValidadorMovimientos();
        gestor = new GestorMovimientos();
    }

    public void iniciarJuego() {
        tablero.crearTablero();
        tablero.colocarOvejaAleatoria(3);
        tablero.mostrarTablero();
        int maxMovimientos = 100;
        int movimientosActuales = 0;
        while (movimientosActuales < maxMovimientos) {
            Movimiento movimiento = gestor.crearMovimiento();
            if (validador.validarMovimiento(movimiento, tablero)) {
                gestor.moverOveja(movimiento, tablero);
                tablero.mostrarTablero();
                movimientosActuales++;
            } else {
                System.out.println("Movimiento no válido");
            }
        }
    }

    public static void main(String[] args) {
        JuegoOvejas juego = new JuegoOvejas();
        juego.iniciarJuego();
    }
}
