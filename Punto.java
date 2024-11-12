package fciencias.Anatidas;

import java.util.Comparator;
import fciencias.Anatidas.Excepciones.PesoInvalidoException;

/**
 * Clase que representa a un Pato, hereda de Anatida. 
 * Implementa un comparador para ordenar patos por peso.
 * 
 * @author Campos Mendoza Edgar Felipe
 * @author Fuentes Esquivel Elian Andrea
 */
public class Pato extends Anatida implements Comparator<Pato> {

    /**
     * Constructor de Pato.
     * 
     * @param nombre el nombre del Pato.
     * @param sexo el sexo del Pato (por ejemplo, "Macho" o "Hembra").
     * @param peso el peso del Pato en kilogramos.
     * @throws PesoInvalidoException si el peso está fuera del rango válido.
     */
    public Pato(String nombre, String sexo, double peso) throws PesoInvalidoException {
        super(nombre, sexo, peso);
        if (peso < 0.45 || peso > 10) {
            throw new PesoInvalidoException("Peso inválido para el Pato.");
        }
    }

    /**
     * Implementa el método `compare` de Comparator para ordenar por peso.
     */
    @Override
    public int compare(Pato p1, Pato p2) {
        return Double.compare(p1.peso, p2.peso);
    }

    /**
     * Muestra la información del Pato.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Pato: " + nombre + ", Sexo: " + sexo + ", Peso: " + peso);
    }
}
