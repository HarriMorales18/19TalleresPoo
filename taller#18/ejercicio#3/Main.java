public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new Coche();
        coche.conducir();
        coche.cargarMercancia();

        Transportable camion = new Camion();
        camion.cargarMercancia();
    }
}