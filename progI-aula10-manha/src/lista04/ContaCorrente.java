package lista04;

public class ContaCorrente {
	protected double saldo;
	
	public ContaCorrente() {
		this.saldo = 0;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void sacar(double valor) {
		if(valor > 0 && valor <= saldo) {
			double taxaOperacao = valor * 0.005;
			this.saldo -= (valor + taxaOperacao);
		}else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
		}else {
			System.out.println("Valor inválido...");
		}
	}
}
