public interface OperacionBancaria<CuentaBancaria> {
    void transferir(double monto, CuentaBancaria cuentaDestino);
    void retirar(double monto);
    void pagarFactura(double monto, String concepto);
}
