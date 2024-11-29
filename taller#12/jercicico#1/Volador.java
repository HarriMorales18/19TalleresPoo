interface Volador {
    void volar();
}

interface Cantante {
    void cantar();
}

class Ave implements Volador, Cantante {
    @Override
    public void volar() {
        System.out.println("Estoy volando!");
    }

    @Override
    public void cantar() {
        System.out.println("¡Pío, pío!");
    }
}

