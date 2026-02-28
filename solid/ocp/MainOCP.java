package ocp;

public class MainOCP {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double total = calc.calcular(new DescuentoVIP(), 100);
        System.out.println("Total con descuento: " + total);
    }
}

