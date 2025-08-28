
package ejercicio2;


public class Main {

    
    public static void main(String[] args) {
        //Creo mi mascota
       Mascota mascota1 = new Mascota();
       mascota1.setNombre("Penny");
       mascota1.setEspecie("Gato");
       mascota1.setEdad(14);    
       
    //Llamo a los metodos
    
    mascota1.mostrarInfo();
    mascota1.cumplirAnios(1);
      mascota1.mostrarInfo();
    
    
    }

}
