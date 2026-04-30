import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String, Flyweight> pool = new HashMap<>();

    public Flyweight obtenerFlyweight(String fuente, int tamaño, String color) {
        String clave = generarClave(fuente, tamaño, color);

        if (!pool.containsKey(clave)) {
            System.out.println("[NUEVO] Creando Flyweight: " + clave);
            pool.put(clave, new ConcreteFlyweight(fuente, tamaño, color));
        } else {
            System.out.println("[REUTILIZADO] Usando Flyweight del pool: " + clave);
        }

        return pool.get(clave);
    }

    private String generarClave(String fuente, int tamaño, String color) {
        return fuente + "_" + tamaño + "_" + color;
    }

    public void mostrarEstadoPool() {
        System.out.println("\n=== ESTADO DEL POOL ===");
        System.out.println("Objetos Flyweight en el pool: " + pool.size());

        for (String clave : pool.keySet()) {
            System.out.println(" - " + clave);
        }

        System.out.println("========================\n");
    }

    public int obtenerTamañoPool() {
        return pool.size();
    }
}
