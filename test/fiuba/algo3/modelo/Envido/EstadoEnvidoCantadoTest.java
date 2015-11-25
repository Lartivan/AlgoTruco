package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.modelo.EstadoEnvido;
import src.fiuba.algo3.modelo.EstadoEnvidoNoCantado;
import src.fiuba.algo3.modelo.EstadoEnvidoCantado;
import src.fiuba.algo3.modelo.Ciclo;
import src.fiuba.algo3.modelo.Jugador;

public class EstadoEnvidoCantadoTest
{
    Ciclo ciclo;
    EstadoEnvido estado;
    Jugador j1;
    
    @Before
    public void setUp()
    {
        estado = new EstadoEnvidoCantado();
        ciclo = new Ciclo();
        ciclo.setEstadoEnvido(estado);
        j1 = new Jugador();
    }
    
    @Test
    public void testCantarEnvidoMantieneEstado()
    {
        ciclo.cantarEnvido(j1);
        Assert.assertTrue(ciclo.getEstadoEnvido()
                instanceof EstadoEnvidoCantado);
    }
}

