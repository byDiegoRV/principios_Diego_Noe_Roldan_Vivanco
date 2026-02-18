

/**
 * Class EjecutaVehiculo
 */
public class EjecutaVehiculo {

  //
  // Fields
  //

  
  //
  // Constructors
  //
 // public EjecutaVehiculo () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //

  /**
   */
  public static void main(String [] args ){
     Automovil  ve1 = new Automovil(" Volvo 550 ", 120, 4, 5 , 4);
     ve1.mostrarCaracteristicas();
     ve1.mostrarDatos();
     ve1.pruebaDelMotor();

System.out.println("----");
     Motocicleta mo1 = new Motocicleta("Italika ",33,2,1);
     mo1.mostrarCaracteristicas();
     mo1.mostrarDatos();
     mo1.pruebaDelMotor();

System.out.println("----");
     Autobus au1 = new Autobus("Mercedes bens", 400, 6, 25, 1,1);
     au1.mostrarCaracteristicas();
     au1.mostrarDatos();
     au1.pruebaDelMotor();
  }
}


