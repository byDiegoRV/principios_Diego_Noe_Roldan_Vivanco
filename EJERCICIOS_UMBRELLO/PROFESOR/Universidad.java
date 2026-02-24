
import java.util.List;

public class Universidad {

    private String nombre;
    private List<Profesor> profesores;

    public Universidad(String nombre, List<Profesor> profesores) {
        this.nombre = nombre;
        this.profesores = profesores;
    }

    public void mostrarProfesores() {
        System.out.println("Profesores en " + nombre + ":");
        for (Profesor p : profesores) {
            System.out.println("- " + p.getNombre() + " (" + p.getEspecialidad() + ")");
        }
    }
}



