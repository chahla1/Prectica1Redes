package tests;

import mates.Matematicas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatematicasTest {
    @Test
    public void testGenerarNumeroPi() {
        double piAproximado = Matematicas.generarNumeroPi(1000000);
        assertTrue(piAproximado > 3.1 && piAproximado < 3.2, "El valor de PI debe estar entre 3.1 y 3.2");
    }
}

