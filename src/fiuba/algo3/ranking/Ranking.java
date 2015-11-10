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
    
    public void agregar(Set<E> nuevaClase)
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

    public Comparaciones comparar(E e1, E e2)
    {
        Set<E> clase1, clase2;
        clase1 = relacionesElementoClase.get(e1);
        clase2 = relacionesElementoClase.get(e2);
        
        if (clase1.equals(clase2))
            return Comparaciones.Igual;
        
        for (Set<E> clase : clasesDeEquivalencia)
            if (clase.equals(clase1))
                return Comparaciones.Mayor;
            else if (clase.equals(clase2))
                return Comparaciones.Menor;
        
        // La linea que sigue es para apaciguar al compilador:
        //     salvo error catastrofico no debiera ejecutarse
        throw new RuntimeException("No es mayor, menor, ni igual!");
    }
}

