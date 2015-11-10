package src.fiuba.algo3.modelo;

import src.fiuba.algo3.ranking.Ranking;
import src.fiuba.algo3.ranking.Comparaciones;

import java.util.Set;
import java.util.HashSet;

public class Carta
{
    private Palo palo;
    private int valor;
    
    public Carta(Palo p, int v)
    {
        palo = p;
        valor = v;
    }
    
    public static CartaVersus comparar(Carta a, Carta b)
    {
        if (a.valor < b.valor)
            return CartaVersus.Pierde;
        else if (a.valor == b.valor)
            return CartaVersus.Emparda;
        else
            return CartaVersus.Mata;
    }
    
    public boolean equals(Object x)
    {
        return palo == ((Carta)x).palo && valor == ((Carta)x).valor;
    }

    public int hashCode()
    {
        return palo.hashCode() ^ new Integer(valor).hashCode();
    }
}

