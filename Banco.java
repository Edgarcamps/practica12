/**
 * Clase Banco para manejar múltiples cuentas bancarias.
 * Proporciona métodos para agregar, retirar y obtener cuentas bancarias
 * dentro de una estructura de arreglo.
 *
 * Autores:
 * - Campos Mendoza Edgar Felipe
 * - Fuentes Esquivel Elian Andrea
 */
public class Banco {
    // Arreglo de cuentas bancarias
    private CuentaBancaria[] cuentas;

    /**
     * Constructor de la clase Banco.
     * Inicializa el arreglo de cuentas bancarias con la capacidad especificada.
     *
     * @param capacidad Tamaño máximo de cuentas bancarias en el banco.
     */
    public Banco(int capacidad) {
        cuentas = new CuentaBancaria[capacidad];
    }

    /**
     * Agrega una cuenta bancaria al arreglo en el índice especificado.
     *
     * @param cuenta La cuenta bancaria a agregar.
     * @param indice La posición en el arreglo donde se agregará la cuenta.
     * @throws ArrayIndexOutOfBoundsException Si el índice está fuera de rango.
     */
    public void agregarCuenta(CuentaBancaria cuenta, int indice) throws ArrayIndexOutOfBoundsException {
        if (indice < 0 || indice >= cuentas.length) {
            throw new ArrayIndexOutOfBoundsException("Índice fuera de rango.");
        }
        cuentas[indice] = cuenta;
    }

    /**
     * Retira una cantidad especificada de una cuenta bancaria en el índice dado.
     *
     * @param indice   El índice de la cuenta bancaria en el arreglo.
     * @param cantidad La cantidad a retirar de la cuenta.
     * @throws ArrayIndexOutOfBoundsException Si el índice está fuera de rango.
     * @throws Exception                      Si no existe ninguna cuenta en el índice especificado
     *                                        o si el saldo es insuficiente.
     */
    public void retirarDeCuenta(int indice, double cantidad) throws ArrayIndexOutOfBoundsException, Exception {
        if (indice < 0 || indice >= cuentas.length) {
            throw new ArrayIndexOutOfBoundsException("Índice fuera de rango.");
        }
        if (cuentas[indice] != null) {
            try {
                cuentas[indice].retirar(cantidad);
            } catch (Exception e) {
                throw new Exception("Error al retirar: " + e.getMessage());
            }
        } else {
            throw new Exception("No existe ninguna cuenta en el índice especificado.");
        }
    }

    /**
     * Obtiene una cuenta bancaria en el índice especificado.
     *
     * @param indice El índice de la cuenta bancaria en el arreglo.
     * @return La cuenta bancaria en el índice dado o null si el índice está fuera de rango.
     */
    public CuentaBancaria obtenerCuenta(int indice) {
        if (indice >= 0 && indice < cuentas.length) {
            return cuentas[indice];
        } else {
            System.out.println("Índice fuera de rango.");
            return null;
        }
    }
}
