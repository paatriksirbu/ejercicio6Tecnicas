package ejercicio4;
import java.util.*;
public class GestorMovimientos {
    private ValidadorMovimientosInt validadorMovimientos;
    private Movimiento movimiento;
    private Tablero tablero;
    private Random random;

    public GestorMovimientos(Tablero tablero, Movimiento movimiento) {
        this.validadorMovimientos = validadorMovimientos;
        this.movimiento = movimiento;
        this.random = new Random();
        this.tablero = tablero;
    }

    public ValidadorMovimientosInt getValidadorMovimientos() {
        return validadorMovimientos;
    }

    public Movimiento getMovimiento() {
        return movimiento;
    }

    public void setValidadorMovimientos(ValidadorMovimientosInt validadorMovimientos) {
        this.validadorMovimientos = validadorMovimientos;
    }

    public void setMovimiento(Movimiento movimiento) {
        this.movimiento = movimiento;
    }

    public boolean validarMovimiento() {
        return validadorMovimientos.validarMovimiento(movimiento, tablero);
    }

    public void realizarMovimiento(Tablero tablero, Movimiento movimiento) {

        int filaActual = movimiento.getFilaActual();
        int columnaActual = movimiento.getColumnaActual();
        int filaNueva = movimiento.getFilaNueva();
        int columnaNueva = movimiento.getColumnaNueva();



        if (validarMovimiento()) {
            System.out.println("Movimiento válido");
        } else {
            System.out.println("Movimiento inválido");
        }
    }

    // En la clase GestorMovimientos

    public Movimiento crearMovimiento() {
        // Genera coordenadas aleatorias para el origen y el destino
        int filaOrigen = random.nextInt(8);
        int columnaOrigen = random.nextInt(8);
        int filaDestino = random.nextInt(8);
        int columnaDestino = random.nextInt(8);
        return new Movimiento(filaOrigen, columnaOrigen, filaDestino, columnaDestino);
        // Obtiene las posiciones adyacentes vacías

        List<Posicion> posicionesAdyacentesVacias = tablero.obtenerPosicionesAdyacentesVacias(movimiento.getFilaActual(), movimiento.getColumnaActual());

        // Si no hay posiciones adyacentes vacías, devuelve null
        if (posicionesAdyacentesVacias.isEmpty()) {
            return null;
        }

        // Selecciona una posición adyacente vacía al azar
        Posicion posicionDestino = posicionesAdyacentesVacias.get(random.nextInt(posicionesAdyacentesVacias.size()));

        // Crea un nuevo movimiento con la posición de origen actual y la posición de destino seleccionada
        return new Movimiento(movimiento.getFilaActual(), movimiento.getColumnaActual(), posicionDestino.getFila(), posicionDestino.getColumna());
    }
    }

    public void moverOveja(Movimiento movimiento, Tablero tablero) {
        int filaOrigen = movimiento.getFilaActual();
        int columnaOrigen = movimiento.getColumnaActual();
        int filaDestino = movimiento.getFilaNueva();
        int columnaDestino = movimiento.getColumnaNueva();
        tablero.realizarMovimiento(filaOrigen, columnaOrigen, filaDestino, columnaDestino);
    }
}
