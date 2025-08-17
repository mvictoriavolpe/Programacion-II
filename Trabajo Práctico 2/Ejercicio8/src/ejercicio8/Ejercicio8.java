
package ejercicio8;

import java.util.Scanner;


public class Ejercicio8 {
    
    static double precioBase;
    
    public static double calcularPrecioFinal(double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase * (impuesto / 100)) - (precioBase * (descuento / 100));
        return precioFinal;
        
    }
            
            
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("**Cálculo del Precio Final con impuesto y descuento**");
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = input.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = input.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = input.nextDouble();

        double precioFinal = calcularPrecioFinal(impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);
        
       
    }
}