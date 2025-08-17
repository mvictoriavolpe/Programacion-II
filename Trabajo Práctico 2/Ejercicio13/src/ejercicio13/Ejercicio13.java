
package ejercicio13;


public class Ejercicio13 {

    public static void imprimirArray(double[] precios, int indice){
        if (indice < precios.length){
            System.out.println("Precio: $" + precios[indice]);
            imprimirArray(precios, ++indice);
            }
            
       
    }

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        imprimirArray(precios, 0);
        
        precios[2] = 129.99;
        
        System.out.println("Precios modificado: ");
        imprimirArray(precios, 0);        
    }

}
