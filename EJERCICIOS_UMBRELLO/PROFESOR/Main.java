/**
 * Class Main
 */
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Profesor p1 = new Profesor("Centeno", "Principios de Diseño de SW");
        Profesor p2 = new Profesor("Gabriel", "IA");
        Profesor p3 = new Profesor("Jorge", "Base de Datos");

        List<Profesor> listaProfesores = new ArrayList<>();
        listaProfesores.add(p1);
        listaProfesores.add(p2);
        listaProfesores.add(p3);

        Universidad universidad = new Universidad("USBI", listaProfesores);

        universidad.mostrarProfesores();
    }
}

  
