import java.util.Scanner;
import matematicas.Arrays;
public class Ejercicio20a28 {
    public static void main(String[] args) {
        // Genero el array
        int[] array = matematicas.Arrays.generaArrayInt(20, 0, 100);
        // Muestro el array
        matematicas.Arrays.muestraArrayInt(array);
        // Mínimo del array
        System.out.println("Mínimo: " + matematicas.Arrays.minimoArrayInt(array));
        // Máximo del array
        System.out.println("Máximo: " + matematicas.Arrays.maximoArrayInt(array));
    }
}
