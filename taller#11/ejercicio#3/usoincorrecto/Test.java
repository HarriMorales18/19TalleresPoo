public class Test {
    public static void main(String[] args) {
        // Crear objetos de las clases derivadas
        Animal perro = new Perro();
        Animal gato = new Gato();

        // Llamar al método concreto heredado
        perro.comer(); // Este animal está comiendo.
        gato.comer();  // Este animal está comiendo.

        // Llamar a los métodos sobrescritos en las clases derivadas
        perro.hacerSonido(); // El perro ladra.
        gato.hacerSonido();  // El gato maulla.
    }
}