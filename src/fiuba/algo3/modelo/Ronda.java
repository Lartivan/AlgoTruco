package src.fiuba.algo3.modelo;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

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
        List<Carta> cartaMasAlta = new ArrayList<Carta>();
        for (Carta c : cartasJugadas)
            if (cartaMasAlta.size() == 0)
                cartaMasAlta.add(c);
            else if (Carta.comparar(c, cartaMasAlta.get(0)) == CartaVersus.Mata)
            {
                cartaMasAlta = new ArrayList<Carta>();
                cartaMasAlta.add(c);
            }
        return cartaJugador.get(cartaMasAlta.get(0));
    }
}
    
