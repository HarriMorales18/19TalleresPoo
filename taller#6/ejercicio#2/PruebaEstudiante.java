public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarDetalles();

        Estudiante estudiante2 = new Estudiante("Juan", 20);
        estudiante2.mostrarDetalles();
    }
}