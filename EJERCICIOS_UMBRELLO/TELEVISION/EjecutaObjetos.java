

/**
 * Class EjecutaObjetos
 */
public class EjecutaObjetos {

  public static void main(String[] args) {

        Television tv1 = new Television("Plana", "55 pulgadas", "4K", "Samsung");
        tv1.apagada();
        tv1.prendida();

        Television tv2 = new Television("Curva", "65 pulgadas", "8K", "LG");
        tv2.apagada();
        tv2.prendida();
    }
}