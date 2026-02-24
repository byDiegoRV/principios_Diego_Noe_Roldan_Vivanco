

/**
 * Class Main
 */
public class Main {

    public static void main(String[] args) {

        Auto auto = new Auto("Honda");
        Persona persona = new Persona("Noe", auto);

        persona.mostrarAuto();
    }
}