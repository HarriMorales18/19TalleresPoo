// Clase Empleado que hereda de Persona
public class Empleado extends Persona {
    // Atributo adicional de la clase Empleado
    private String departamento;
    
    // Constructor de la clase Empleado
    public Empleado(String nombre, int edad, String departamento) {
        // Llamamos al constructor de la clase Persona
        super(nombre, edad);
        this.departamento = departamento;
    }
    
    // Método para mostrar los detalles del empleado
    @Override
    public void mostrarDetalles() {
        // Llamamos al método mostrarDetalles de la clase Persona
        super.mostrarDetalles();
        // Mostramos el departamento
        System.out.println("Departamento: " + departamento);
    }
}
