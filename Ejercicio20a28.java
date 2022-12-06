import java.util.Scanner;
import matematicas.Arrays;
public class Ejercicio20a28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Genero el array
        int[] array = matematicas.Arrays.generaArrayInt(20, 0, 100);
        // Muestro el array
        matematicas.Arrays.muestraArrayInt(array);
        System.out.print("¿Qué número quieres saber si está en el array?: ");
        int n = sc.nextInt();
        // Mínimo del array
        System.out.println("Mínimo: " + matematicas.Arrays.minimoArrayInt(array));
        // Máximo del array
        System.out.println("Máximo: " + matematicas.Arrays.maximoArrayInt(array));
        // Media del array
        System.out.println("Media: " + matematicas.Arrays.mediaArrayInt(array));
        // Está en el array
        System.out.println("¿Está " + n + " en el array?: " + matematicas.Arrays.estaEnArrayInt(array, n));
        // Está en el array
        System.out.println("Posición: " + matematicas.Arrays.posicionEnArray(array, n));
    }
}
