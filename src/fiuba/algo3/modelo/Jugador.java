package src.fiuba.algo3.modelo;

import java.util.Collection;

public class Jugador
{
    private Mano mano;
    
    public void jugar(Carta c)
    {
        if (mano == null)
            throw new RuntimeException("El Jugador no tiene cartas");
        mano.jugar(c);
    }

    public void repartir(Mano unaMano)
    {
        mano = unaMano;
    }

    public Collection<Carta> getCartasEnMano()
    {
        try
        {
            return mano.getCartasEnMano();
        }
        catch (NullPointerException e)
        {
            return null;
        }
    }
}

