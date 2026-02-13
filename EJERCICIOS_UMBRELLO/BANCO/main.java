

/**
 * Class main
 */
public class main {

  

  
  
 public static void main(String[] args) {

  CuentaBancaria  cuenta = new CuentaBancaria(1000.0);
  System.out.println("Saldo inicial: " + cuenta.getSaldo());
  
  cuenta.depositar(500.0);
  
  cuenta.retirar(1500.0);

  cuenta.retirar(100.0);
  
  }


}
