package lsp;

class Cuadrado implements Figura {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int calcularArea() {
        return lado * lado;
    }
}
