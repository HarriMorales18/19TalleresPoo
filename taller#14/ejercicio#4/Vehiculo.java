// Clase base Vehículo
class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
}

// Clase derivada Coche
class Coche extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El coche está conduciendo.");
    }
}

// Clase derivada Bicicleta
class Bicicleta extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("La bicicleta está pedaleando.");
    }
}
