

/**
 * Class Avion
 */
public class Avion {

  //
  // Fields
  //

  public String aerolinea;
  public String capacidad;
  protected String velocidad;
  private String cantidad;
   private String cantidadDeMotores;
    private String modelo;

  public Avion(String aerolinea1, String cantidadDeMotores1, String velocidad1, String capacidad1) {
        this.aerolinea = aerolinea1;
        this.cantidadDeMotores = cantidadDeMotores1;
        this.velocidad = velocidad1;
        this.capacidad = capacidad1;

        System.out.println("Construyo un avion");
    }

    
    public void acelerar() {
        System.out.println("El avion acelero");
    }


    public void elevarse() {
        System.out.println("El avion se elevo");
    }


    public void setModelo(String modelo1) {
        this.modelo = modelo1;
    }

  
    public String getModelo() {
        return modelo;
    }
}