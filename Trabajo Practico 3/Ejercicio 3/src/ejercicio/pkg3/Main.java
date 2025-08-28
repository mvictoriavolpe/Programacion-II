
package ejercicio.pkg3;


public class Main {

   
    public static void main(String[] args) {
    //Creo un Libro
       System.out.println("*** CREANDO LIBRO ***");
       Libro libro1 = new Libro();
       libro1.setTitulo(" 100 Anios de Soledad");
       libro1.setAutor("Gabriel Garcia Marquez");
       libro1.setAnioPublicacion(1967);
       
     
    //Llamo a los metodos
    
    libro1.mostrarInfo();
    System.out.println("=== INTENTANDO MODIFICAR CON AÑO INVALIDO ===");
    libro1.setAnioPublicacion (1005);
    System.out.println("=== INTENTANDO MODIFICAR CON AÑO VALIDO ===");
    libro1.setAnioPublicacion (2015);
    System.out.println("=== NUEVA INFORMACION ===");
    libro1.mostrarInfo();
    
    }

}
