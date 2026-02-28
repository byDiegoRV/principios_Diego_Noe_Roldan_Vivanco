package ocp;

class DescuentoVIP implements Descuento {
    public double aplicar(double monto) {
        return monto * 0.8;
    }
}

