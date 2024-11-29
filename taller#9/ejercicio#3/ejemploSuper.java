//ntentar utilizar super fuera de un contexto de herencia
public class ejemploSuper {
    public class Main {
        public static void main(String[] args) {
            // Uso incorrecto de super fuera de una clase derivada
            super.toString();  // Error de compilación: 'super' solo puede usarse dentro de una clase hija
        }
    }
    
}
//////////////////////////////////
//Intentar acceder a un atributo privado de la clase base usando super
class Persona {
    private String nombre;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
    }
    
    public Persona(String nombre2, int edad) {
        //TODO Auto-generated constructor stub
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
    }
}

class Empleado extends Persona {
    private String departamento;
    
    public Empleado(String nombre, String departamento) {
        super(nombre);
        this.departamento = departamento;
    }
    
    public void mostrarDetalles() {
        super.mostrarDetalles();
        // Intento de acceder al atributo privado de la clase base (Persona)
        System.out.println("Departamento: " + departamento);
        // La siguiente línea no compila porque nombre es privado en la clase base
        // System.out.println("Nombre desde super: " + super.nombre);  // Error de compilación
    }
}
