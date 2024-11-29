public class CuentaCorriente implements Transferencia, Retiro, Pago {
    private double saldo;

    // ... otros métodos ...

    public void transferir(double monto, CuentaBancaria cuentaDestino) {
        if (saldo >= monto) {
            saldo -= monto;
            cuentaDestino.depositar(monto);
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}