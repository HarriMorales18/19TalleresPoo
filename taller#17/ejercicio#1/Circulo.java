// Clase abstracta Figura
public abstract class Figura {
    // Método abstracto para calcular el área
    public abstract double calcularArea();
}

// Clase Circulo que hereda de Figura
public class Circulo extends Figura {
    private double radio;

    // Constructor
    public Circulo(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser mayor que cero.");
        }
        this.radio = radio;
    }

    // Getter para el radio
    public double getRadio() {
        return radio;
    }

    // Setter para el radio
    public void setRadio(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio debe ser mayor que cero.");
        }
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio; // Área de un círculo
    }
}

// Clase Rectangulo que hereda de Figura
public class Rectangulo extends Figura {
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("La base y la altura deben ser mayores que cero.");
        }
        this.base = base;
        this.altura = altura;
    }

    // Getter para la base
    public double getBase() {
        return base;
    }

    // Setter para la base
    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("La base debe ser mayor que cero.");
        }
        this.base = base;
    }

    // Getter para la altura
    public double getAltura() {
        return altura;
    }

    // Setter para la altura
    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que cero.");
        }
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura; // Área de un rectángulo
    }
}
