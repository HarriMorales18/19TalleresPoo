// Clase abstracta Figura
abstract class Figura {
    // Método abstracto para calcular el área
    public abstract double calcularArea();
    
    // Método para mostrar el área
    public void mostrarArea() {
        System.out.println("El área de la figura es: " + calcularArea());
    }
}

// Clase Circulo que extiende Figura
class Circulo extends Figura {
    private double radio;
    
    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;  // A = πr²
    }
}

// Clase Rectangulo que extiende Figura
class Rectangulo extends Figura {
    private double ancho;
    private double alto;
    
    // Constructor
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return ancho * alto;  // A = ancho * alto
    }
}

