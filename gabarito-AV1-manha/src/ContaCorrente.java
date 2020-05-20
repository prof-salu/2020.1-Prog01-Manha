
public class ContaCorrente extends Conta {

	private double limite;
	private double taxaOperacao;

	public ContaCorrente(Titular titular, int numero, int agencia) {
		super(titular, numero, agencia);
		setLimite(1000);
		setTaxaOperacao(0.50);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getTaxaOperacao() {
		return taxaOperacao;
	}

	public void setTaxaOperacao(double taxaOperacao) {
		this.taxaOperacao = taxaOperacao;
	}

	public double getSaldoComLimite() {
		return getSaldo() + getLimite();
	}

	@Override
	public boolean sacar(double valor) {
		if (valor > 0 && valor <= getSaldoComLimite()) {
			saldo -= (valor + getTaxaOperacao());
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean depositar(double valor) {
		if (valor > 0) {
			saldo += (valor - getTaxaOperacao());
			return true;
		} else {
			return false;
		}
	}
}