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
        if (R.comparar(a, b) == Comparaciones.Menor)
            return CartaVersus.Pierde;
        else if (R.comparar(a, b) == Comparaciones.Igual)
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

/*================================*STATICS*===================================*/

    private static Ranking<Carta> R;
    
    // Inicializacion de clase.
    { if (R == null) inicializaR(); }

    private static void inicializaR()
    {
        R = new Ranking<Carta>();
        Set<Carta> S = new HashSet();
        
        S.add(new Carta(Palo.Espada, 1));
        R.agregar(S);
        
        S = new HashSet();
        S.add(new Carta(Palo.Basto, 1));
        R.agregar(S);

        S = new HashSet();
        S.add(new Carta(Palo.Espada, 5));
        S.add(new Carta(Palo.Basto, 5));
        S.add(new Carta(Palo.Oro, 5));
        S.add(new Carta(Palo.Copa, 5));
        R.agregar(S);

        S = new HashSet();
        S.add(new Carta(Palo.Espada, 4));
        S.add(new Carta(Palo.Basto, 4));
        S.add(new Carta(Palo.Oro, 4));
        S.add(new Carta(Palo.Copa, 4));
        R.agregar(S);
    }
}

