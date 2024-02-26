package ejercicio4;
import java.util.*;
public class GestorMovimientos {    // Clase GestorMovimientos
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
    }   // Getters y setters

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

    public void realizarMovimiento(Tablero tablero, Movimiento movimiento) {    // Método para realizar un movimiento

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

    public Movimiento crearMovimiento() {   // Método para crear un movimiento

        Movimiento movimiento = null;
        List<Posicion> posicionesAdyacentesVacias = new ArrayList<>();

       //Seguir generando coordenadas hasta que encontremos una posicion vacia.
        while (posicionesAdyacentesVacias.isEmpty()) {
            int filaOrigen = random.nextInt(8);
            int columnaOrigen = random.nextInt(8);
            posicionesAdyacentesVacias = tablero.obtenerPosicionesAdyacentesVacias(filaOrigen, columnaOrigen);

            if (!posicionesAdyacentesVacias.isEmpty()) {
                // Selecciona una posición adyacente vacía al azar
                Posicion posicionDestino = posicionesAdyacentesVacias.get(random.nextInt(posicionesAdyacentesVacias.size()));

                // Crea un nuevo movimiento con la posición de origen actual y la posición de destino seleccionada
                movimiento = new Movimiento(filaOrigen, columnaOrigen, posicionDestino.getFila(), posicionDestino.getColumna());
            }
        }

        return movimiento;
    }


    public void moverOveja(Movimiento movimiento, Tablero tablero) {    // Método para mover una oveja
        int filaOrigen = movimiento.getFilaActual();
        int columnaOrigen = movimiento.getColumnaActual();
        int filaDestino = movimiento.getFilaNueva();
        int columnaDestino = movimiento.getColumnaNueva();
        tablero.realizarMovimiento(filaOrigen, columnaOrigen, filaDestino, columnaDestino);
    }
}
