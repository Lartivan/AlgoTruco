package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.modelo.Carta;
import src.fiuba.algo3.modelo.Palo;
import src.fiuba.algo3.modelo.CartaVersus;

import java.util.Map;
import java.util.HashMap;

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

    @Test
    public void testCartasDistintasSonDistintas()
    {
        Carta c1 = new Carta(Palo.Espada, 1);
        Carta c2 = new Carta(Palo.Copa, 4);
        Assert.assertFalse(c1.equals(c2));
    }

    @Test
    public void testCartasDistintasTienenDistintoHash()
    {
        Carta c1 = new Carta(Palo.Espada, 1);
        Carta c2 = new Carta(Palo.Copa, 4);
        Assert.assertNotEquals(c1.hashCode(), c2.hashCode());
    }
    
    @Test
    public void testCartaComoMapKey()
    {
        Map<Carta, Integer> M = new HashMap<Carta, Integer>();
        M.put(new Carta(Palo.Espada, 1), 1);
        M.put(new Carta(Palo.Copa, 4), 4);
        
        Assert.assertEquals(1, M.get(new Carta(Palo.Espada, 1)).intValue());
        Assert.assertEquals(4, M.get(new Carta(Palo.Copa, 4)).intValue());
    }
}

