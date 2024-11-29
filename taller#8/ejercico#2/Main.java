// Clase principal para probar las clases Persona y Estudiante
public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Persona
        Persona persona = new Persona("Juan Pérez", 30);
        System.out.println("Información de la persona:");
        persona.mostrarInformacion();
        
        System.out.println();

        // Creamos un objeto de la clase Estudiante
        Estudiante estudiante = new Estudiante("María García", 20, "2023001");
        System.out.println("Información del estudiante:");
        estudiante.mostrarInformacion();
    }
}
