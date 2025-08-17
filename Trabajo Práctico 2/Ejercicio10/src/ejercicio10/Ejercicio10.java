
package ejercicio10;

import java.util.Scanner;


public class Ejercicio10 {

    public static int actualizarStock(int stockActual, int cantindadVendida, int cantidadRecibida){
        return stockActual - cantindadVendida + cantidadRecibida;
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stockActual, cantidadVendida, cantidadRecibida;
         
        System.out.println("**Actualizacion de stock**");
        
        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad vendida: ");
        cantidadVendida = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad recibida: ");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        
        System.out.println("El nuevo stock del producto es: " + actualizarStock(stockActual, cantidadVendida, cantidadRecibida));
    }

}
