// Clase Gerente que hereda de Empleado
public class Gerente extends Empleado {
    // Atributo adicional de la clase Gerente
    private String departamento;

    // Constructor de la clase Gerente
    public Gerente(String nombre, double salario, String departamento) {
        // Llamamos al constructor de la clase padre (Empleado)
        super(nombre, salario);
        this.departamento = departamento;
    }

    // Métodos getter y setter
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Sobrescribimos el método mostrarDetalles para incluir el departamento
    /**
     * 
     */
    @Override
    public void mostrarDetalles() {
        // Llamamos al método mostrarDetalles de la clase padre (Empleado)
        super.mostrarDetalles();
        // Mostramos el departamento del gerente
        System.out.println("Departamento: " + departamento);
    }
}
