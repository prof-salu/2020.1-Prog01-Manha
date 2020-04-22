package lista04;

public class TestaContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ClienteEspecial ce = new ClienteEspecial();
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CE: " + ce.getSaldo());
		
		cc.depositar(1000);
		ce.depositar(1000);
		
		System.out.println();
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CE: " + ce.getSaldo());
		
		cc.sacar(500);
		ce.sacar(500);
		
		System.out.println();
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CE: " + ce.getSaldo());
	}

}
