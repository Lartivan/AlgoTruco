package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.modelo.Mano;
import src.fiuba.algo3.modelo.Carta;
import src.fiuba.algo3.modelo.Palo;

public class ManoTest
{
    @Test(expected = RuntimeException.class)
    public void testNuevaManoConCartasRepetidasLanzaExcepcion()
    {
        new Mano(new Carta(Palo.Espada, 1),
                new Carta(Palo.Espada, 1),
                new Carta(Palo.Copa, 1));
    }

    @Test
    public void testCalculoDelEnvido()
    {
        Mano M = new Mano(new Carta(Palo.Oro, 7),
                new Carta(Palo.Oro, 5),
                new Carta(Palo.Copa, 2));
        
        Assert.assertEquals(32, M.getValorEnvido());
    }

    @Test
    public void testJugarCartaCasoFelizNoLanzaExcepcion()
    {
        Mano M = new Mano(new Carta(Palo.Oro, 7),
                new Carta(Palo.Oro, 5),
                new Carta(Palo.Copa, 2));
        M.jugar(new Carta(Palo.Oro, 7));
    }

    @Test(expected = RuntimeException.class)
    public void testJugarCartaQueNoEstaEnManoCausaExcepcion()
    {
        Mano M = new Mano(new Carta(Palo.Espada, 1),
                new Carta(Palo.Espada, 2),
                new Carta(Palo.Espada, 3));
        M.jugar(new Carta(Palo.Oro, 7));
    }
/*
    @Test(expected = RuntimeException.class)
    public void testJugarCartaLaSacaDeLaMano()
    {
        J.repartir(new Mano(new Carta(Palo.Espada, 1),
                new Carta(Palo.Espada, 2),
                new Carta(Palo.Espada, 3)));
        J.jugar(new Carta(Palo.Espada, 1));
        J.jugar(new Carta(Palo.Espada, 1));
    }
*/
}

