public interface Transferencia {
    void transferir(double monto, CuentaBancaria cuentaDestino);
}

public interface Retiro {
    void retirar(double monto);
}

public interface Pago {
    void pagar(double monto, String concepto);
}

public class CuentaCorriente implements Transferencia, Retiro, Pago {
    // ... implementación de los métodos ...
}

public class CuentaAhorros implements Transferencia, Retiro {
    // ... implementación de los métodos ...
}