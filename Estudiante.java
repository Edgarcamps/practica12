/**
 * Clase Estudiante que representa a un estudiante con un nombre y una nota.
 * Permite asignar una calificación y obtener tanto el nombre como la nota del estudiante.
 *
 * Autores:
 * - Campos Mendoza Edgar Felipe
 * - Fuentes Esquivel Elian Andrea
 */
public class Estudiante {
    // Nombre del estudiante
    private String nombre;
    
    // Nota del estudiante, inicializada en -1 para indicar que no se ha asignado ninguna nota
    private double nota;

    /**
     * Constructor de la clase Estudiante.
     * Inicializa el nombre del estudiante y asigna -1 a la nota para indicar que aún no tiene calificación.
     *
     * @param nombre Nombre del estudiante.
     */
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.nota = -1; // Valor inicial para indicar que aún no se ha asignado nota
    }

    /**
     * Asigna una calificación al estudiante.
     * La calificación debe estar en el rango de 0 a 100.
     *
     * @param calificacion La calificación a asignar, debe estar entre 0 y 100.
     * @throws Exception Si la calificación está fuera del rango permitido.
     */
    public void asignarCalificacion(double calificacion) throws Exception {
        if (calificacion < 0 || calificacion > 100) {
            throw new Exception("Calificación inválida. Debe estar entre 0 y 100.");
        }
        this.nota = calificacion;
    }

    /**
     * Obtiene la calificación del estudiante.
     *
     * @return La nota del estudiante. Retorna -1 si aún no se ha asignado ninguna nota.
     */
    public double obtenerCalificacion() {
        return nota;
    }

    /**
     * Obtiene el nombre del estudiante.
     *
     * @return El nombre del estudiante.
     */
    public String obtenerNombre() {
        return nombre;
    }
}
