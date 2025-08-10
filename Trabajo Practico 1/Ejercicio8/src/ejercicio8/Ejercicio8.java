
//a.	Escribe un programa que divida dos números enteros ingresados por el usuario.  
//b.	Modifica el código para usar double en lugar de int y compara los resultados. 

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num1, num2;
       double division;
       
       System.out.print("Ingrese número 1: ");
       num1 =Integer.parseInt(input.nextLine());
       
       System.out.print("Ingrese número 2: ");
       num2 =Integer.parseInt(input.nextLine());
       
       division = (double)num1/num2;
       
       
       System.out.println("El resultado de dividir " + num1 + " / " + num2 + " es " + division);
       
       
    }

}
