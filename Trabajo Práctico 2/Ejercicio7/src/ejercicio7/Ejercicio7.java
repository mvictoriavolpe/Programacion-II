//Validación de Nota entre 0 y 10 (do-while)
package ejercicio7;

import java.util.Scanner;


public class Ejercicio7 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("**Validación de Nota entre 0 y 10**");
        int nota;
        
        
        do{ 
            System.out.print("Ingrese una nota (0-10): ");
            nota = Integer.parseInt(input.nextLine());
            if (nota<0 || nota>10){
                System.out.println("Error: Nota inválida. Intente de nuevo.");
            }
        }while (nota<0 || nota>10);
       
        System.out.println("Nota guardada correctamente.");
    }

}
