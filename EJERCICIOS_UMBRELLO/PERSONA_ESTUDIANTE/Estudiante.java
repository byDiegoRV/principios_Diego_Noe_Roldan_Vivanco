
public class Estudiante extends Persona {

 

  public int matricula;
  public double promedio;
  public String licenciatura;
  
 
  public Estudiante () { }
  public Estudiante( String nombre, int edad, String sexo,int matricula, double promedio, String licenciatura){
    super(nombre, edad, sexo);
    this.matricula= matricula;
    this. promedio= promedio;
    this.licenciatura= licenciatura;
  }
  


  public void datosDeAlumno()
  {
    System.out.println("La matricula es "+ matricula);
    System.out.println("El promedio es " + promedio);
    System.out.println("La licenciatura es "+ licenciatura);
  }


}