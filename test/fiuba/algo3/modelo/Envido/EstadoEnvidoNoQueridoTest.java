package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.modelo.EstadoEnvido;
import src.fiuba.algo3.modelo.EstadoEnvidoNoQuerido;
import src.fiuba.algo3.modelo.Ciclo;
import src.fiuba.algo3.modelo.Jugador;

public class EstadoEnvidoNoQueridoTest
{
    Ciclo ciclo;
    EstadoEnvido estado;
    Jugador j1;
    
    @Before
    public void setUp()
    {
        estado = new EstadoEnvidoNoQuerido();
        ciclo = new Ciclo();
        ciclo.setEstadoEnvido(estado);
        j1 = new Jugador();
    }
    
    @Test
    public void testNoPuedeCantarEnvido()
    {
        Assert.assertFalse(ciclo.cantarEnvido(j1));
    }

    @Test
    public void testNoPuedeCantarEnvidoNoQuiero()
    {
        Assert.assertFalse(ciclo.envidoNoQuiero(j1));
    }
}

