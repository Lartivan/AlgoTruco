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

    public int getValor()
    {
        return valor;
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
        S.add(new Carta(Palo.Espada, 7));
        R.agregar(S);

        S = new HashSet();
        S.add(new Carta(Palo.Oro, 7));
        R.agregar(S);

        S = new HashSet();
        S.add(new Carta(Palo.Espada, 3));
        S.add(new Carta(Palo.Basto, 3));
        S.add(new Carta(Palo.Oro, 3));
        S.add(new Carta(Palo.Copa, 3));
        R.agregar(S);

        S = new HashSet();
        S.add(new Carta(Palo.Espada, 2));
        S.add(new Carta(Palo.Basto, 2));
        S.add(new Carta(Palo.Oro, 2));
        S.add(new Carta(Palo.Copa, 2));
        R.agregar(S);

        S = new HashSet();
        S.add(new Carta(Palo.Copa, 1));
        S.add(new Carta(Palo.Oro, 1));
        R.agregar(S);

        S = new HashSet();
        S.add(new Carta(Palo.Espada, 12));
        S.add(new Carta(Palo.Basto, 12));
        S.add(new Carta(Palo.Oro, 12));
        S.add(new Carta(Palo.Copa, 12));
        R.agregar(S);

        S = new HashSet();
        S.add(new Carta(Palo.Espada, 11));
        S.add(new Carta(Palo.Basto, 11));
        S.add(new Carta(Palo.Oro, 11));
        S.add(new Carta(Palo.Copa, 11));
        R.agregar(S);

        S = new HashSet();
        S.add(new Carta(Palo.Espada, 10));
        S.add(new Carta(Palo.Basto, 10));
        S.add(new Carta(Palo.Oro, 10));
        S.add(new Carta(Palo.Copa, 10));
        R.agregar(S);

        S = new HashSet();
        S.add(new Carta(Palo.Copa, 7));
        S.add(new Carta(Palo.Basto, 7));
        R.agregar(S);

        S = new HashSet();
        S.add(new Carta(Palo.Espada, 6));
        S.add(new Carta(Palo.Basto, 6));
        S.add(new Carta(Palo.Oro, 6));
        S.add(new Carta(Palo.Copa, 6));
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

