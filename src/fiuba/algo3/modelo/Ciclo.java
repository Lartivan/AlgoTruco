package src.fiuba.algo3.modelo;

import java.util.List;
import java.util.ArrayList;

public class Ciclo
{
    private List<Ronda> rondas;
    
    public Ciclo()
    {
        rondas = new ArrayList<Ronda>();
        rondas.add(new Ronda());
    }
    
    public Jugador getGanador()
    {
        return null;
    }
    
    public Ronda getRonda(int numeroDeRonda)
    {
        return rondas.get(numeroDeRonda - 1);
    }
    
    public void jugar(Jugador unJugador, Carta unaCarta)
    {
        rondas.get(rondas.size() - 1).jugar(unJugador, unaCarta);
    }
}

