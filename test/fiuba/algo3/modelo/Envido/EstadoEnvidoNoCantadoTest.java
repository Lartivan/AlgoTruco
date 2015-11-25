package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.modelo.EstadoEnvido;
import src.fiuba.algo3.modelo.EstadoEnvidoNoCantado;
import src.fiuba.algo3.modelo.Ciclo;

public class EstadoEnvidoNoCantadoTest
{
    EstadoEnvido estado;
    
    @Before
    public void setUp()
    {
        estado = new EstadoEnvidoNoCantado();
    }
    
    @Test
    public void testEstadoEsEnvidoNoCantado()
    {
        Assert.assertTrue(estado instanceof EstadoEnvidoNoCantado);
    }
}

