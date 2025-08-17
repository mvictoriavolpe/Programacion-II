
package ejercicio11;

import java.util.Scanner;


public class Ejercicio11 {

    //declarar una varible global 
    static double descuentoEspecial = 0.10;
    
    public static void calcularDescuentoEspecial(double precio){

    double descuentoAplicado = precio* descuentoEspecial; 

    System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
    System.out.println("El precio final con descuento es: " + (precio - descuentoAplicado));
    
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio;
         
        System.out.println("**Descuento Especial**");
        
        System.out.print("Ingrese el precio del producto:  ");
        precio = Double.parseDouble(input.nextLine());
        
        calcularDescuentoEspecial(precio);
    }
}
