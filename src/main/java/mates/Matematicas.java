package mates;

public class Matematicas {
    public static double generarNumeroPi(long pasos) {
        int aciertos = 0;
        for (int i = 0; i < pasos; i++) {
            double x = Math.random() * 2 - 1;
            double y = Math.random() * 2 - 1;
            if (x * x + y * y <= 1) {
                aciertos++;
            }
        }
        return 4.0 * aciertos / pasos;
    }
}
