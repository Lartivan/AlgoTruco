package src.fiuba.algo3.modelo;

import java.util.Collections;
import java.util.Queue;
import java.util.List;
import java.util.LinkedList;

public class Mazo
{
    private List<Carta> cartas;
    
    public Mazo()
    {
        llenarMazo();
    }
    
    public Carta sacar()
    {
        return ( (Queue<Carta>)cartas ).remove();
    }

    public void mezclar()
    {
        Collections.shuffle(cartas);
    }
    
    public int cartasRestantes()
    {
        return cartas.size();
    }

    public void llenarMazo()
    {
        cartas = new LinkedList<Carta> ();
        cartas.add(new Carta(Palo.Espada, 1));
        cartas.add(new Carta(Palo.Basto, 1));
        cartas.add(new Carta(Palo.Espada, 7));
        cartas.add(new Carta(Palo.Oro, 7));
        cartas.add(new Carta(Palo.Espada, 3));
        cartas.add(new Carta(Palo.Basto, 3));
        cartas.add(new Carta(Palo.Oro, 3));
        cartas.add(new Carta(Palo.Copa, 3));
        cartas.add(new Carta(Palo.Espada, 2));
        cartas.add(new Carta(Palo.Basto, 2));
        cartas.add(new Carta(Palo.Oro, 2));
        cartas.add(new Carta(Palo.Copa, 2));
        cartas.add(new Carta(Palo.Copa, 1));
        cartas.add(new Carta(Palo.Oro, 1));
        cartas.add(new Carta(Palo.Espada, 12));
        cartas.add(new Carta(Palo.Basto, 12));
        cartas.add(new Carta(Palo.Oro, 12));
        cartas.add(new Carta(Palo.Copa, 12));
        cartas.add(new Carta(Palo.Espada, 11));
        cartas.add(new Carta(Palo.Basto, 11));
        cartas.add(new Carta(Palo.Oro, 11));
        cartas.add(new Carta(Palo.Copa, 11));
        cartas.add(new Carta(Palo.Espada, 10));
        cartas.add(new Carta(Palo.Basto, 10));
        cartas.add(new Carta(Palo.Oro, 10));
        cartas.add(new Carta(Palo.Copa, 10));
        cartas.add(new Carta(Palo.Copa, 7));
        cartas.add(new Carta(Palo.Basto, 7));
        cartas.add(new Carta(Palo.Espada, 6));
        cartas.add(new Carta(Palo.Basto, 6));
        cartas.add(new Carta(Palo.Oro, 6));
        cartas.add(new Carta(Palo.Copa, 6));
        cartas.add(new Carta(Palo.Espada, 5));
        cartas.add(new Carta(Palo.Basto, 5));
        cartas.add(new Carta(Palo.Oro, 5));
        cartas.add(new Carta(Palo.Copa, 5));
        cartas.add(new Carta(Palo.Espada, 4));
        cartas.add(new Carta(Palo.Basto, 4));
        cartas.add(new Carta(Palo.Oro, 4));
        cartas.add(new Carta(Palo.Copa, 4));
    }
}

