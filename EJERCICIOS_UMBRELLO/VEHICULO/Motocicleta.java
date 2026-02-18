

/**
 * Class Motocicleta
 */
public class Motocicleta extends Vehiculo {

  //
  // Fields
  //

  private int numAsientos;
  
  //
  // Constructors
  //
  public Motocicleta () { }
  
  public Motocicleta (String marcaModelo, int precioDia, int numllantas,int numAsientos){
    super(marcaModelo, precioDia, numllantas);
       this.numAsientos= numAsientos;
  }
  public void mostrarDatos()

  {
    System.out.println("el número de asientos es "+ numAsientos);
  }


  /**
   */
  public void pruebaDelMotor()
  {
    System.out.println("todo funcuiona correctamente");
  }


}
