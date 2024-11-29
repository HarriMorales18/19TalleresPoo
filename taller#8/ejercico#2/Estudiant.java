// Clase Estudiante que hereda de Persona
public class Estudiante extends Persona {
    // Atributo adicional de la clase Estudiante
    private String matricula;

    // Constructor de la clase Estudiante
    public Estudiante(String nombre, int edad, String matricula) {
        // Llamamos al constructor de la clase padre (Persona)
        super(nombre, edad);
        this.matricula = matricula;
    }

    // Métodos getter y setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Sobrescribimos el método mostrarInformacion para incluir la matrícula
    @Override
    public void mostrarInformacion() {
        // Llamamos al método mostrarInformacion de la clase padre (Persona)
        super.mostrarInformacion();
        // Mostramos la matrícula del estudiante
        System.out.println("Matrícula: " + matricula);
    }
}
