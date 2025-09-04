
package trabajo.practico.pkg4;


public class Main {

    public static void main(String[] args) {
     
        Empleado empleado1 = new Empleado("Perdro Garcia", "Vendedor", 500000, 1);
        Empleado empleado2 = new Empleado("Carlos Lopez", "Jefe", 1000000, 2);
        Empleado empleado3 = new Empleado("Jose Perez", "Recursos Humanos");
        Empleado empleado4 = new Empleado("Rodrigo Perez", "Developer");
        
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());
        
        System.out.println("-----Actualizando salarios------");
       
        empleado1.actualizarSalario(200000.0);
        empleado2.actualizarSalario(20);
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        
        System.out.println("El total de empleados es: " + Empleado.mostrarTotalEmpleados());
    }

}
