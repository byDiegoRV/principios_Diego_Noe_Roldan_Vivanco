

/**
 * Class Television
 */
public class Television {

  //
  // Fields
  //

  public String forma;
    private String tamaño;
    public String calidadDeVideo;
    protected String marca;

    
    public Television(String forma1, String tamaño1, String calidadDeVideo1, String marca1) {
        this.forma = forma1;
        this.tamaño = tamaño1;
        this.calidadDeVideo = calidadDeVideo1;
        this.marca = marca1;

        System.out.println("Construyo una television");
    }

    
    public void apagada() {
        System.out.println("Television apagada");
    }

    
    public void prendida() {
        System.out.println("Television encendida");
    }

    
    public void setForma(String forma1) {
        this.forma = forma1;
    }

  
    public String getForma() {
        return forma;
    }
}