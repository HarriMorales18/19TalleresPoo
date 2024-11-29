public abstract class CuentaBancaria {
    protected double saldo;

    // Constructor
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Getter para saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter para saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos abstractos
    public abstract void depositar(double cantidad);
    public abstract void retirar(double cantidad) throws Exception; // Añadido throws para la excepción
}

public class CuentaAhorros extends CuentaBancaria {
    private double interes;

    // Constructor
    public CuentaAhorros(double saldoInicial, double interes) {
        super(saldoInicial); // Llama al constructor de la clase base
        this.interes = interes;
    }

    // Getter y setter para interes
    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;  // Se agrega el monto al saldo
        } else {
            throw new IllegalArgumentException("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    @Override
    public void retirar(double cantidad) throws Exception {
        if (saldo - cantidad >= 0) {
            saldo -= cantidad; // Se retira el monto si hay fondos suficientes
        } else {
            throw new Exception("Fondos insuficientes para realizar el retiro."); // Lanzamos una excepción en caso de fondos insuficientes
        }
    }
}
