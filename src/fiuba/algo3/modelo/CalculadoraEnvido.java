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
        return Math.max(
                Math.max(calculoParcial(cartas[0], cartas[1]),
                        calculoParcial(cartas[0], cartas[2])),
                calculoParcial(cartas[1], cartas[2]));
    }

    private static int valor(Carta c)
    {
        return c.getValor() < 10 ? c.getValor() : 0;
    }
    
    public static int calculoParcial(Carta c1, Carta c2)
    {
        if (c1.getPalo() == c2.getPalo())
            return valor(c1) + valor(c2) + 20;
        else
            return Math.max(valor(c1), valor(c2));
    }
}

