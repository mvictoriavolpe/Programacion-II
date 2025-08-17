// 3.	Clasificación de Edad
package ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("**Clasificacion por rangos de edad**");
        
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        if (edad <  12) {
            System.out.println("Eres un niño/a.");
        }
        else if (edad >= 12 && edad < 18) {
            System.out.println("Eres un Adolescente/a.");
        }
        else if (edad >= 18 && edad < 60) {
            System.out.println("Eres un Adulto/a.");
        }
        else {
            System.out.println("Eres un Adulto/a Mayor.");
        }

    }

}
