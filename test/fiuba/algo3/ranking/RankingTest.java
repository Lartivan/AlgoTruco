package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.ranking.Ranking;

import java.util.Set;
import java.util.HashSet;

public class RankingTest
{
    private Ranking<Integer> R;
    
    @Test(expected = RuntimeException.class)
    public void testAgregarElementosDuplicadosCausaExcepcion()
    {
        R = new Ranking<Integer>();
        
        Set<Integer> S = new HashSet();
        S.add(4);
        R.add(S);
        R.add(S);
    }
}

