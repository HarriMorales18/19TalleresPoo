// Definir la clase Animal
abstract class Animal {  // Hacer Animal abstracta para no instanciarlo directamente
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}

// Definir la clase Pez que hereda de Animal
class Pez extends Animal {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie);  // Llamada al constructor de la clase base (Animal)
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie();  // Llamada al método de la clase base
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}

