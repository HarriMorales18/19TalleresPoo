
// Clase de prueba
public class PruebaEmpleado {
    public static void main(String[] args) {
        // Instanciamos un objeto de la clase Empleado
        Empleado empleado = new Empleado("Juan Pérez");
        
        // Establecemos el salario usando el método setter con validación
        empleado.setSalario(3500.50); // Establecer un salario válido
        System.out.println("Nombre: " + empleado.nombre);
        System.out.println("Salario: " + empleado.getSalario());

        // Intentamos establecer un salario negativo
        empleado.setSalario(-1000); // Esto no debería cambiar el salario
        System.out.println("Salario después de intento de cambio negativo: " + empleado.getSalario());
    }
}
