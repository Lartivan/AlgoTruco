package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.modelo.Juego;
import src.fiuba.algo3.modelo.Jugador;
import src.fiuba.algo3.modelo.Mazo;
import src.fiuba.algo3.modelo.Carta;
import src.fiuba.algo3.modelo.Palo;

import java.util.Collection;

public class JuegoTest
{
    Jugador j1, j2;
    Juego J;

    @Before
    public void setUp()
    {
        j1 = new Jugador();
        j2 = new Jugador();

        J = new Juego(j1, j2);
    }

    @Test
    public void testJugadoresEmpiezanSinCartas()
    {
        Collection<Carta> cartasJ1 = j1.getCartasEnMano();
        Collection<Carta> cartasJ2 = j2.getCartasEnMano();
        
        Assert.assertEquals(null, cartasJ1);
        Assert.assertEquals(null, cartasJ2);
    }

    @Test
    public void testRepartirDaTresCartasACadaJugador()
    {
        J.repartir();
        
        Collection<Carta> cartasJ1 = j1.getCartasEnMano();
        Collection<Carta> cartasJ2 = j2.getCartasEnMano();
        
        Assert.assertEquals(3, cartasJ1.size());
        Assert.assertEquals(3, cartasJ2.size());
    }

    @Test
    public void testPrimerJugadorGanaPrimeraRonda()
    {
        // NOTE: Al repartir sin mezclar, jugador1 recibe como primera carta
        // el ancho de espadas. Para mas precision: recibe las tres cartas mas
        // valiosas en el truco.
        // ADVERTENCIA: Este comportamiento depende del orden en que se agregan
        // las cartas al mazo en el momento de su creacion.
        J.repartir();
        
        Carta [] cartasJ1 = j1.getCartasEnMano().toArray(new Carta[0]);
        Carta [] cartasJ2 = j2.getCartasEnMano().toArray(new Carta[0]);
        
        j1.jugar(cartasJ1[0]);
        j2.jugar(cartasJ2[0]);
        
        Assert.assertEquals(j1, J.getGanadorRonda(1));
    }

    @Test
    public void testSegundoJugadorGanaPrimeraRonda()
    {
        Mazo mazoSimple = new Mazo(
            new Carta(Palo.Espada, 1),
            new Carta(Palo.Basto, 3),
            new Carta(Palo.Copa, 6),
            new Carta(Palo.Basto, 1),
            new Carta(Palo.Espada, 11),
            new Carta(Palo.Copa, 12));
        J.setMazo(mazoSimple);
        J.repartir();
        
        j1.jugar(new Carta(Palo.Copa, 6));
        j2.jugar(new Carta(Palo.Espada, 11));
        
        Assert.assertEquals(j1, J.getGanadorRonda(1));
    }
}

