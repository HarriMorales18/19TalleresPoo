public class Animal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.volar();
        animal.nadar();
    }

    // Implement the volar method
    public void volar() {
        System.out.println("El animal está volando.");
    }

    // Implement the nadar method
    public void nadar() {
        System.out.println("El animal está nadando.");
    }
}