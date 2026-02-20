

public class Main {

  
  public static void main(String []args){
    
       Animal pe = new Perro();
         pe.mover();
       
         ((Perro)pe).hacerSonido();

         Animal ga = new Gato();
         ga.mover();
         ((Gato)ga).hacerSonido();

         

  }


}
