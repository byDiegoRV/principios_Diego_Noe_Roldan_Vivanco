

/**
 * Class Persona
 */
public class Persona {

  //
  // Fields
  //

  private String nombre;
  private int edad;
  
  //
  // Constructors
  //
  public Persona () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

 
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }


    public int getEdad() {
        return edad;
    }
}
