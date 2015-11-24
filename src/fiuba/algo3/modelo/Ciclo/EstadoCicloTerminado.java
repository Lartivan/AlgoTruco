package src.fiuba.algo3.modelo;

public class EstadoCicloTerminado
        implements EstadoCiclo
{
    public void jugarCarta(Jugador j, Carta c)
    {
        throw new RuntimeException("Ciclo terminado.");
    }

    public void envidoQuiero(Jugador j)
    {
        throw new RuntimeException("Ciclo terminado.");
    }

    public void envidoNoQuiero(Jugador j)
    {
        throw new RuntimeException("Ciclo terminado.");
    }

    public void cantarEnvido(Jugador j)
    {
        throw new RuntimeException("Ciclo terminado.");
    }

    public void cantarRealEnvido(Jugador j)
    {
        throw new RuntimeException("Ciclo terminado.");
    }

    public void cantarFaltaEnvido(Jugador j)
    {
        throw new RuntimeException("Ciclo terminado.");
    }


    public void trucoQuiero(Jugador j)
    {
        throw new RuntimeException("Ciclo terminado.");
    }

    public void trucoNoQuiero(Jugador j)
    {
        throw new RuntimeException("Ciclo terminado.");
    }

    public void cantarTruco(Jugador j)
    {
        throw new RuntimeException("Ciclo terminado.");
    }

    public void cantarRetruco(Jugador j)
    {
        throw new RuntimeException("Ciclo terminado.");
    }

    public void cantarValeCuatro(Jugador j)
    {
        throw new RuntimeException("Ciclo terminado.");
    }
}

