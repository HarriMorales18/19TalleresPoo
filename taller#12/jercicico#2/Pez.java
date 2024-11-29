public class Pez {

    public static void main(String[] args) {
        // Crear un objeto de la clase Pez
        Pez miPez = new Pez();
        
        // Llamar a los métodos nadar y respirar
        miPez.nadar();
        miPez.respirar();
    }

    // Método nadar
    private void nadar() {
        // Implementación del método nadar
        System.out.println("El pez está nadando.");
    }

    // Método respirar
    private void respirar() {
        // Implementación del método respirar
        System.out.println("El pez está respirando por sus branquias.");
    }
}
