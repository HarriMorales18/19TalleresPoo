public class Matematicas {

    // Método estático para la suma
    public static int suma(int a, int b) {
        return a + b;
    }

    // Método estático para la resta
    public static int resta(int a, int b) {
        return a - b;
    }

    // Método estático para la multiplicación
    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    // Método estático para la división
    public static double division(int a, int b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; // Retorna "Not a Number" en caso de división por cero
        }
        return (double) a / b;
    }
}
