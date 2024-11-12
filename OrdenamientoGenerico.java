package fciencias;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Clase genérica para ordenar un arreglo de objetos usando un comparador específico.
 * 
 * @author Campos Mendoza Edgar Felipe
 * @author Fuentes Esquivel Elian Andrea
 */
public class OrdenamientoGenerico {
    /**
     * Método genérico para ordenar un arreglo de objetos de cualquier tipo.
     * 
     * @param arreglo el arreglo de objetos a ordenar.
     * @param comparador el comparador que define el criterio de ordenación.
     * @param <T> el tipo de los objetos en el arreglo.
     * @return el arreglo ordenado.
     */
    public static <T> T[] ordenar(T[] arreglo, Comparator<? super T> comparador) {
        Arrays.sort(arreglo, comparador);
        return arreglo;
    }
}

