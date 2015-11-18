package src.fiuba.algo3.util;

import java.util.List;
import java.util.LinkedList;

public class ListaCircular<E>
{
    private List<E> listaBase;
    
    public ListaCircular()
    {
        listaBase = new LinkedList<E>();
    }
    
    public void add(E elemento)
    {
        listaBase.add(elemento);
    }
    
    public int size()
    {
        return listaBase.size();
    }
}

