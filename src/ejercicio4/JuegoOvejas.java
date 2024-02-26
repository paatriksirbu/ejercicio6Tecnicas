package ejercicio4;

import java.util.Scanner;

public class JuegoOvejas {

    private Tablero tablero;
    private ValidadorMovimientos validador;
    private GestorMovimientos gestor;

    public JuegoOvejas() {  // Constructor
        tablero = new Tablero(8, 8);
        validador = new ValidadorMovimientos();
        gestor = new GestorMovimientos(tablero, null);
    }

    public void iniciarJuego() {    // Método para iniciar el juego
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el numero de movimientos: ");
        int maxMovimientos = scanner.nextInt();
        tablero.crearTablero(); //Creamos un tablero de 8x8
        tablero.colocarOvejaAleatoria(4);
        tablero.mostrarTablero();
        int movimientosActuales = 0;
        while (movimientosActuales < maxMovimientos) {
            Movimiento movimiento = gestor.crearMovimiento();
            if (movimiento != null && validador.validarMovimiento(movimiento, tablero)) {   // Si el movimiento es válido lo realizamos y mostramos el tablero actualizado
                gestor.moverOveja(movimiento, tablero);
                tablero.mostrarTablero();
                movimientosActuales++;
            } else {
                System.out.println("Movimiento no válido");
            }
        }
    }

    public static void main(String[] args) {    //Metodo principal para iniciar el juego
        JuegoOvejas juego = new JuegoOvejas();
        juego.iniciarJuego();
    }
}
