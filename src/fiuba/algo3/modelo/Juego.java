package src.fiuba.algo3.modelo;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class Juego
{
    private List<Jugador> jugadores;

    public Juego(Jugador ... jugadores)
    {
        this.jugadores = new ArrayList();
        for (Jugador x : jugadores)
            this.jugadores.add(x);
    }

    public void repartir()
    {
    }
}

