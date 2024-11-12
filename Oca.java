package fciencias.Anatidas;

import java.util.Comparator;
import fciencias.Anatidas.Excepciones.HuevosInvalidosException;

/**
 * Clase que representa a una Oca, hereda de Anatida. 
 * Implementa un comparador para ordenar ocas por cantidad de huevos anuales.
 * 
 * @author Campos Mendoza Edgar Felipe
 * @author Fuentes Esquivel Elian Andrea
 */
public class Oca extends Anatida implements Comparator<Oca> {
    private int huevosAnuales;

    /**
     * Constructor de Oca.
     * 
     * @param nombre el nombre de la Oca.
     * @param sexo el sexo de la Oca (por ejemplo, "Macho" o "Hembra").
     * @param peso el peso de la Oca en kilogramos.
     * @param huevosAnuales la cantidad de huevos anuales de la Oca.
     * @throws HuevosInvalidosException si la cantidad de huevos está fuera del rango válido.
     */
    public Oca(String nombre, String sexo, double peso, int huevosAnuales) throws HuevosInvalidosException {
        super(nombre, sexo, peso);
        if (huevosAnuales < 4 || huevosAnuales > 70) {
            throw new HuevosInvalidosException("Cantidad de huevos anual inválida.");
        }
        this.huevosAnuales = huevosAnuales;
    }

    /**
     * Implementa el método `compare` de Comparator para ordenar por cantidad de huevos anuales.
     */
    @Override
    public int compare(Oca o1, Oca o2) {
        return Integer.compare(o1.huevosAnuales, o2.huevosAnuales);
    }

    /**
     * Muestra la información de la Oca.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Oca: " + nombre + ", Sexo: " + sexo + ", Peso: " + peso + ", Huevos anuales: " + huevosAnuales);
    }
}
