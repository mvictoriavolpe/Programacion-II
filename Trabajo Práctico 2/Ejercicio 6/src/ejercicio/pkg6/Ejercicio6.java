 //Contador de Positivos, Negativos y Ceros (for).  
package ejercicio.pkg6;

import java.util.Scanner;

public class Ejercicio6 {

    static final int CORTE = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("**Contador de Positivos, Negativos y Ceros**");

        int numero, positivos = 0, negativos = 0, cero = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa el numero " + i + ":");
            numero = Integer.parseInt(input.nextLine());
            if (numero > 0) { 
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                cero++;
            }

        }
        System.out.println("\nResultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + cero);

    }
}
