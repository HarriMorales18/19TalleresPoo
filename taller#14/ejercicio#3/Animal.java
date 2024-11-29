// Clase base
class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

// Clase derivada
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }

    public void correr() {
        System.out.println("El perro corre.");
    }
}
