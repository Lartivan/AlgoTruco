package test.fiuba.algo3.util;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.List;
import java.util.LinkedList;

import src.fiuba.algo3.util.ListaCircular;

public class ListaCircularTest
{
    ListaCircular<Integer> lcEnteros;
    
    @Before
    public void setUp()
    {
        lcEnteros = new ListaCircular<Integer>();
    }
    
    @Test
    public void testListaVacia()
    {
        Assert.assertEquals(0, lcEnteros.size());
    }

    @Test
    public void testAgregarElementoAumentaSize()
    {
        lcEnteros.add(0);
        Assert.assertEquals(1, lcEnteros.size());

        lcEnteros.add(0);
        Assert.assertEquals(2, lcEnteros.size());
    }
    
    @Test
    public void testElementoActual()
    {
        lcEnteros.add(0);
        Assert.assertEquals(0, lcEnteros.elementoActual().intValue());
    }
    
    @Test public void testElementoActualEsElUltimoAgregado()
    {
        lcEnteros.add(0);
        lcEnteros.add(1);
        Assert.assertEquals(1, lcEnteros.elementoActual().intValue());
    }

    @Test(expected = RuntimeException.class)
    public void testElementoActualLanzaExcepcionEnListaVacia()
    {
        lcEnteros.elementoActual();
    }
    
    @Test
    public void testAvanzarPosicion()
    {
        lcEnteros.add(0);
        lcEnteros.add(1);

        Assert.assertEquals(1, lcEnteros.elementoActual().intValue());

        lcEnteros.avanzarPosicion();
        Assert.assertEquals(0, lcEnteros.elementoActual().intValue());

        lcEnteros.avanzarPosicion();
        Assert.assertEquals(1, lcEnteros.elementoActual().intValue());
    }
}

