// Clase derivada Estudiante
class Estudiante extends Persona {
    // Sobrescribe el método presentarse
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante.");
    }
}
