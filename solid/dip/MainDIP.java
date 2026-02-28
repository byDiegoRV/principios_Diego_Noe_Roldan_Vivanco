package dip;

public class MainDIP {
    public static void main(String[] args) {
        Motor motor = new MotorElectrico();
        Coche coche = new Coche(motor);

   Motor mo= new MotorGasolina();
   Coche co = new Coche(mo);
   co.arrancar();
        coche.arrancar();
    }
}