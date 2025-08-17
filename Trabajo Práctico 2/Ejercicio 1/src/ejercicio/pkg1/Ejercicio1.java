
package ejercicio.pkg1;

//año Bisiesto

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //Declarar las variables
      int anio;
      //Solicitar año
      System.out.print("Ingrese un año: ");
      anio = input.nextInt();
      if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 ==0)){
          System.out.println("El año " + anio + " es bisiesto.");
      } else {
          System.out.println("El año " + anio + " no es bisiesto.");
      }
    }
}
