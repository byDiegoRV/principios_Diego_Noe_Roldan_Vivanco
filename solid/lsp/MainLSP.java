package lsp;

public class MainLSP {
    public static void main(String[] args) {
        Figura f1 = new Rectangulo(4, 5);
        Figura f2 = new Cuadrado(4);

        System.out.println(f1.calcularArea());
        System.out.println(f2.calcularArea());
    }
}

