package fciencias.Anatidas;

/**
 * Clase abstracta que representa a un objeto Anatida, que es una clase general para todos los tipos de Anatidas
 * como patos, ocas, etc. Contiene los atributos comunes para todas las Anatidas y un método abstracto
 * para mostrar la información específica de cada tipo de Anatida.
 * 
 * @author Campos Mendoza Edgar Felipe
 * @author Fuentes Esquivel Elian Andrea
 */
public abstract class Anatida {
    
    // Nombre del Anatida (Pato, Oca, etc.)
    protected String nombre;
    
    // Sexo del Anatida (Macho, Hembra)
    protected String sexo;
    
    // Peso del Anatida en kilogramos
    protected double peso;

    /**
     * Constructor para crear una instancia de una Anatida.
     * 
     * @param nombre el nombre del Anatida.
     * @param sexo el sexo del Anatida (por ejemplo, "Macho" o "Hembra").
     * @param peso el peso del Anatida en kilogramos.
     */
    public Anatida(String nombre, String sexo, double peso) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
    }

    /**
     * Método abstracto para mostrar la información del Anatida.
     * Este método debe ser implementado en las subclases para mostrar información específica.
     */
    public abstract void mostrarInfo();
}
