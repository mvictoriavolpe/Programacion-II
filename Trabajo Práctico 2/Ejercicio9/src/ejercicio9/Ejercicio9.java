
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static double calcularCostoEnvio(double peso, String zona){
        
        if (zona.equalsIgnoreCase("nacional")){
            return peso*5;
        }
        
        return peso*10;
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }
            
    public static void main(String[] args) {
        double precioProducto, peso;
        String zona;
        Scanner input = new Scanner(System.in);
         
        System.out.println("**Calcular costo de envio y total de compra**");
        
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese la zona de envío (Nacional/Internacional):");
        zona = input.nextLine();
        
        System.out.println("Costo te envio es: " + calcularCostoEnvio(peso, zona));
        
        System.out.println("El total a pagar es: " + calcularTotalCompra(precioProducto, calcularCostoEnvio(peso, zona)));
    }

}
