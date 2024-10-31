import java.util.Scanner;

/**
 * Clase principal Main que proporciona una interfaz de usuario para gestionar estudiantes y sus calificaciones.
 * Permite agregar estudiantes, modificar calificaciones y mostrar las calificaciones de todos los estudiantes.
 *
 * Autores:
 * - Campos Mendoza Edgar Felipe
 * - Fuentes Esquivel Elian Andrea
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gestion gestion = new Gestion(10); // Tamaño fijo de 10 estudiantes

        while (true) {
            // Menú de opciones
            System.out.println("\nMenú:");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Modificar calificación");
            System.out.println("3. Mostrar calificaciones");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            try {
                if (opcion == 1) {
                    // Agregar un nuevo estudiante
                    System.out.print("Nombre del estudiante: ");
                    String nombre = scanner.next();
                    System.out.print("Índice para agregar al estudiante: ");
                    int indice = scanner.nextInt();
                    gestion.agregarEstudiante(new Estudiante(nombre), indice);
                    System.out.println("Estudiante agregado con éxito.");
                } else if (opcion == 2) {
                    // Modificar la calificación de un estudiante existente
                    System.out.print("Índice del estudiante: ");
                    int indice = scanner.nextInt();
                    System.out.print("Nueva calificación: ");
                    double nuevaCalificacion = scanner.nextDouble();
                    gestion.modificarCalificacion(indice, nuevaCalificacion);
                    System.out.println("Calificación modificada con éxito.");
                } else if (opcion == 3) {
                    // Mostrar todas las calificaciones
                    gestion.mostrarCalificaciones();
                } else if (opcion == 4) {
                    // Salir del programa
                    System.out.println("Saliendo del programa.");
                    break;
                } else {
                    System.out.println("Opción no válida.");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Cerrar el Scanner para liberar recursos
        scanner.close();
    }
}
