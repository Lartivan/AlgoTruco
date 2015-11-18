package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.List;
import java.util.LinkedList;

import src.fiuba.algo3.modelo.Mazo;
import src.fiuba.algo3.modelo.Carta;
import src.fiuba.algo3.modelo.Palo;

import java.util.Collection;

public class MazoTest
{
    Mazo mazo;
    
    @Before
    public void setUp()
    {
        mazo = new Mazo();
    }
    
    @Test
    public void testSacarCartaDevuelveUnaCarta()
    {
        Assert.assertNotEquals(null, mazo.sacar());
    }
    
    @Test
    public void testSacarCartaNoDevuelveLaMismaCartaDosVeces()
    {
        Assert.assertNotEquals(mazo.sacar(), mazo.sacar());
    }

    @Test
    public void testMazoSeCreaCon40Cartas()
    {
        mazo = new Mazo();
        Assert.assertEquals(40, mazo.cartasRestantes());
    }
    
    @Test
    public void testMazoAPartirDeLista()
    {
        List<Carta> unaLista = new LinkedList<Carta>();
        unaLista.add(new Carta(Palo.Copa, 3));
        unaLista.add(new Carta(Palo.Basto, 11));
        unaLista.add(new Carta(Palo.Espada, 6));
        
        mazo = new Mazo(unaLista);
        Assert.assertEquals(unaLista.get(0), mazo.sacar());
        Assert.assertEquals(unaLista.get(1), mazo.sacar());
        Assert.assertEquals(unaLista.get(2), mazo.sacar());
    }

    @Test
    public void testMazoAPartirDeCartas()
    {
        mazo = new Mazo(
                new Carta(Palo.Copa, 3),
                new Carta(Palo.Basto, 11),
                new Carta(Palo.Espada, 6));
        
        Assert.assertEquals(new Carta(Palo.Copa, 3), mazo.sacar());
        Assert.assertEquals(new Carta(Palo.Basto, 11), mazo.sacar());
        Assert.assertEquals(new Carta(Palo.Espada, 6), mazo.sacar());
    }
}

