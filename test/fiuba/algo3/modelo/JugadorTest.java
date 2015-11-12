package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.modelo.Jugador;
import src.fiuba.algo3.modelo.Mano;
import src.fiuba.algo3.modelo.Carta;
import src.fiuba.algo3.modelo.Palo;

public class JugadorTest
{
    Jugador J;
    
    @Before
    public void setUp()
    {
        J = new Jugador();
    }

    @Test(expected = RuntimeException.class)
    public void testJugadorSinCartasNoPuedeJugar()
    {
        J.jugar(new Carta(Palo.Espada, 1));
    }

    @Test
    public void testJugarCartaCasoFelizNoLanzaExcepcion()
    {
        J.repartir(new Mano(new Carta(Palo.Espada, 1),
                new Carta(Palo.Espada, 2),
                new Carta(Palo.Espada, 3)));
        J.jugar(new Carta(Palo.Espada, 1));
    }

/*
    @Test
    public void testJugarCartaLaSacaDeLaMano()
    {
        J
    }
*/
}

