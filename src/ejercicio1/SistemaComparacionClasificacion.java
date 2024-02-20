package ejercicio1;
import java.util.*;


public class SistemaComparacionClasificacion {
    public static void main(String[] args) {    //Metodo principal que crea un objeto de la clase FuncionesNumeros y llama a los metodos mayor y clasificar
        FuncionesNumeros clasificar = new FuncionesNumeros();
        Scanner sc = new Scanner(System.in);

        //Pedimos los numeros al usuario y despues procedemos a llamar a los metodos de la clase FuncionesNumeros.
        System.out.println("Ingrese el primer número: ");
        int a = sc.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int b = sc.nextInt();

        System.out.println("El número mayor es: " + clasificar.mayor(a, b) + " y la clasificacion es: " + clasificar.clasificar(a, b));

        sc.close();
    }
}
