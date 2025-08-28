
package ejercicio.pkg3;


public class Libro {
//Atributos privados
    
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + anioPublicacion);
        System.out.println("----------------------------------------");
        }
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion<1400 || anioPublicacion> 2025){
            System.out.println("Error: '" + anioPublicacion + "' no es un año válido. Debe ser entre 1400 y 2025.");
        }
        else {
            this.anioPublicacion = anioPublicacion;
            
            
        }
               
    }

}
