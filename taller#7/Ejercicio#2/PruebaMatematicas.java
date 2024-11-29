public class PruebaMatematicas {

    public static void main(String[] args) {
        // Probando los métodos estáticos de la clase Matematicas

        int num1 = 10;
        int num2 = 5;

        // Suma
        int resultadoSuma = Matematicas.suma(num1, num2);
        System.out.println("Suma: " + resultadoSuma);

        // Resta
        int resultadoResta = Matematicas.resta(num1, num2);
        System.out.println("Resta: " + resultadoResta);

        // Multiplicación
        int resultadoMultiplicacion = Matematicas.multiplicacion(num1, num2);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);

        // División
        double resultadoDivision = Matematicas.division(num1, num2);
        if (!Double.isNaN(resultadoDivision)) {
            System.out.println("División: " + resultadoDivision);
        }
    }
}
