
public class Main {


  public Main () { };
  

  public static void main(String[] args) {
    
   Estudiante es= new Estudiante("Diego Noe", 19, "masculino",
    24021106, 9.4, "Ingenieria de Software");
    
  es.mostrarDatos();
  es.datosDeAlumno();
System.err.println("");
Docente ws = new Docente("Axel Olmedo", 60, "Masculino", 1, 100000.0, "Jefatura");
ws.mostrarDatos();
ws.datosDocente();
  }


}