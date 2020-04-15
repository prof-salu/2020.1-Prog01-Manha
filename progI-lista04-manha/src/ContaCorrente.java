
public class ContaCorrente {
	
	protected double saldo;
	
	public ContaCorrente() {
		this.saldo = 0;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void sacar(double valor) {
		if(valor <= saldo && valor > 0) {
			double taxa = valor * 0.005;
			saldo = (saldo - valor) - taxa;
		}else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			saldo = saldo + valor;
		}
	}
}
