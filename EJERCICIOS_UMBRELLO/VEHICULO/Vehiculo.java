

  /**
   * Class Vehiculo
   */
  public class Vehiculo {

    //
    // Fields
    //

    protected int precioDia;
    protected String marcaModelo;
    protected int numllantas;
    
    //
    // Constructors
    //
    public Vehiculo () { }

    public Vehiculo(String marcaModelo, int precioDia, int numllantas) {
    this.marcaModelo = marcaModelo;
    this.precioDia = precioDia;
    this.numllantas = numllantas;
    
    }
    
    public void mostrarCaracteristicas()
    {
      System.out.println("marca y modelo "+marcaModelo);
      System.out.println("precio dia "+ precioDia);
      System.out.println("número de llantas " +numllantas);


    }


    /**
     */

    public void encenderMotor()
    {
    System.out.println("motor on");
    }
    

    public void apagarMotor()
    {
    System.out.println("motor of");
    }


    /**
     */
    public void funciona()
    {
System.out.println("all well funcinandoz   ");
    }


  }
