abstract class Animal {
    // Método concreto (con implementación)
    void comer() {
        System.out.println("Este animal está comiendo.");
    }

    // Método abstracto (sin implementación)
    abstract void hacerSonido(); 
}

class Perro extends Animal {
    // Sobrescribir el método abstracto
    @Override
    void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}

class Gato extends Animal {
    // Sobrescribir el método abstracto
    @Override
    void hacerSonido() {
        System.out.println("El gato maulla.");
    }
//////////////////////////
/// El compilador no permite la instanciación de clases abstractas porque están incompletas, es decir, están diseñadas 
/// para ser extendidas por otras clases que implementen los métodos abstractos.

}

