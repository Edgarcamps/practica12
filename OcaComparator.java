package fciencias.Anatidas;

import java.util.Comparator;

/**
 * Comparador para ordenar las Ocas por la cantidad de huevos anuales.
 */
public class OcaComparator implements Comparator<Oca> {
    @Override
    public int compare(Oca o1, Oca o2) {
        return Integer.compare(o1.huevosAnuales, o2.huevosAnuales);
    }
}
