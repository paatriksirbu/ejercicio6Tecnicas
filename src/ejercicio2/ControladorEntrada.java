package ejercicio2;

import java.util.Scanner;

public class ControladorEntrada {
    private static int contadorIntentos = 0;

    public int getContadorIntentos() {
        return contadorIntentos;
    }

    public static int[] obtenerIntento() {  // Obtener intento del usuario
        Scanner scanner = new Scanner(System.in);
        int fila = 0;
        int columna = 0;
        boolean entradaValida = false;

        while (!entradaValida){
            try{
                System.out.print("Ingrese fila (1-4): ");
                fila = scanner.nextInt();
                System.out.print("Ingrese columna (1-4): ");
                columna = scanner.nextInt();
                if (fila >= 1 && fila <= 4 && columna >= 1 && columna <= 4){
                    entradaValida = true;
                } else {
                    System.out.println("Entrada inválida. Ingrese un número entre 1 y 4.");
                }
            } catch (Exception e){
                System.out.println("Entrada inválida. Ingrese SOLO numeros.");
                scanner.nextLine();
            }
        }
        contadorIntentos++;
        return new int[]{fila, columna};
    }
}
