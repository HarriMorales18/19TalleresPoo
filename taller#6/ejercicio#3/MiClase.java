public class MiClase {

    private String mensaje;

    public MiClase(String mensaje) {
        this.mensaje = mensaje;
    }

    public void metodoNoStatico() {
        System.out.println(this.mensaje);  // Correcto: 'this' puede usarse en un método no estático
    }

    public static void metodoStatico(MiClase objeto) {
        System.out.println(objeto.mensaje);  // Accedemos a la variable de instancia a través del objeto
    }

    public static void main(String[] args) {
        MiClase objeto = new MiClase("Hola, Mundo");
        objeto.metodoNoStatico();  // Llamada a un método no estático
        MiClase.metodoStatico(objeto);  // Llamada al método estático con el objeto
    }
}
