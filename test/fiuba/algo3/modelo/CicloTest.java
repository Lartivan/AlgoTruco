package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.modelo.Ciclo;
import src.fiuba.algo3.modelo.Jugador;
import src.fiuba.algo3.modelo.Carta;
import src.fiuba.algo3.modelo.Palo;

public class CicloTest
{
    private Ciclo unCiclo;
    private Jugador j1, j2;

    @Before
    public void setUp()
    {
        j1 = new Jugador();
        j2 = new Jugador();
        
        unCiclo = new Ciclo(j1, j2);
    }

    @Test
    public void testNuevoCicloNoTieneGanador()
    {
        Assert.assertEquals(null, unCiclo.getGanador());
    }
}

