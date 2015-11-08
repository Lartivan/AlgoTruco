package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.modelo.Carta;
import src.fiuba.algo3.modelo.Palo;
import src.fiuba.algo3.modelo.CartaVersus;

public class CartaHashTest
{
    @Test
    public void testCartasIgualesSonIguales()
    {
        Carta c1 = new Carta(Palo.Espada, 1);
        Carta c2 = new Carta(Palo.Espada, 1);
        Assert.assertTrue(c1.equals(c2));
    }

    @Test
    public void testCartasIgualesTienenIgualHash()
    {
        Carta c1 = new Carta(Palo.Espada, 1);
        Carta c2 = new Carta(Palo.Espada, 1);
        Assert.assertEquals(c1.hashCode(), c2.hashCode());
    }
}

