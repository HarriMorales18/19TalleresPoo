public class Coche {
    private static int contadorCoches = 0;
    private String marca;
    private String modelo;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public static int getContadorCoches() {
        return contadorCoches;
    }

    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Honda", "Civic");
        Coche coche3 = new Coche("Ford", "Mustang");

        System.out.println("Se han creado " + Coche.getContadorCoches() + " coches.");
    }
}