package ejercicio.pkg4;

public class Gallina {

    private String idGallina;
    private int edad;
    private int huevosPuestos;

    public String getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(String idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    public void mostrarEstado(){
        System.out.println("Identificacion de gallina: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Cantidad de huevos puestos " + huevosPuestos);
        System.out.println("----------------------------------------");
    }
    public void envejecer(){
        edad++;
    }
    
    public void ponerHuevo(int huevos){
        huevosPuestos += huevos;
    }
}
