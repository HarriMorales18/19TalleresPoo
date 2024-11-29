

public class Main {
    public static <Profesor> void main(String[] args) {
        // Creando instancias de las clases
        Persona persona = new Persona();
        Estudiante estudiante = new Estudiante();
        Profesor profesor = new Profesor();

        // Llamando al método presentarse de cada objeto
        persona.presentarse();   // Imprime: Hola, soy una persona.
        estudiante.presentarse(); // Imprime: Hola, soy un estudiante.
        ((Persona) profesor).presentarse();   // Imprime: Hola, soy un profesor.
    }
}
