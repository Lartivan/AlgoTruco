package src.fiuba.algo3.modelo;

public class EstadoEnvidoCantado
        implements EstadoEnvido
{
    private Ciclo ciclo;
    
    public void setCiclo(Ciclo c)
    {
        ciclo = c;
    }

    public boolean envidoQuiero(Jugador j)
    {
        return false;
    }
    
    public boolean envidoNoQuiero(Jugador j)
    {
        ciclo.setEstadoEnvido(new EstadoEnvidoNoQuerido());
        return false;
    }
    
    public boolean cantarEnvido(Jugador j)
    {
        return false;
    }
}

