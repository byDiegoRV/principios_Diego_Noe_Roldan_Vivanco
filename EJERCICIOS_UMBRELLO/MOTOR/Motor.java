public class Motor {
private String tipo;
public Motor (String tipo) {
this.tipo = tipo;
}
public void encender() {
System.out.println("Motor " + tipo + " encendido...");
}
}
