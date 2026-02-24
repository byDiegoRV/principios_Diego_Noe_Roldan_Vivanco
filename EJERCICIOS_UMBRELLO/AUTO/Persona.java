


/**
 * Class Persona
 */
public class Persona {

    private String nombre;
    private Auto auto;

    public Persona(String nombre, Auto auto) {
        this.nombre = nombre;
        this.auto = auto;
    }

    public void mostrarAuto() {
        System.out.println(nombre + " tiene un " + auto.getMarca());
    }
}
