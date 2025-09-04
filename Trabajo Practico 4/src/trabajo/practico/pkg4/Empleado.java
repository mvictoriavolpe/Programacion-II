
package trabajo.practico.pkg4;


public class Empleado {
    // Defino los atributos de instancia

    private String nombre;
    private String puesto;
    private double salario;
    private int id;
    //Defino un atributa estatico
    private static int totalEmpleados = 0;

    //Constructor que recibe todos los atributos
    public Empleado(String nombre, String puesto, double salario, int id) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.id = id;
        totalEmpleados++;
    }
    
    //Constructor sobrecargado que recibe solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.id = totalEmpleados +1; //asigno un id
        this.salario = 5000000; //asigno un salario
        totalEmpleados++;
    }
       //Metodo porcentaje de aumento
    public void actualizarSalario(int porcentaje){
        salario += salario*porcentaje/100;
    }
   
    // Metodo cantidad fija a aumentar
    public void actualizarSalario(double cantidad){
        salario += cantidad;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + ", id=" + id + '}';
    }
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    
    
 
}
    
    
    
    


