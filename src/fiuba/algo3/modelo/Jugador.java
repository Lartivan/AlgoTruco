package src.fiuba.algo3.modelo;

import java.util.Collection;

public class Jugador
{
    private Mano mano;
    private Juego juego;
    
    public void jugar(Carta c)
    {
        if (mano == null)
            throw new RuntimeException("El Jugador no tiene cartas");
        
        mano.jugar(c);
        
        if (juego != null)
            juego.jugar(this, c);
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
    
    public void setJuego(Juego unJuego)
    {
        juego = unJuego;
    }
}

