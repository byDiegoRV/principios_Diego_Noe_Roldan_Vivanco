




public class Persona {

 
  public String nombre;
  public int edad;
  public String sexo;
 
  public Persona () { }

  public Persona( String nombre, int edad, String sexo){
    this.nombre= nombre;
    this.edad= edad;
    this.sexo=sexo;

  }
  
  
 
  public void mostrarDatos()
  {
    System.out.println(" El nombre es "+nombre);
    System.out.println(" La edad es " +edad);
    System.out.println("El sexo es "+sexo);
  }


}