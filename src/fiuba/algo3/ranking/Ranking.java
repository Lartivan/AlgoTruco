package src.fiuba.algo3.ranking;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

public class Ranking<E>
{
    private Map<E, Set<E>> relacionesElementoClase;
    private List<Set<E>> clasesDeEquivalencia;
    
    public Ranking()
    {
        relacionesElementoClase = new HashMap<E, Set<E>>();
        clasesDeEquivalencia = new LinkedList<Set<E>>();
    }
    
    public void add(Set<E> nuevaClase)
    {
        // Comprobar que los elementos a agregar sean todos originales.
        {
            Set<E> interseccion = new HashSet<E>(nuevaClase);
            interseccion.retainAll(relacionesElementoClase.keySet());
            if (interseccion.size() != 0)
                throw new RuntimeException(
                        "No se pueden repetir elementos en un ranking");
        }
        
        clasesDeEquivalencia.add(nuevaClase);
        for (E e : nuevaClase)
            relacionesElementoClase.put(e, nuevaClase);
    }
}

