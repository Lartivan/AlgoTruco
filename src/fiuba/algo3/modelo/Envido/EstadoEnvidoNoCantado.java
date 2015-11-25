package src.fiuba.algo3.modelo;

public class EstadoEnvidoNoCantado
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
        return false;
    }
    
    public boolean cantarEnvido(Jugador j)
    {
        ciclo.setEstadoEnvido(new EstadoEnvidoCantado());
        return false;
    }
}

