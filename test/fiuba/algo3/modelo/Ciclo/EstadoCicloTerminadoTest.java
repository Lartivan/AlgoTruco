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
        estado.cantarRealEnvido(j);
    }


    @Test(expected = RuntimeException.class)
    public void testNoSePuedeCantarFaltaEnvido()
    {
        estado.cantarFaltaEnvido(j);
    }

    @Test(expected = RuntimeException.class)
    public void testNoSePuedeCantarQuieroEnvido()
    {
        estado.envidoQuiero(j);
    }

    @Test(expected = RuntimeException.class)
    public void testNoSePuedeCantarNoQuieroEnvido()
    {
        estado.envidoNoQuiero(j);
    }

    @Test(expected = RuntimeException.class)
    public void testNoSePuedeCantarTruco()
    {
        estado.cantarTruco(j);
    }

    @Test(expected = RuntimeException.class)
    public void testNoSePuedeCantarRetruco()
    {
        estado.cantarRetruco(j);
    }

    @Test(expected = RuntimeException.class)
    public void testNoSePuedeCantarValeCuatro()
    {
        estado.cantarValeCuatro(j);
    }

    @Test(expected = RuntimeException.class)
    public void testNoSePuedeCantarQuieroTruco()
    {
        estado.trucoQuiero(j);
    }

    @Test(expected = RuntimeException.class)
    public void testNoSePuedeCantarNoQuieroTruco()
    {
        estado.trucoNoQuiero(j);
    }
}

