package src.fiuba.algo3.modelo;

import java.util.Collections;
import java.util.Collection;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class CalculadoraEnvido
{
    public static int calcular(Carta ... cartas)
    {
        Collection<Integer> valores = new ArrayList<Integer>();
        for (Carta c : cartas)
            valores.add(valor(c));
        return Collections.max(valores);
    }

    private static int valor(Carta c)
    {
        return c.getValor() < 10 ? c.getValor() : 0;
    }
}

