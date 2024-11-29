// Clase principal para probar el código
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);
        
        circulo.mostrarArea();  // Mostrar el área del círculo
        rectangulo.mostrarArea();  // Mostrar el área del rectángulo
    }
}
