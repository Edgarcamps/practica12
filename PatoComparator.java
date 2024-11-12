package fciencias.Anatidas;

import java.util.Comparator;

/**
 * Comparador para ordenar los Patos por su peso.
 */
public class PatoComparator implements Comparator<Pato> {
    @Override
    public int compare(Pato p1, Pato p2) {
        return Double.compare(p1.peso, p2.peso);
    }
}
