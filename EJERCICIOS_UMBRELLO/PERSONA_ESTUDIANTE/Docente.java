
public class Docente extends Persona {

  
  public int idTrabajador;
  public double salario;
  public String departamentos;
  
  
  public Docente () { }
  public Docente(String nombre, int edad, String sexo,int idTrabajador, double salario, String departamentos){
    super(nombre, edad,sexo);
    this.idTrabajador= idTrabajador;
    this. salario= salario;
    this.departamentos= departamentos;
  }
  
 

  public void datosDocente()
  {
    System.out.println("El id del trabajador es "+ idTrabajador);
    System.out.println("El salario del trabajador es "+salario);
    System.out.println("El departamento es " +departamentos);
  }


}
