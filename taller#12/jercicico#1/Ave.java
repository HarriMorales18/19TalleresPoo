// Clase Ave
public class Ave {

    // Método volar
    public void volar() {
        System.out.println("El ave está volando.");
    }

    // Método cantar
    public void cantar() {
        System.out.println("El ave está cantando.");
    }

    // Método main para instanciar y probar la clase Ave
    public static void main(String[] args) {
        // Crear un objeto de tipo Ave
        Ave ave = new Ave();

        // Usar los métodos de la clase Ave
        ave.volar();  // Llama al método volar
        ave.cantar(); // Llama al método cantar
    }
}
