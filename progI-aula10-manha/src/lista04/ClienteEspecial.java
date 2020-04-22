package lista04;

public class ClienteEspecial extends ContaCorrente{
	
	public ClienteEspecial() {
		this.saldo = 0;
	}
	
	@Override
	public void sacar(double valor) {
		if(valor > 0 && valor <= getSaldo()) {
			double taxaOperacao = valor * 0.001;
			this.saldo -= (valor + taxaOperacao);
		}else {
			System.out.println("Saldo insuficiente!");
		}
	}
}