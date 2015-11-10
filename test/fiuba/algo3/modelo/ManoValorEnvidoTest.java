package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.modelo.Mano;
import src.fiuba.algo3.modelo.Carta;
import src.fiuba.algo3.modelo.Palo;

public class ManoValorEnvidoTest
{
    @Test
    public void testCartasDistintoPalo()
    {
        Mano unaMano = new Mano(
                new Carta(Palo.Espada, 1),
                new Carta(Palo.Basto, 1),
                new Carta(Palo.Copa, 1));
        Assert.assertEquals(1, unaMano.getValorEnvido());
    }
}

