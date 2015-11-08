package src.fiuba.algo3.modelo;

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
    
    public boolean equals(Carta x) { return true; }

    public int hashCode() { return 1234; }
}

