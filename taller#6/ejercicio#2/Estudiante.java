public class Estudiante {
    private String nombre;
    private int edad;

    // Constructor por defecto que delega en el constructor con parámetros
    public Estudiante() {
        this("Desconocido", 0); // Llama al constructor con parámetros
    }

    // Constructor con parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar los detalles
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}