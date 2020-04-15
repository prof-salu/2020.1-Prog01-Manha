
public class TestaConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ClienteEspecial ce = new ClienteEspecial();
		
		cc.depositar(1000);
		ce.depositar(1000);
		
		cc.sacar(500);
		ce.sacar(500);
		
		System.out.println(cc.getSaldo());
		System.out.println(ce.getSaldo());

	}

}
