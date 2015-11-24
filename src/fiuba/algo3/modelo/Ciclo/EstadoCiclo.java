package src.fiuba.algo3.modelo;

public interface EstadoCiclo
{
    public void jugarCarta(Jugador j, Carta c);

    public void envidoQuiero(Jugador j);
    public void envidoNoQuiero(Jugador j);
    public void cantarEnvido(Jugador j);
    public void cantarRealEnvido(Jugador j);
    public void cantarFaltaEnvido(Jugador j);

    public void trucoQuiero(Jugador j);
    public void trucoNoQuiero(Jugador j);
    public void cantarTruco(Jugador j);
    public void cantarRetruco(Jugador j);
    public void cantarValeCuatro(Jugador j);
}

