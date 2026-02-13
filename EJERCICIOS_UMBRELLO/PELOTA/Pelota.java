

/**
 * Class Pelota
 */
public class Pelota {

  //
  // Fields
  //

  public String forma;
  public String tipo;
  protected String material;
  private String color;
  
  //
  // Constructors
  //
  public Pelota(String forma1, String color1, String material1, String tipo1) {
        this.forma = forma1;
        this.color = color1;
        this.material = material1;
        this.tipo = tipo1;

        System.out.println("Construyo una pelota");
    }

 
    public void botar() {
        System.out.println("La pelota esta botando");
    }


    public void desinflar() {
        System.out.println("Pelota ya se desinflo");
    }

    
    public void setForma(String forma1) {
        this.forma = forma1;
    }

    public String getForma() {
        return forma;
    }
}
