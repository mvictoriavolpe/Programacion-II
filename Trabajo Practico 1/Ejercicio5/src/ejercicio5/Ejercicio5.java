
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       //Declarar las variables
       int num1, num2, suma, resta, mult, division;
       
       //Solicitar los números
       System.out.print("Ingrese el primer numero entero: ");
       num1 = Integer.parseInt(input.nextLine());
       System.out.print("Ingrese el segundo numero entero: ");
       num2 = Integer.parseInt(input.nextLine());
       
       // Realizamos las operaciones
       suma = num1 + num2;
       resta = num1 - num2;
       mult = num1 * num2;
       division = num1 / num2;
       
       //Mostrar los resultados
       System.out.println("Suma: " + suma);
       System.out.println("Resta: " + resta);
       System.out.println("Multiplicación: " + mult);
       System.out.println("División: " + division);
    }

}
