
public class ContaEspecial extends ContaCorrente implements Rendimento{

	public ContaEspecial(Titular titular, int numero, int agencia) {
		super(titular, numero, agencia);
		setLimite(5000);
		setTaxaOperacao(0.25);
	}

	@Override
	public void atualizar(double taxaRendimento) {
		this.saldo += this.saldo * taxaRendimento;		
	}
}
