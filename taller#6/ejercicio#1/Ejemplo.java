public class Ejemplo {
    private String nombre;

    // Método static (no puede usar 'this')
    public static void mostrarNombre() {
        // Intentar usar 'this' aquí causará un error
        // System.out.println(this.nombre); // Error: no se puede usar 'this' en un contexto estático
    }

    public static void main(String[] args) {
        // Llamamos al método static
        mostrarNombre();
    }
   
}  //error: non-static variable nombre cannot be referenced from a static context
