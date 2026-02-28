package ocp;


class DescuentoRegular implements Descuento {
    public double aplicar(double monto) {
        return monto * 0.9;
    }
}
