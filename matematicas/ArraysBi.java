/**
 * 
Crea una biblioteca de funciones para arrays bidimensionales (de dos dimensiones) de números enteros que contenga las siguientes funciones:
1. generaArrayBiInt: Genera un array de tamaño n x m con números
    aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
2. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como
    parámetro.
3. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se
    pasa como parámetro.
4. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array
    con dos elementos) de la primera ocurrencia de un número dentro de un
    array bidimensional. Si el número no se encuentra en el array, la función
    devuelve el array {-1, -1}.
5. esPuntoDeSilla: Dice si un número es o no punto de silla, es decir,
    mínimo en su fila y máximo en su columna.
6. diagonal: Devuelve un array que contiene una de las diagonales del array
    bidimensional que se pasa como parámetro. Se pasan como parámetros
    fila, columna y dirección. La fila y la columna determinan el número que
    marcará las dos posibles diagonales dentro del array. La dirección es
    una cadena de caracteres que puede ser “nose” o “neso”. La cadena
    “nose” indica que se elige la diagonal que va del noroeste hacia el sureste,
    mientras que la cadena “neso” indica que se elige la diagonal que va del
    noreste hacia el suroeste.
 *
 * @author: Adrián Perogil Fernández    
 */
package matematicas;
public class ArraysBi {

    /*************************************************
     * @param n Tamaño filas                         *
     * @param m Tamaño columnas                      * 
     * @param x Valor mínimo del intervalo           *
     * @param y Valor máximo del intervalo           *
     * @return  Genera un array bidismensional       *
     *************************************************/
    public static int[][] generaArrayBiInt(int n, int m, int x, int y){
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (int)(Math.random()*(y-x+1)+x);
            }
        }
        return array;
    }

    /*************************************************
     * @param array Introduce un array bidimensional *
     * @return  Muestra un array bidimensional       *
     *************************************************/
    public static void muestraArrayBiInt(int[][] array){
        for (int[] i : array) {
            for (int j : i) {
                System.out.printf("%3d", j);
            }
            System.out.println();
        }
    }

    /*************************************************
     * @param array Introduce un array bidimensional *
     * @param i Indica que fila quieres              *
     * @return  Devuelve la fila i-ésima             *
     *************************************************/
    public static int[] filaDeArrayBiInt(int[][] array, int i){
        return array[i];
    }

    /*************************************************
     * @param array Introduce un array bidimensional *
     * @param j Indica que columna quieres           *
     * @return  Devuelve la columna j-ésima          *
     *************************************************/
    public static int[][] columnaDeArrayBiInt(int[][] array, int j){
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                if (k == j) {
                    System.out.printf("\n%3d", array[i][k]);
                }
            }
        }
        return array;
    }
}
