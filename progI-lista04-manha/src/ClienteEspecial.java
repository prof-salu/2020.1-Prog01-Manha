
public class ClienteEspecial extends ContaCorrente{
	
	@Override
	public void sacar(double valor) {
		if(valor <= getSaldo() && valor > 0) {
			double taxa = valor * 0.001;
			saldo = (saldo - valor) - taxa;
		}
	}
}
