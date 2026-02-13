

/**
 * Class CuentaBancaria
 */
public class CuentaBancaria {

  //
  // Fields
  //

  private double saldo;
  
  //
  // Constructors
  //
  public CuentaBancaria (double saldoInicial) { 
    this.saldo = saldoInicial;
  };
  
 
  public double getSaldo() {
    return saldo;
  }

  
  public void depositar(double monto){
System.out.println("Depositando: " + monto);
saldo += monto;
  }
  


  
  public void retirar(double monto){
System.out.println("Retirando: " + monto);

if(monto <=saldo){
saldo -= monto;
System.out.println("Retiro: "+ monto);
System.out.println("Saldo actual: " + saldo);
  }else{  
System.out.println("Fondo insuficiente ... ");

  }
  
  }

}
