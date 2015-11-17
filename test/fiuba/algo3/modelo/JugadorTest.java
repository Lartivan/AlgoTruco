package test.fiuba.algo3.modelo;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.modelo.Jugador;
import src.fiuba.algo3.modelo.Juego;
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

    @Test(expected = RuntimeException.class)
    public void testJugarCartaLaSacaDeLaMano()
    {
        J.repartir(new Mano(new Carta(Palo.Espada, 1),
                new Carta(Palo.Espada, 2),
                new Carta(Palo.Espada, 3)));
        J.jugar(new Carta(Palo.Espada, 1));
        J.jugar(new Carta(Palo.Espada, 1));
    }
    
    @Test
    public void testJugarCartaNotificaAJuego()
    {
        Juego juegoFalso = mock(Juego.class);
        J.setJuego(juegoFalso);
        
        J.repartir(new Mano(new Carta(Palo.Espada, 1),
                new Carta(Palo.Espada, 2),
                new Carta(Palo.Espada, 3)));
        J.jugar(new Carta(Palo.Espada, 1));
        
        verify(juegoFalso).jugar(J, new Carta(Palo.Espada, 1));
    }
}

