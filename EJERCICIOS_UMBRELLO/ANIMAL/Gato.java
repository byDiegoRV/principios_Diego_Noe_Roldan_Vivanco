


public class Gato extends Animal implements Sonido {


  public Gato () { }

  public Gato (String nombre){
      super(nombre);
  }
  
  
  @Override
  public void mover()
  {
    System.out.println("El gato salta");
  }


  /**
   */
  @Override
  public void hacerSonido()
  {
    System.out.println("Miau");
  }


}
