// Clase principal para probar las clases Vehiculo y Coche
public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Vehiculo
        Vehiculo vehiculo = new Vehiculo("Toyota", 180);
        System.out.println("Información del vehículo:");
        vehiculo.mostrarInformacion();
        
        System.out.println();

        // Creamos un objeto de la clase Coche
        Coche coche = new Coche("Honda", 200, 4);
        System.out.println("Información del coche:");
        coche.mostrarInformacion();
    }
}
