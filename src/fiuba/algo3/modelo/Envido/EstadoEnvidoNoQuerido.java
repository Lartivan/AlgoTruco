package src.fiuba.algo3.modelo;

public class EstadoEnvidoNoQuerido
        implements EstadoEnvido
{
    private Ciclo ciclo;
    
    public void setCiclo(Ciclo c)
    {
        ciclo = c;
    }

    public void envidoQuiero(Jugador j)
    {
    }
    
    public void envidoNoQuiero(Jugador j)
    {
    }
    
    public void cantarEnvido(Jugador j)
    {
    }
}

