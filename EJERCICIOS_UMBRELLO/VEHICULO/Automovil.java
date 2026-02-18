

/**
 * Class Automovil
 */
public class Automovil extends Vehiculo {

  //
  // Fields
  //

  private int numAsientos;
  private int numPuertas;
  
  //
  // Constructors
  //
  public Automovil () { }

  public Automovil(String marcaModelo, int precioDia, int numllantas,
                   int numAsientos, int numPuertas) {

    super(marcaModelo, precioDia, numllantas);
this.numAsientos= numAsientos;
this.numPuertas=numPuertas;
  }
  
  
  public void mostrarDatos()
  {
    System.out.println("el númerode puertas es de "+ numPuertas);
    System.out.println(" el numero de asientos es de "+ numAsientos);
  }


  /**
   */
  public void pruebaDelMotor()
  {
    System.out.println("motor funcionando");
  }


}
