
package ejercicio12;


public class Ejercicio12 {

    public static void main(String[] args) {
    
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales: ");
        for (int i = 0; i < precios.length; i++){
            System.out.println("Precios: $" + precios[i]);
        }
        precios[2] = 129.99;
        
        System.out.println("Precios modificados: ");
        for (int i = 0; i < precios.length; i++){
            System.out.println("Precios: $" + precios[i]);
        }        
    }

}
