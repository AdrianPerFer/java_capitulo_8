import matematicas.Funciones;
import java.util.Scanner;
public class Ejercicio01a14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Funciones!!!, elige la que quieras (-1 para salir del programa)");
        System.out.println("1. esCapicua");
        System.out.println("2. esPrimo");
        System.out.println("3. siguientePrimo");
        System.out.println("4. potencia");
        System.out.println("5. digitos");
        System.out.println("6. voltea");
        System.out.println("7. digitoN");
        System.out.println("8. posicionDeDigito");
        System.out.println("9. quitaPorDetras");
        System.out.println("10. quitaPorDelante");
        System.out.println("11. pegaPorDetras");
        System.out.println("12. pegaPorDelante");
        System.out.println("13. trozoDeNumero");
        System.out.println("14. juntaNumeros");
        System.out.println();
        int opcion;
        int numero;
        int numero2;
        do {
            System.out.print("Introduce la opción (1 - 14) (-1 para salir): ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Introduce un numero: ");
                    numero = sc.nextInt();
                    if (matematicas.Funciones.esCapicua(numero)) {
                        System.out.println(numero + " es capicúa");
                    } else {
                        System.out.println(numero + " no es capicúa");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Introduce un numero: ");
                    numero = sc.nextInt();
                    if (matematicas.Funciones.esPrimo(numero)) {
                        System.out.println(numero + " es primo");
                    } else {
                        System.out.println(numero + " no es primo");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Introduce un numero: ");
                    numero = sc.nextInt();
                    System.out.println("El siguiente primo mayor a " + numero + " es " + matematicas.Funciones.siguientePrimo(numero));
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Introduce la base de la potencia: ");
                    numero = sc.nextInt();
                    System.out.print("Introduce el exponente de la potencia: ");
                    numero2 = sc.nextInt();
                    System.out.println("Base: " + numero);
                    System.out.println("Exponente: " + numero2);
                    System.out.println("Resultado: " + (int)matematicas.Funciones.potencia(numero, numero2));
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Introduce un numero: ");
                    numero = sc.nextInt();
                    System.out.println(numero + " tiene: " + matematicas.Funciones.digitos(numero) + " digitos");
                    System.out.println();
                    break;
                case 6:
                    System.out.print("Introduce un numero: ");
                    numero = sc.nextInt();
                    System.out.println("Número invertido: " + matematicas.Funciones.voltea(numero));
                    System.out.println();
                    break;
                case 7:
                    System.out.print("Introduce un numero: ");
                    numero = sc.nextInt();
                    System.out.print("Introduce la posición que quieras saber: ");
                    numero2 = sc.nextInt();
                    System.out.println("Numero: " + numero);
                    System.out.println("Posición: " + numero2);
                    System.out.println("Resultado: " + matematicas.Funciones.digitoN(numero, numero2));
                    System.out.println();
                    break;
                case 8:
                    System.out.print("Introduce un numero: ");
                    numero = sc.nextInt();
                    System.out.print("Introduce el digito para saber su posición: ");
                    numero2 = sc.nextInt();
                    System.out.println("Numero: " + numero);
                    System.out.println("Digito: " + numero2);
                    System.out.println("Posición de " + numero2 + ": " + matematicas.Funciones.posicionDeDigito(numero, numero2));
                    System.out.println();
                    break;
                case 9:
                    
                    break;
                case 10:
                    
                    break;
                case 11:
                    
                    break;
                case 12:
                    
                    break;
                case 13:
                    
                    break;
                case 14:
                    
                    break;
                default:
                    System.out.println("QUE TENGA UN BUEN DÍA!!!");
                    opcion = -1;
            }
        } while (opcion != -1);
        sc.close();
    }
}
