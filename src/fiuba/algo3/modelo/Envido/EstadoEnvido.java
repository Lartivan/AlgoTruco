package src.fiuba.algo3.modelo;

public interface EstadoEnvido
{
    public void setCiclo(Ciclo c);
    public boolean envidoQuiero(Jugador j);
    public boolean envidoNoQuiero(Jugador j);
    public boolean cantarEnvido(Jugador j);
}

