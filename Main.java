import java.util.Scanner;

/**
 * Clase principal Main que proporciona una interfaz de usuario para gestionar cuentas bancarias.
 * Permite crear cuentas, realizar depósitos y retiros mediante un menú interactivo.
 *
 * Autores:
 * - Campos Mendoza Edgar Felipe
 * - Fuentes Esquivel Elian Andrea
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco(10);  // Tamaño fijo de 10 cuentas

        while (true) {
            // Menú de opciones
            System.out.println("\nMenú:");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Realizar retiro");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            try {
                if (opcion == 1) {
                    // Opción para crear una nueva cuenta
                    System.out.print("Número de cuenta: ");
                    String numeroCuenta = scanner.next();
                    System.out.print("Saldo inicial: ");
                    double saldoInicial = scanner.nextDouble();
                    System.out.print("Índice para agregar la cuenta: ");
                    int indice = scanner.nextInt();
                    banco.agregarCuenta(new CuentaBancaria(numeroCuenta, saldoInicial), indice);
                    System.out.println("Cuenta creada con éxito.");
                } else if (opcion == 2) {
                    // Opción para realizar un depósito en una cuenta
                    System.out.print("Índice de la cuenta: ");
                    int indice = scanner.nextInt();
                    System.out.print("Cantidad a depositar: ");
                    double cantidad = scanner.nextDouble();
                    CuentaBancaria cuenta = banco.obtenerCuenta(indice);
                    if (cuenta != null) {
                        cuenta.depositar(cantidad);
                        System.out.println("Depósito realizado con éxito. Saldo actual: " + cuenta.obtenerSaldo());
                    } else {
                        System.out.println("No existe una cuenta en el índice especificado.");
                    }
                } else if (opcion == 3) {
                    // Opción para realizar un retiro de una cuenta
                    System.out.print("Índice de la cuenta: ");
                    int indice = scanner.nextInt();
                    System.out.print("Cantidad a retirar: ");
                    double cantidad = scanner.nextDouble();
                    banco.retirarDeCuenta(indice, cantidad);
                    System.out.println("Retiro realizado con éxito.");
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
