package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.ranking.Ranking;
import src.fiuba.algo3.ranking.Comparaciones;

import java.util.Set;
import java.util.HashSet;

public class RankingTest
{
    private Ranking<Integer> R = new Ranking<Integer>();
    
    @Test(expected = RuntimeException.class)
    public void testAgregarElementosDuplicadosCausaExcepcion()
    {
        Set<Integer> S = new HashSet();
        S.add(4);
        R.agregar(S);
        R.agregar(S);
    }
    
    @Test
    public void testClaseAgregadaDespuesValeMenos()
    {
        Set<Integer> S = new HashSet();
        S.add(1);
        R.agregar(S);

        S = new HashSet();
        S.add(0);
        R.agregar(S);
        
        Assert.assertEquals(Comparaciones.Mayor,
                R.comparar(new Integer(1), new Integer(0)));
    }
    
    @Test
    public void testElementosEnLaMismaClaseSonIguales()
    {
        Set<Integer> S = new HashSet();
        S.add(1);
        S.add(2);
        R.agregar(S);
        
        Assert.assertEquals(Comparaciones.Igual,
                R.comparar(new Integer(1), new Integer(2)));
    }
}

