/**
 * Crea una biblioteca de funciones para arrays (de una dimensión) de números
 * enteros que contenga las siguientes funciones:
 * 1. generaArrayInt: Genera un array de tamaño n con números aleatorios
 *  cuyo intervalo (mínimo y máximo) se indica como parámetro.
 * 2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
 * 3. maximoArrayInt: Devuelve el máximo del array que se pasa como
 *  parámetro.
 * 4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
 * 5. estaEnArrayInt: Dice si un número está o no dentro de un array.
 * 6. posicionEnArray: Busca un número en un array y devuelve la posición
 *  (el índice) en la que se encuentra.
 * 7. volteaArrayInt: Le da la vuelta a un array.
 * 8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un
 *  array.
 * 9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de
 *  un array.
 * 
 * @author: Adrián Perogil Fernández
 */
package matematicas;
public class Arrays {

    /*************************************************
     * @param n Tamaño del array                     *
     * @param x Valor mínimo del intervalo           *
     * @param y Valor máximo del intervalo           *
     * @return  Genera un array                      *
     *************************************************/
    public static int[] generaArrayInt(int n, int x, int y) {
        int [] array = new int [n];
        for (int i = 0; i < n; i++) {
            array[i] = (int)(Math.random()*(y - x + 1) + x);
        }
        return array;
    }
    
    /*************************************************
     * @param x Introduce un array                   *
     *************************************************/
    public static void muestraArrayInt(int x[]) {
        for (int i : x) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /*************************************************
     * @param x Introduce un array                   *
     * @return  Devuelve el mínimo                   *
     *************************************************/
    public static int minimoArrayInt(int x[]) {
        int minimo = Integer.MAX_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x[i] < minimo) {
                minimo = x[i];
            }
        }
        return minimo;
    }

    /*************************************************
     * @param x Introduce un array                   *
     * @return  Devuelve el máximo                   *
     *************************************************/
    public static int maximoArrayInt(int x[]) {
        int maximo = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > maximo) {
                maximo = x[i];
            }
        }
        return maximo;
    }
}
