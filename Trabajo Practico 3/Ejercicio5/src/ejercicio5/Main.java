package ejercicio5;

import java.util.HashSet;

public class Main {

  public static void main(String[] args) {
        NaveEspacial superNave = new NaveEspacial();
        superNave.setNombre("Super Nave");
        superNave.setCombustible(50);
        superNave.mostrarEstado();
        superNave.despegar();
        superNave.avanzar(100);
        superNave.recargarCombustible(100);
        superNave.avanzar(100);
        superNave.mostrarEstado();
    }
}
