package src.fiuba.algo3.modelo;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Ronda
{
    private Map<Carta, Jugador> cartaJugador = new HashMap<Carta, Jugador>();
    
    public void jugar(Jugador j, Carta c)
    {
        cartaJugador.put(c, j);
    }
    
    public Jugador getGanador()
    {
        Set<Carta> cartasJugadas = cartaJugador.keySet();
        Carta cartaMasAlta = null;
        for (Carta c : cartasJugadas)
            if (cartaMasAlta == null)
                cartaMasAlta = c;
            else if (Carta.comparar(c, cartaMasAlta) == CartaVersus.Mata)
                cartaMasAlta = c;
        return cartaJugador.get(cartaMasAlta);
    }
}

