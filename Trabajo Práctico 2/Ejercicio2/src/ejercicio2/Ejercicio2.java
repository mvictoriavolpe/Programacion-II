// 2.	Determinar el Mayor de Tres Números. 
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("**Determinar el mayor de tres numeros enteros**");

        int num, mayor; //declaramos las variables
        mayor = 0; // Inicializamos

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese un número entero: ");
            num = Integer.parseInt(input.nextLine());

            if (num > mayor) {
                mayor = num;
            }
       
        }
        
        System.out.println("El mayor es: " + mayor);
        

    }

}
