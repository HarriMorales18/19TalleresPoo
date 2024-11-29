// Clase base Figura
class Figura {
    public void calcularArea() {
        System.out.println("Método general para calcular área de una figura.");
    }
}

// Clase derivada Circulo
class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("Área del círculo: " + area);
    }
}

// Clase derivada Rectangulo
class Rectangulo extends Figura {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public void calcularArea() {
        double area = largo * ancho;
        System.out.println("Área del rectángulo: " + area);
    }
}

