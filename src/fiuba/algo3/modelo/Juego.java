package src.fiuba.algo3.modelo;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class Juego
{
    private List<Jugador> jugadores;
    private Mazo mazo;

    public Juego(Jugador ... jugadores)
    {
        this.jugadores = new ArrayList();
        for (Jugador x : jugadores)
            this.jugadores.add(x);
        
        mazo = new Mazo();
    }

    public void repartir()
    {
        for (Jugador x : jugadores)
            x.repartir(new Mano(mazo.sacar(), mazo.sacar(), mazo.sacar()));
    }

    public Jugador getGanadorRonda(int index)
    {
        return jugadores.get(0);
    }
}

