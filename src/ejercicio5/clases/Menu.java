package ejercicio5.clases;
import ejercicio5.interfaz.ComandoDibujo;
import java.util.*;
public class Menu {
    private Lienzo lienzo;
    private Scanner sc;

    public Menu(Lienzo lienzo){
        this.lienzo = lienzo;
        this.sc = new Scanner(System.in);
    }

    public void mostrarMenu(){
        int opcion;
        System.out.println("\nBienvenido al taller de arte ASCII");
        System.out.println("Seleccione una opcion: ");

        do {
            System.out.println("1. Dibujar un caracter");
            System.out.println("2. Dibujar un rectangulo");
            System.out.println("3. Cambiar el caracter");
            System.out.println("4. Limpiar el lienzo");
            System.out.println("5. Salir");

            System.out.println("\ni son el numero de filas y j son el numero de columnas");

            opcion = sc.nextInt();
            ComandoDibujo comando = null;

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la posicion i: ");
                    int i = sc.nextInt();
                    System.out.println("Ingrese la posicion j: ");
                    int j = sc.nextInt();
                    System.out.println("Ingrese el caracter: ");
                    char caracter = sc.next().charAt(0);
                    comando = new DibujarCaracter(i, j, caracter);
                    break;
                case 2:
                    System.out.println("Ingrese la posicion i1: ");
                    int i1 = sc.nextInt();
                    System.out.println("Ingrese la posicion j1: ");
                    int j1 = sc.nextInt();
                    System.out.println("Ingrese la posicion i2: ");
                    int i2 = sc.nextInt();
                    System.out.println("Ingrese la posicion j2: ");
                    int j2 = sc.nextInt();
                    System.out.println("Ingrese el caracter: ");
                    char rCaracter = sc.next().charAt(0);

                    comando = new DibujarRectangulo(i1, j1, i2, j2, rCaracter);
                    break;
                case 3:
                    System.out.println("Ingrese la posicion i: ");
                    int iC = sc.nextInt();
                    System.out.println("Ingrese la posicion j: ");
                    int jC = sc.nextInt();
                    System.out.println("Ingrese el caracter: ");
                    char cCaracter = sc.next().charAt(0);
                    comando = new CambiarColor(iC, jC, cCaracter);
                    break;
                case 4:
                    lienzo.limpiarLienzo();
                    break;
                case 5:
                    System.out.println("Gracias por usar el taller de arte ASCII");
                    System.out.println("Hasta luego!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            if (comando != null) {
                comando.ejecutar(lienzo);
            }

            lienzo.mostrarLienzo();


        } while (opcion != 5);
        sc.close();

    }
}
