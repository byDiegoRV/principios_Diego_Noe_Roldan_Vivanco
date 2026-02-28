package dip;

class Coche {
    private Motor motor;

    public Coche(Motor motor) {
        this.motor = motor;
    }

    public void arrancar() {
        motor.encender();
    }
}