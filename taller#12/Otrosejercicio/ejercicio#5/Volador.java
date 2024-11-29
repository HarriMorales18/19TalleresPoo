// Interfaz Volador
interface Volador {
    void volar();
}

// Interfaz Nadador
interface Nadador {
    void nadar();
}

// Clase Animal
class Animal implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("Estoy volando.");
    }

    @Override
    public void nadar() {
        System.out.println("Estoy nadando.");
    }
}

