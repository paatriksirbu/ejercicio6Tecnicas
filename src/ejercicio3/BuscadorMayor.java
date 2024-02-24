package ejercicio3;

 public class BuscadorMayor implements NumeroMayor{  //Clase que implementa la interfaz NumeroMayor
    public int buscarNumeroMayor(int[] tabla){  //Método que busca el número mayor de la tabla
        int mayor = tabla[0];
        for (int i = 1; i < tabla.length; i++) {
            if (tabla[i] > mayor) {
                mayor = tabla[i];
            }
        }
        return mayor;
    }

}
