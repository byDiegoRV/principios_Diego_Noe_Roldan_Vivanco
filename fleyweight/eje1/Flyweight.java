public interface Flyweight {

    /**
     * Realiza una operación usando el estado intrínseco (compartido)
     * @param contexto El estado extrínseco (no compartido)
     */
    void operacion(String contexto);
}
