// Clase Persona
public class Persona {
    // Atributos de la clase Persona
    private String nombre;
    private int edad;
    
    // Constructor de la clase Persona
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Método para mostrar los detalles de la persona
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
