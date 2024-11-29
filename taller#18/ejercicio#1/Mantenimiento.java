interface Mantenimiento {
    void reparar();
    void limpiar();
}
interface Reparacion {
    void reparar();
    // Otros métodos específicos de reparación
}

interface Limpieza {
    void limpiar();
    // Otros métodos específicos de limpieza
}
class Equipo implements Reparacion, Limpieza {
    @Override
    public void reparar() {
        // Lógica para realizar la reparación
        System.out.println("Equipo reparado");
    }

    @Override
    public void limpiar() {
        // Lógica para realizar la limpieza
        System.out.println("Equipo limpio");
    }
    public class Main {
        public static void main(String[] args) {
            Equipo equipo = new Equipo();
            equipo.reparar();
            equipo.limpiar();
        }
    }
}
