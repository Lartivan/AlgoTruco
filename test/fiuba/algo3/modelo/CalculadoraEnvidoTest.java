package test.fiuba.algo3.modelo;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import src.fiuba.algo3.modelo.CalculadoraEnvido;
import src.fiuba.algo3.modelo.Carta;
import src.fiuba.algo3.modelo.Palo;

public class CalculadoraEnvidoTest
{
    @Test
    public void testUnosDeDistintoPalo()
    {
        Assert.assertEquals(1,
                CalculadoraEnvido.calcular(
                        new Carta(Palo.Espada, 1),
                        new Carta(Palo.Basto, 1),
                        new Carta(Palo.Copa, 1)));
    }

    @Test
    public void testTresCartasDeDistintoPaloValenComoLaMasAlta()
    {
        Assert.assertEquals(7,
                CalculadoraEnvido.calcular(
                        new Carta(Palo.Espada, 7),
                        new Carta(Palo.Basto, 1),
                        new Carta(Palo.Copa, 1)));
    }

    @Test
    public void testFigurasValenCero()
    {
        Assert.assertEquals(0,
                CalculadoraEnvido.calcular(
                        new Carta(Palo.Espada, 10),
                        new Carta(Palo.Basto, 11),
                        new Carta(Palo.Copa, 12)));
    }

    @Test
    public void testCalculoParcialFigurasValenCero()
    {
        Assert.assertEquals(0,
                CalculadoraEnvido.calculoParcial(
                        new Carta(Palo.Espada, 10),
                        new Carta(Palo.Copa, 11)));
    }

    @Test
    public void testCalculoParcialCartasDeDistintoPaloValenComoLaMasAlta()
    {
        Assert.assertEquals(7,
                CalculadoraEnvido.calculoParcial(
                        new Carta(Palo.Espada, 7),
                        new Carta(Palo.Copa, 1)));
    }

    @Test
    public void testCalculoParcialDosCartasDelMismoPaloSumanVeinte()
    {
        Assert.assertEquals(20,
                CalculadoraEnvido.calculoParcial(
                        new Carta(Palo.Basto, 10),
                        new Carta(Palo.Basto, 11)));
    }

/*
    @Test
    public void testDosCartasDelMismoPaloSumanVeinte()
    {
        Assert.assertEquals(20,
                CalculadoraEnvido.calcular(
                        new Carta(Palo.Espada, 10),
                        new Carta(Palo.Espada, 11),
                        new Carta(Palo.Copa, 7)));
    }
*/
}

