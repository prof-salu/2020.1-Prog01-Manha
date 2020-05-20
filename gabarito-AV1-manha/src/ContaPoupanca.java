
public class ContaPoupanca extends Conta implements Rendimento {

	public ContaPoupanca(Titular titular, int numero, int agencia) {
		super(titular, numero, agencia);
	}

	@Override
	public void atualizar(double taxaRendimento) {
		this.saldo += this.saldo * taxaRendimento;
		//this.saldo = (this.saldo) + this.saldo * taxaRendimento;
	}

	@Override
	public boolean sacar(double valor) {
		if(valor > 0 && valor <= getSaldo()) {
			saldo -= valor;
			return true;
		}else {
			return false;
		}		
	}

	@Override
	public boolean depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
			return true;
		}else {
			return false;
		}		
	}
}
