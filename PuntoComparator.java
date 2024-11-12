package fciencias.Punto;

import java.util.Comparator;

/**
 * Comparador para ordenar los Puntos por su distancia al origen.
 */
public class PuntoComparator implements Comparator<Punto> {
    @Override
    public int compare(Punto p1, Punto p2) {
        double dist1 = Math.sqrt(p1.x * p1.x + p1.y * p1.y);
        double dist2 = Math.sqrt(p2.x * p2.x + p2.y * p2.y);
        return Double.compare(dist1, dist2);
    }
}
