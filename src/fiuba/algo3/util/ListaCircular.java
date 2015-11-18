package src.fiuba.algo3.util;

import java.util.List;
import java.util.LinkedList;

public class ListaCircular<E>
{
    private List<E> listaBase;
    private Integer indiceElementoActual;
    
    public ListaCircular()
    {
        listaBase = new LinkedList<E>();
    }
    
    public void add(E elemento)
    {
        listaBase.add(elemento);
        
        if (indiceElementoActual == null)
            indiceElementoActual = 0;
        else
            indiceElementoActual++;
    }
    
    public int size()
    {
        return listaBase.size();
    }
    
    public E elementoActual()
    {
        return listaBase.get(indiceElementoActual);
    }

    public void avanzarPosicion()
    {
        indiceElementoActual++;
        if (indiceElementoActual >= listaBase.size())
            indiceElementoActual = 0;
    }
}

