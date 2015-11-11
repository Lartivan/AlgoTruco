package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.modelo.Ronda;
import src.fiuba.algo3.modelo.Jugador;
import src.fiuba.algo3.modelo.Carta;
import src.fiuba.algo3.modelo.Palo;
import src.fiuba.algo3.modelo.CartaVersus;

public class RondaDeTresTest
{
    private Ronda R;
    private Jugador j1, j2, j3;

    @Before
    public void setUp()
    {
        R = new Ronda();
        j1 = new Jugador();
        j2 = new Jugador();
        j3 = new Jugador();
    }

    @Test
    public void testGanaJ1()
    {
        R.jugar(j1, new Carta(Palo.Espada, 1));
        R.jugar(j2, new Carta(Palo.Oro, 10));
        R.jugar(j3, new Carta(Palo.Oro, 6));
        
        Assert.assertEquals(j1, R.getGanador());
    }

    @Test
    public void testGanaJ2()
    {
        R.jugar(j1, new Carta(Palo.Copa, 11));
        R.jugar(j2, new Carta(Palo.Oro, 3));
        R.jugar(j3, new Carta(Palo.Basto, 6));
        
        Assert.assertEquals(j2, R.getGanador());
    }
/*
    @Test
    public void testEmpardan()
    {
        R.jugar(j1, new Carta(Palo.Copa, 2));
        R.jugar(j2, new Carta(Palo.Basto, 2));
        
        Assert.assertEquals(null, R.getGanador());
    }
*/
}

