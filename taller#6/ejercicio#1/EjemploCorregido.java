public class EjemploCorregido {
    private String nombre;

    // Constructor
    public EjemploCorregido(String nombre) {
        this.nombre = nombre;
    }

    // Método no estático, ahora podemos usar 'this' correctamente
    public void mostrarNombre() {
        System.out.println(this.nombre); // Correcto, ya que es un método de instancia
    }

    public static void main(String[] args) {
        // Creamos una instancia de la clase
        EjemploCorregido ejemplo = new EjemploCorregido("Juan");
        
        // Llamamos al método de instancia
        ejemplo.mostrarNombre();
    }
}
