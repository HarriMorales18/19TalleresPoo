// Clase de prueba
public class PruebaUtilidades {
    public static void main(String[] args) {
        // Realizamos operaciones con los métodos de la clase Utilidades
        double suma = Utilidades.sumar(10, 5);
        double resta = Utilidades.restar(10, 5);
        double multiplicacion = Utilidades.multiplicar(10, 5);
        double division = Utilidades.dividir(10, 5);
        double divisionPorCero = Utilidades.dividir(10, 0); // Intento de dividir por cero

        // Mostramos los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("División por cero (error esperado): " + divisionPorCero);
    }
}