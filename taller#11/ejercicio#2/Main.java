// Clase principal para probar el código
public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(5000, 1000);
        Empleado vendedor = new Vendedor(3000, 500);
        
        gerente.mostrarDetalles();  // Mostrar detalles del gerente
        vendedor.mostrarDetalles();  // Mostrar detalles del vendedor
    }
}
