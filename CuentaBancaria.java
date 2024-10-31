/**
 * Clase CuentaBancaria para manejar una cuenta bancaria con número de cuenta y saldo.
 * Proporciona métodos para depositar, retirar y obtener el saldo actual.
 *
 * Autores:
 * - Campos Mendoza Edgar Felipe
 * - Fuentes Esquivel Elian Andrea
 */
public class CuentaBancaria {
    // Número de la cuenta bancaria
    private String numeroCuenta;
    
    // Saldo actual de la cuenta
    private double saldo;

    /**
     * Constructor de la clase CuentaBancaria.
     * Inicializa el número de cuenta y el saldo inicial.
     *
     * @param numeroCuenta  Número de cuenta único.
     * @param saldoInicial  Saldo inicial de la cuenta.
     */
    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    /**
     * Método para depositar una cantidad en la cuenta.
     * Verifica que la cantidad sea positiva antes de agregarla al saldo.
     *
     * @param cantidad La cantidad a depositar. Debe ser positiva.
     */
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    /**
     * Método para retirar una cantidad de la cuenta.
     * Verifica que haya suficiente saldo para realizar el retiro y que la cantidad sea positiva.
     *
     * @param cantidad La cantidad a retirar. Debe ser positiva y menor o igual al saldo actual.
     * @throws Exception Si la cantidad a retirar excede el saldo disponible o es negativa.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad > saldo) {
            throw new Exception("Fondos insuficientes para realizar el retiro.");
        } else if (cantidad > 0) {
            saldo -= cantidad;
        } else {
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return El saldo actual.
     */
    public double obtenerSaldo() {
        return saldo;
    }

    /**
     * Obtiene el número de cuenta.
     *
     * @return El número de cuenta.
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
}
