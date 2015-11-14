package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.modelo.Juego;
import src.fiuba.algo3.modelo.Jugador;
import src.fiuba.algo3.modelo.Carta;
import src.fiuba.algo3.modelo.Palo;

import java.util.Collection;

public class JuegoTest
{
    Jugador j1, j2;
    Juego J;

    @Before
    public void setUp()
    {
        j1 = new Jugador();
        j2 = new Jugador();

        J = new Juego(j1, j2);
    }

    @Test
    public void testJugadoresEmpiezanSinCartas()
    {
        Collection<Carta> cartasJ1 = j1.getCartasEnMano();
        Collection<Carta> cartasJ2 = j2.getCartasEnMano();
        
        Assert.assertEquals(null, cartasJ1);
        Assert.assertEquals(null, cartasJ2);
    }
/*
    @Test
    public void testRepartirDaTresCartasACadaJugador()
    {
        J.repartir();
        
        Collection<Carta> cartasJ1 = J.getCartas(j1);
        Collection<Carta> cartasJ2 = J.getCartas(j2);
        
        Assert.assertEquals(3, cartasJ1.size());
        Assert.assertEquals(3, cartasJ2.size());
    }
*/
}

