public class Automovil {
private String modelo;

private final Motor motor;
public Automovil (String modelo, String tipoMotor) {
this.modelo = modelo;

this.motor = new Motor (tipoMotor);
}
public void arrancar() {
System.out.println("Arrancando el modelo: " +modelo);
motor.encender();
}
}

