package src.fiuba.algo3.modelo;

import java.util.Collection;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Mano
{
    private Collection<Carta> cartasIniciales;
    private Collection<Carta> cartasEnMano;
    
    public Mano(Carta ... cartas)
    {
        Set<Carta> tmp = new HashSet<Carta>(Arrays.asList(cartas));
        
        if (cartas.length != tmp.size())
            throw new RuntimeException("Carta duplicada.");
        
        cartasIniciales = tmp;
        cartasEnMano = tmp;
    }
    
    public int getValorEnvido()
    {
        return CalculadoraEnvido.calcular(
                cartasIniciales.toArray(new Carta[0]));
    }

    public void jugar(Carta c)
    {
        if (! cartasEnMano.contains(c))
            throw new RuntimeException("Carta no esta en mano.");
    }
}

