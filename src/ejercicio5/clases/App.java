package ejercicio5.clases;

public class App {
    public static void main(String[] args) {
        Lienzo lienzo = new Lienzo(10, 40);
        Menu menu = new Menu(lienzo);
        menu.mostrarMenu();
        lienzo.mostrarLienzo();
    }
}
