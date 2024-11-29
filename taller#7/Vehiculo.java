//public class Vehiculo {
    // Atributo no estático
    //int velocidad;

    // Método estático
    //public static void aumentarVelocidad() {
        // Intentamos acceder al atributo no estático 'velocidad'
        //velocidad++;  // Error de compilación
    //}

    //public static void main(String[] args) {
        //aumentarVelocidad();
    //}
//}
///////////////////////////////////////////////////////////////////
/// Error: non-static variable velocidad cannot be referenced from a static context
//solocucion
//La solución es hacer que el método aumentarVelocidad no sea estático, de esta manera tendrá acceso al atributo velocidad de una instancia de Vehiculo.
public class Vehiculo {
    // Atributo no estático
    int velocidad;

    // Método no estático
    public void aumentarVelocidad() {
        velocidad++;  // Ahora accede correctamente al atributo de la instancia
    }

    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo();
        miVehiculo.aumentarVelocidad();  // Llamamos al método no estático usando una instancia
    }
}



