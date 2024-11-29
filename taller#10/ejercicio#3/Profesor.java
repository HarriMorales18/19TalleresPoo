public class ejemploSobreScritura {
    // Intento incorrecto de sobrescribir
public class Estudiante extends Persona {
    @Override
    public void presentarse(String nombre) {  // Error: El método no coincide con el de la clase base
        System.out.println("Hola, soy un estudiante y mi nombre es " + nombre);
    }
}
// Este código falla porque la firma del método presentarse en la clase base (Persona) no incluye el parámetro String nombre, y no se puede sobrescribir con una firma diferente.
}
//////////////////////////////////////////
//Sobrescribir un método sin usar @Override
// Sobrescritura sin la anotación @Override
public class Profesor extends Persona {
    public void presentarse() { // Sobrescrito sin @Override
        System.out.println("Hola, soy un profesor.");
    }
//Sobrescribir un método sin la anotación @Override es técnicamente posible, pero no se recomienda por las razones mencionadas previamente (como la verificación en tiempo de compilación).
//Aunque este código funcionará, es una mala práctica porque no proporciona las verificaciones adicionales del compilador.

}
