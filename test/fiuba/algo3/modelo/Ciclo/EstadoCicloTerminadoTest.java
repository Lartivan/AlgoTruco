package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.modelo.EstadoCiclo;
import src.fiuba.algo3.modelo.EstadoCicloTerminado;
import src.fiuba.algo3.modelo.Jugador;
import src.fiuba.algo3.modelo.Carta;
import src.fiuba.algo3.modelo.Palo;

public class EstadoCicloTerminadoTest
{
    private EstadoCiclo estado = new EstadoCicloTerminado();
    private Jugador j = new Jugador();
    private Carta c = new Carta(Palo.Espada, 1);

    @Test(expected = RuntimeException.class)
    public void testNoSePuedeJugarCarta()
    {
        estado.jugarCarta(j, c);
    }

    @Test(expected = RuntimeException.class)
    public void testNoSePuedeCantarEnvido()
    {
        estado.cantarEnvido(j);
    }

    @Test(expected = RuntimeException.class)
    public void testNoSePuedeCantarRealEnvido()
    {
        estado.cantarEnvido(j);
    }
}

