
package ejercicio.pkg4;

public class Main {

    public static void main(String[] args) {
        Gallina gallina1 = new Gallina();
        gallina1.setIdGallina("Gallina01");
        gallina1.setEdad(2);
        gallina1.setHuevosPuestos(20);
        
        Gallina gallina2 = new Gallina();
        gallina2.setIdGallina("Gallina02");
        gallina2.setEdad(4);
        gallina2.setHuevosPuestos(40);
        
        System.out.println("***Gallinas en granja digital***");
        System.out.println("***GALLINA 1***");
        gallina1.mostrarEstado();
        gallina1.envejecer();
        gallina1.mostrarEstado();
        gallina1.ponerHuevo(10);
        gallina1.mostrarEstado();
        
        System.out.println("***Gallinas en granja digital***");
        System.out.println("***GALLINA 2***");
        gallina2.mostrarEstado();
        gallina2.envejecer();
        gallina2.mostrarEstado();
        gallina2.ponerHuevo(50);
        gallina2.mostrarEstado();
    }

}
