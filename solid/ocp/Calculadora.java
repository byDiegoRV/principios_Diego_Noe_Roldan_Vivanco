package ocp;

class Calculadora {
    public double calcular(Descuento descuento, double monto) {
        return descuento.aplicar(monto);
    }
}

