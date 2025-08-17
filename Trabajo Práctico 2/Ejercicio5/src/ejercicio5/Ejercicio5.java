// Suma de Números Pares (while)
package ejercicio5;

import java.util.Scanner;


public class Ejercicio5 {

    static final int CORTE = 0;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("**Suma de Numeros Pares**");
        int num = 35658827, acumulado = 0;
        
        while (num != CORTE){
            System.out.print("Ingresa un numero ( " + CORTE + " para cortar): ");
            num = Integer.parseInt(input.nextLine());
            if (num % 2 == 0){
                acumulado = num + acumulado;
            }
        }
        System.out.println("La suma de los números pares es: " + acumulado);
        
    }

}
