public class Main {

    public static void main(String[] args) {
        System.out.println("=== PATRON FLYWEIGHT ===\n");

        FlyweightFactory factory = new FlyweightFactory();

        System.out.println("--- PARRAFO 1: Titulo en Arial 16pt Rojo ---");
        crearParrafo(factory, "Titulo en Arial 16 rojo", "Arial", 16, "Rojo");
        factory.mostrarEstadoPool();

        System.out.println("--- PARRAFO 2: Cuerpo en Times 12pt Negro ---");
        crearParrafo(factory, "Cuerpo en Times 12 negro", "Times", 12, "Negro");
        factory.mostrarEstadoPool();

        System.out.println("--- PARRAFO 3: Otro titulo en Arial 16pt Rojo (REUTILIZACION) ---");
        crearParrafo(factory, "Otro titulo en Arial 16 rojo", "Arial", 16, "Rojo");
        factory.mostrarEstadoPool();

        System.out.println("--- PARRAFO 4: Enfasis en Arial 12pt Azul ---");
        crearParrafo(factory, "Enfasis en Arial 12 azul", "Arial", 12, "Azul");
        factory.mostrarEstadoPool();

        System.out.println("--- PARRAFO 5: Mas cuerpo en Times 12pt Negro (REUTILIZACION) ---");
        crearParrafo(factory, "Mas cuerpo en Times 12 negro", "Times", 12, "Negro");
        factory.mostrarEstadoPool();

        System.out.println("=== ESTADISTICAS FINALES ===");
        System.out.println("Total de objetos Flyweight creados (únicos): " + factory.obtenerTamañoPool());
        System.out.println("Sin el patrón Flyweight: Se hubieran creado 124 objetos");
        System.out.println("Con el patrón Flyweight: Se crearon " + factory.obtenerTamañoPool() + " objetos");
        System.out.println("Ahorro de memoria: " + ((124 - factory.obtenerTamañoPool()) * 100 / 124) + "%");
    }

    private static void crearParrafo(FlyweightFactory factory, String texto,
                                     String fuente, int tamaño, String color) {

        System.out.println();

        for (char c : texto.toCharArray()) {
            if (c != ' ') {
                Flyweight flyweight = factory.obtenerFlyweight(fuente, tamaño, color);
                flyweight.operacion(String.valueOf(c));
            }
        }
    }
}
