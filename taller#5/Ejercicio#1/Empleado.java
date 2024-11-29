// Clase Empleado
public class Empleado {
    // Propiedad pública: nombre
    public String nombre;
    
    // Propiedad privada: salario
    private double salario;
    
    // Método getter para salario
    public double getSalario() {
        return salario;
    }
    
    // Método setter para salario con validaciones
    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("El salario no puede ser negativo.");
        } else {
            this.salario = salario;
        }
    }
    
    // Constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
}

