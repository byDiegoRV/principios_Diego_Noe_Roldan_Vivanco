public class ConcreteFlyweight implements Flyweight {

    private String fuente;   // Estado intrínseco (compartido)
    private int tamaño;      // Estado intrínseco (compartido)
    private String color;    // Estado intrínseco (compartido)

    public ConcreteFlyweight(String fuente, int tamaño, String color) {
        this.fuente = fuente;
        this.tamaño = tamaño;
        this.color = color;
    }

    @Override
    public void operacion(String contexto) {
        // contexto es el estado extrínseco (posición, contenido específico, etc.)
        System.out.println("Carácter: " + contexto +
                " | Fuente: " + fuente +
                " | Tamaño: " + tamaño + "pt | Color: " + color);
    }

    public String getFuente() { return fuente; }
    public int getTamaño() { return tamaño; }
    public String getColor() { return color; }
}
