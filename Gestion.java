/**
 * Clase Gestion para administrar un conjunto de estudiantes.
 * Permite agregar estudiantes, modificar sus calificaciones y mostrar las calificaciones de todos.
 *
 * Autores:
 * - Campos Mendoza Edgar Felipe
 * - Fuentes Esquivel Elian Andrea
 */
public class Gestion {
    // Arreglo de estudiantes
    private Estudiante[] estudiantes;

    /**
     * Constructor de la clase Gestion.
     * Inicializa el arreglo de estudiantes con la capacidad especificada.
     *
     * @param capacidad Tamaño máximo de estudiantes en la gestión.
     */
    public Gestion(int capacidad) {
        estudiantes = new Estudiante[capacidad];
    }

    /**
     * Agrega un estudiante al arreglo en el índice especificado.
     *
     * @param estudiante El estudiante a agregar.
     * @param indice     La posición en el arreglo donde se agregará el estudiante.
     * @throws ArrayIndexOutOfBoundsException Si el índice está fuera de rango.
     */
    public void agregarEstudiante(Estudiante estudiante, int indice) throws ArrayIndexOutOfBoundsException {
        if (indice < 0 || indice >= estudiantes.length) {
            throw new ArrayIndexOutOfBoundsException("Índice fuera de rango.");
        }
        estudiantes[indice] = estudiante;
    }

    /**
     * Modifica la calificación de un estudiante en el índice dado.
     *
     * @param indice           El índice del estudiante en el arreglo.
     * @param nuevaCalificacion La nueva calificación a asignar al estudiante.
     * @throws ArrayIndexOutOfBoundsException Si el índice está fuera de rango.
     * @throws Exception                      Si no existe un estudiante en el índice especificado
     *                                        o si la calificación es inválida.
     */
    public void modificarCalificacion(int indice, double nuevaCalificacion) throws Exception {
        if (indice < 0 || indice >= estudiantes.length) {
            throw new ArrayIndexOutOfBoundsException("Índice fuera de rango.");
        }
        if (estudiantes[indice] == null) {
            throw new Exception("No existe un estudiante en el índice especificado.");
        }
        estudiantes[indice].asignarCalificacion(nuevaCalificacion);
    }

    /**
     * Muestra las calificaciones de todos los estudiantes en el arreglo.
     * Si un estudiante no ha sido asignado, muestra un mensaje indicando su índice.
     */
    public void mostrarCalificaciones() {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null) {
                System.out.println("Estudiante: " + estudiantes[i].obtenerNombre() + " - Calificación: " + estudiantes[i].obtenerCalificacion());
            } else {
                System.out.println("Estudiante en índice " + i + " no ha sido asignado.");
            }
        }
    }
}
