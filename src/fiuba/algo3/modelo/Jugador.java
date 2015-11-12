package src.fiuba.algo3.modelo;

public class Jugador
{
    private Mano mano;
    
    public void jugar(Carta c)
    {
        if (mano == null)
            throw new RuntimeException("El Jugador no tiene cartas");
    }

    public void repartir(Mano unaMano)
    {
        mano = unaMano;
    }
}

