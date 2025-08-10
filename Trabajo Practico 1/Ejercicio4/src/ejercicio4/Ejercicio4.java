
package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Declarar las variables
        String nombre;
        int edad;
        
        // Solicitar nombre
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();

        // Solicitar edad
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());

        // Mostrar resultados
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

    
    }
}
    }

}
