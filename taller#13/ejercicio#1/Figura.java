// Clase abstracta Figura
abstract class Figura {
    // Método abstracto para calcular el área
    public abstract double calcularArea();
}

// Clase Rectangulo que extiende Figura
class Rectangulo extends Figura {
    private double largo;
    private double ancho;

    // Constructor
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return largo * ancho;
    }
}

// Clase Triangulo que extiende Figura
class Triangulo extends Figura {
    private double base;
    private double altura;

    // Constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
