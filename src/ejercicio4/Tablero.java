package ejercicio4;
import java.util.*;

public class Tablero {
    private char[][] tablero;
    private int filas, columnas;
    private Random random;

    //filas = i y columnas = j

    public Tablero(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        tablero = new char[filas][columnas];
        crearTablero();
    }

    public void crearTablero() {    // Método para crear un tablero
        tablero = new char[8][8];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public void colocarOvejaAleatoria(int numeroOvejas) {   // Método para colocar ovejas aleatoriamente
        random = new Random();
        int i = random.nextInt(filas);
        int j = random.nextInt(columnas);
        for (int k = 0; k < numeroOvejas; k++) {
            if (i + k < filas && tablero[i + k][j] == ' ') {
                tablero[i + k][j] = 'O';
            } else if (j + k < columnas && tablero[i][j + k] == ' ') {
                tablero[i][j + k] = 'O';
            } else {
                colocarOvejaAleatoria(numeroOvejas);
                break;
            }
        }
    }

    public void mostrarTablero() {  // Método para mostrar el tablero
        for (int i = 0; i < filas; i++) {
            System.out.print("|");
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero[i][j] + "|");
            }
            System.out.println();
        }
    }

    public char[][] getTablero() {
        return tablero;
    }

    public void setTablero(char[][] tablero) {
        this.tablero = tablero;
    }


    private boolean esPosicionValida(int fila, int columna) {   // Método para comprobar si una posición es válida
        return fila >= 0 && fila < filas && columna >= 0 && columna < columnas;
    }

    private boolean esCasillaVacia(int fila, int columna) {
        return this.tablero[fila][columna] == ' ';
    }   // Método para comprobar si una casilla está vacía

    public boolean realizarMovimiento(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) { // Método para realizar un movimiento
        if (!esPosicionValida(filaDestino, columnaDestino) || !esCasillaVacia(filaDestino, columnaDestino)) {
            return false; // Movimiento inválido
        }

        // Comprobar si es un salto válido
        if (Math.abs(filaDestino - filaOrigen) == 2 || Math.abs(columnaDestino - columnaOrigen) == 2) {
            int filaMedio = (filaOrigen + filaDestino) / 2;
            int columnaMedio = (columnaOrigen + columnaDestino) / 2;
            if (!esCasillaVacia(filaMedio, columnaMedio)) {
                // Realizar el salto
                moverOveja(filaOrigen, columnaOrigen, filaDestino, columnaDestino);
                return true;
            }
        } else if (Math.abs(filaDestino - filaOrigen) == 1 || Math.abs(columnaDestino - columnaOrigen) == 1) {
            // Mover normalmente si la casilla de destino está vacía y es adyacente
            moverOveja(filaOrigen, columnaOrigen, filaDestino, columnaDestino);
            return true;
        }

        return false; // Movimiento inválido
    }

    private void moverOveja(int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino){    // Método para mover una oveja
        this.tablero[filaDestino][columnaDestino] = this.tablero[filaOrigen][columnaOrigen];
        this.tablero[filaOrigen][columnaOrigen] = ' ';
    }

    // En la clase Tablero
    public List<Posicion> obtenerPosicionesAdyacentesVacias(int fila, int columna) {    // Método para obtener posiciones adyacentes vacías
        List<Posicion> posicionesAdyacentesVacias = new ArrayList<>();

        // Verifica las 8 posiciones adyacentes
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                // Ignora la posición actual
                if (i == 0 && j == 0) {
                    continue;
                }

                int filaAdyacente = fila + i;
                int columnaAdyacente = columna + j;

                // Verifica si la posición adyacente es válida y está vacía
                if (esPosicionValida(filaAdyacente, columnaAdyacente) && esCasillaVacia(filaAdyacente, columnaAdyacente)) {
                    posicionesAdyacentesVacias.add(new Posicion(filaAdyacente, columnaAdyacente));
                }
            }
        }

        return posicionesAdyacentesVacias;
    }
}
