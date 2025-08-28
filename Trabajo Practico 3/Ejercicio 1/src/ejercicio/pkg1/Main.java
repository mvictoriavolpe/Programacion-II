
package ejercicio.pkg1;


public class Main {

 
    public static void main(String[] args) {
      // Crear estudiante
        Estudiante estUno = new Estudiante();
        estUno.setNombre("Maria");
        estUno.setApellido("Volpe");
        estUno.setCalificacion(8);
        estUno.setCurso("Programación II");
        

        // Mostrar info inicial
        estUno.mostrarInfo();

        // Subir y bajar calificación
        estUno.subirCalificacion(3);  // debería quedar en 10 (máximo permitido)
        estUno.bajarCalificacion(5);  // debería bajar a 5

        // Cambiar curso con setter
        estUno.setCurso("Estructura de Datos");
        System.out.println("Nuevo curso: " + estUno.getCurso());
        estUno.mostrarInfo();
        
    }
}
