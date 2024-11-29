// Clase de prueba para instanciar objetos de Empleado y Gerente
public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Empleado
        Empleado empleado = new Empleado("Carlos Martínez", 3500.50);
        System.out.println("Detalles del empleado:");
        empleado.mostrarDetalles();
        
        System.out.println();

        // Creamos un objeto de la clase Gerente
        Gerente gerente = new Gerente("Ana López", 5500.75, "Ventas");
        System.out.println("Detalles del gerente:");
        gerente.mostrarDetalles();
    }
}
