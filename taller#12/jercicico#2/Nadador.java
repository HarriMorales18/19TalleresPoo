interface Nadador {
    void nadar();
}

interface Respirador {
    void respirar();
}

class Pez implements Nadador, Respirador {
    @Override
    public void nadar() {
        System.out.println("Estoy nadando en el océano.");
    }

    @Override
    public void respirar() {
        System.out.println("Respiro a través de mis branquias.");
    }
}

