package fciencias.Punto;

import fciencias.Punto.Excepciones.PuntoInvalidoException;
import java.util.Comparator;

/**
 * Representa un punto en el plano cartesiano.
 */
public class Punto implements Comparator<Punto> {
    private double x;
    private double y;

    public Punto(double x, double y) throws PuntoInvalidoException {
        if (x < 0 || y < 0) {
            throw new PuntoInvalidoException("Los puntos deben estar en el primer cuadrante.");
        }
        this.x = x;
        this.y = y;
    }

    @Override
    public int compare(Punto p1, Punto p2) {
        double dist1 = Math.sqrt(p1.x * p1.x + p1.y * p1.y);
        double dist2 = Math.sqrt(p2.x * p2.x + p2.y * p2.y);
        return Double.compare(dist1, dist2);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Punto: (" + x + ", " + y + ")");
    }
}
