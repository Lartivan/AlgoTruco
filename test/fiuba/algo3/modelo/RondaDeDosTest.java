package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.modelo.Ronda;
import src.fiuba.algo3.modelo.Jugador;
import src.fiuba.algo3.modelo.Carta;
import src.fiuba.algo3.modelo.Palo;
import src.fiuba.algo3.modelo.CartaVersus;

public class RondaDeDosTest
{
    private Ronda R;
    private Jugador j1, j2;

    @Before
    public void setUp()
    {
        R = new Ronda();
        j1 = new Jugador();
        j2 = new Jugador();
    }

    @Test
    public void testGanaJ1()
    {
        R.jugar(j1, new Carta(Palo.Espada, 1));
        R.jugar(j2, new Carta(Palo.Oro, 7));
        
        Assert.assertEquals(j1, R.getGanador());
    }

    @Test
    public void testGanaJ2()
    {
        R.jugar(j1, new Carta(Palo.Oro, 7));
        R.jugar(j2, new Carta(Palo.Espada, 7));
        
        Assert.assertEquals(j2, R.getGanador());
    }
}

