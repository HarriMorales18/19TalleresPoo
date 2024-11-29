// Interfaz base para todos los vehículos
interface Vehiculo {
    void conducir();
    void cargarMercancia();
}

// Interfaz específica para vehículos que conducen
interface Conducible {
    void conducir();
}

// Interfaz específica para vehículos que transportan mercancías
interface Transportable {
    void cargarMercancia();
}

// Clase Coche que implementa las interfaces Conducible y Transportable
class Coche implements Conducible, Transportable {
    @Override
    public void conducir() {
        System.out.println("Conduciendo el coche...");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("Cargando mercancía en el coche...");
    }
}

// Clase Camion que implementa únicamente la interfaz Transportable
class Camion implements Transportable {
    @Override
    public void cargarMercancia() {
        System.out.println("Cargando mercancía en el camión...");
    }
}

