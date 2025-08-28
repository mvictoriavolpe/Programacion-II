package ejercicio.pkg1;

public class Estudiante {
// Atributos privados

    private String nombre;
    private String apellido;
    private String curso;
    private int calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        if (calificacion < 0) {
            this.calificacion = 0;
        } else if (calificacion > 10) {
            this.calificacion = 10; // por ejemplo, si la nota va de 0 a 10
        } else {
            this.calificacion = calificacion;
        }
    }
// Métodos de comportamiento
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
        }
        
    
    public void subirCalificacion(int puntos) {
        setCalificacion(this.calificacion + puntos);
        System.out.println("Nueva calificación: " + calificacion);
        }

    public void bajarCalificacion(int puntos) {
        setCalificacion(this.calificacion - puntos);
        System.out.println("Nueva calificación: " + calificacion);
        }
    }