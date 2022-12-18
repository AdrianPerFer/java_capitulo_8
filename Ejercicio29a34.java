import matematicas.*;
import java.util.Scanner;

public class Ejercicio29a34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Filas array: ");
        int n = sc.nextInt();
        System.out.print("Columnas array: ");
        int m = sc.nextInt();
        System.out.print("Valor mínimo del array: ");
        int x = sc.nextInt();
        System.out.print("Valor máximo del array: ");
        int y = sc.nextInt();
        System.out.print("Fila que queremos ver: ");
        int i = sc.nextInt();
        int[][] array = ArraysBi.generaArrayBiInt(n, m, x, y);
        int[] fila = ArraysBi.filaDeArrayBiInt(array, i);
        ArraysBi.muestraArrayBiInt(array);
        System.out.println();
        Arrays.muestraArrayInt(fila);
    }    
}
