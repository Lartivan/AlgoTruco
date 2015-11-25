package src.fiuba.algo3.modelo;

public interface EstadoEnvido
{
    public void setCiclo(Ciclo c);
    public void envidoQuiero(Jugador j);
    public void envidoNoQuiero(Jugador j);
    public void cantarEnvido(Jugador j);
}

