// Clase derivada Profesor
class Profesor extends Persona {
    // Sobrescribe el método presentarse
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un profesor.");
    }
}
