// Calculadora de Descuento según categoría. 
package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("**Calculadora de Descuento según categoría**");
        
        int precio; // Declaro la variable precio
        char letra; // Declaro la variable para categoria de descuento
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Integer.parseInt(input.nextLine());
        
        System.out.print("ngrese la categoría del producto (A, B o C): ");
        letra = input.nextLine().charAt(0);

        switch(letra){
            case 'A':
                System.out.println("Descuento aplicado: 10%");
                System.out.println("Precio final: " + ((double)precio*(1-0.1)));
                break;
                
            case 'B':
                System.out.println("Descuento aplicado: 15%");
                System.out.println("Precio final: " + ((double)precio*(1-0.15)));
                break;
            case 'C':
                System.out.println("Descuento aplicado: 20%");
                System.out.println("Precio final: " + ((double)precio*(1-0.2)));
                break;
        }
    }

}
