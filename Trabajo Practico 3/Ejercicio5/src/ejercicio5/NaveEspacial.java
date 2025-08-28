
package ejercicio5;


public class NaveEspacial {

    private String nombre;
    private int combustible;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCombustible() {
        return combustible;
    }
    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    public void despegar() {
        System.out.println("***PREPARESE LA NAVE ESTA POR DESPEGAR***");
        System.out.println("------------------------");
    }
    public void avanzar(int distancia) {
        if (combustible > 50) {
            System.out.println("***PREPARESE LA NAVE ESTA POR AVANZAR***");
        } else {
            System.out.println("***Debe regargar combustible***");
        }
    }
    public void recargarCombustible(int cantidad){
        combustible += cantidad;
    }
    public void mostrarEstado() {
        System.out.println("Nombre de la nave: " + nombre);
        System.out.println("***Cantidad de combustible " + combustible);
    }

}
