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
    
    @Test
    public void testListaVacia()
    {
        lcEnteros = new ListaCircular<Integer>();
        Assert.assertEquals(0, lcEnteros.size());
    }
}

