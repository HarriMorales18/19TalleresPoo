// Clase Vehiculo
public class Vehiculo {
    // Atributos de la clase Vehiculo
    private String marca;
    private int velocidadMaxima;

    // Constructor de la clase Vehiculo
    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Métodos getter y setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método para mostrar la información del vehículo
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
    }
    public class Coche extends Vehiculo {
        // Atributo adicional de la clase Coche
        private int numeroDePuertas;
    
        // Constructor de la clase Coche
        public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
            // Llamamos al constructor de la clase padre (Vehiculo)
            super(marca, velocidadMaxima);
            this.numeroDePuertas = numeroDePuertas;
        }
    
        // Métodos getter y setter
        public int getNumeroDePuertas() {
            return numeroDePuertas;
        }
    
        public void setNumeroDePuertas(int numeroDePuertas) {
            this.numeroDePuertas = numeroDePuertas;
        }
    
        // Método para mostrar la información del coche
        @Override
        public void mostrarInformacion() {
            // Mostramos la información de la clase padre (Vehiculo)
            super.mostrarInformacion();
            // Mostramos la información adicional de la clase Coche
            System.out.println("Número de puertas: " + numeroDePuertas);
        }
    }
}
