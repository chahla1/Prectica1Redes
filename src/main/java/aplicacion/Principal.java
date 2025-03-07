package aplicacion;

import mates.Matematicas;

public class Principal {
    public static void main(String[] args) {
        long pasos = 1000000;
        System.out.println("El número PI es " + Matematicas.generarNumeroPi(pasos));
    }
}
