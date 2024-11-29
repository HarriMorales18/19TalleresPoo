// Clase abstracta Empleado
abstract class Empleado {
    // Método abstracto para calcular el salario
    public abstract double calcularSalario();
    
    // Método para mostrar los detalles del empleado
    public void mostrarDetalles() {
        System.out.println("El salario del empleado es: " + calcularSalario());
    }
}

// Clase Gerente que extiende Empleado
class Gerente extends Empleado {
    private double salarioBase;
    private double bono;
    
    // Constructor
    public Gerente(double salarioBase, double bono) {
        this.salarioBase = salarioBase;
        this.bono = bono;
    }
    
    // Implementación del método calcularSalario
    @Override
    public double calcularSalario() {
        return salarioBase + bono;  // Salario base + bono
    }
}

// Clase Vendedor que extiende Empleado
class Vendedor extends Empleado {
    private double salarioBase;
    private double comision;
    
    // Constructor
    public Vendedor(double salarioBase, double comision) {
        this.salarioBase = salarioBase;
        this.comision = comision;
    }
    
    // Implementación del método calcularSalario
    @Override
    public double calcularSalario() {
        return salarioBase + comision;  // Salario base + comisión
    }
}

