// Interfaz Hablador
interface Hablador {
    void hablar();
}

// Interfaz Trabajador
interface Trabajador {
    void trabajar();
}

// Clase Persona
class Persona implements Hablador, Trabajador {
    @Override
    public void hablar() {
        System.out.println("Hola, soy una persona y puedo hablar.");
    }

    @Override
    public void trabajar() {
        System.out.println("Estoy trabajando.");
    }
}
