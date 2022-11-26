/*
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden adecuado, te puedes ahorrar mucho trabajo.
 * Por ejemplo, la función esCapicua resulta trivial teniendo voltea y la función siguientePrimo también es muy fácil de implementar teniendo esPrimo.
 * 
 *      1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario. 
 * 
 *      2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
 * 
 *      3. siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
 * 
 *      4. potencia: Dada una base y un exponente devuelve la potencia.
 * 
 *      5. digitos: Cuenta el número de dígitos de un número entero.
 * 
 *      6. voltea: Le da la vuelta a un número.
 * 
 *      7. digitoN: s el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.
 * 
 *      8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra, devuelve -1.
 * 
 *      9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
 * 
 *      10. quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
 * 
 *      11. pegaPorDetras: Añade un dígito a un número por detrás.
 * 
 *      12. pegaPorDelante: Añade un dígito a un número por delante.
 * 
 *      13. trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
 * 
 *      14. juntaNumeros: Pega dos números para formar uno.
 * 
 *      @author: Adrián Perogil Fernández 
 *
 */

package matematicas;
public class Funciones {

    /*************************************************
     * @param n para saber si es capicúa             *
     * @return true si es capicúa, false si no lo es *
     *************************************************/
    public static boolean esCapicua(int n) {
        return voltea(n) == n;
    }

    /*************************************************
     * @param n pasa saber si el número es primo     *
     * @return true si es primo, false si no lo es   *
     *************************************************/
    public static boolean esPrimo(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                   return false;
            }
        }
        return true;
    }

    /*************************************************
     * @param n pasa saber el siguiente número primo *
     * @return para saber el siguiente primo         *
     *************************************************/
    public static int siguientePrimo(int n) {
        while (!esPrimo(++n)) {};
        return n;
    }    

    /*************************************************
     * @param b base de la potencia                  *
     * @param e exponente de la potencia             *
     * @return resultado de la potencia              *
     *************************************************/
    public static double potencia(int b, int e) {
        double numero = Math.pow(b, e);
        return numero;
    }  

    /*************************************************
     * @param n número para saber sus digitos        *
     * @return cuantos digitos tiene número          *
     *************************************************/
    public static int digitos(int n) {
        int digitos = 0;
        while ( n > 0 ) {
            n /= 10;
            digitos++;
        }
        return digitos;
    } 

    /*************************************************
     * @param n pasa saber el número volteado        *
     * @return el número volteado                    *
     *************************************************/
    public static int voltea(int n) {
        int invertido = 0;
        while (n > 0) {
            invertido = (invertido * 10) + (n % 10);
            n /= 10;
        }
        return invertido;
    }

    /*************************************************
     * @param n Devuelve el dígito que está en la    *
     * posición n de un número entero. Se empieza    *
     * contando por el 0 y de izquierda a derecha    *
     * @return devuelve el dígito                    *
     *************************************************/
    public static int digitoN(int x, int n) {
        x = voltea(x);
        while (n-- > 0) {
            x /= 10;
        }
        return (x % 10);
    } 
    
    /*************************************************
     * @param n Da la posición de la primera         * 
     * ocurrencia de un dígito dentro de un número   *
     * entero. Si no se encuentra, devuelve -1.      *
     * @return devuelve el dígito                    *
     *************************************************/
    public static int posicionDeDigito(int x, int n) {
        x = voltea(x);
        int posicion = 0;
        do {
            if (x % 10 == n) {
                return posicion;
            }
            x /= 10;
            posicion++;
        } while (x > 0);
        return -1;
    } 
}
