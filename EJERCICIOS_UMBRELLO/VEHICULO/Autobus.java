

/**
 * Class Autobus
 */
public class Autobus extends Vehiculo {

  //
  // Fields
  //

  private int numAsientos;
  private int numPuertas;
  private int numVentanillas;
  
  //
  // Constructors
  //
  public Autobus () { }

  public Autobus( String marcaModelo, int precioDia, int numllantas,int numAsientos, int numPuertas, int numVentanillas)  {

        super(marcaModelo, precioDia, numllantas);

    this.numAsientos=numAsientos;
    this.numPuertas= numPuertas;
    this.numVentanillas= numVentanillas;


  }
  
  
  public void mostrarDatos()

  {
    System.out.println("el numero de asientos es de "+ numAsientos);
    System.out.println("el número de puertas es de "+ numPuertas);
    System.out.println("el número de ventanillas es de "+ numVentanillas);
  }


  /**
   */
  public void pruebaDelMotor()
  {
    System.out.println("motor funcionando correctamente");
  }


}
