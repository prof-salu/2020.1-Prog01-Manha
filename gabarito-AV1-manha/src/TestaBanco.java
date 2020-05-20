
public class TestaBanco {

	public static void main(String[] args) {
		Titular t1 = new Titular("Zenon", "zenon@email.com", "Rua Z, 33");

		ContaPoupanca cp = new ContaPoupanca(t1, 1234, 5678);
		ContaCorrente cc = new ContaCorrente(t1, 7777, 5678);
		ContaEspecial ce = new ContaEspecial(t1, 9876, 5678);
		
		ContaPoupanca doe = new ContaPoupanca(t1, 1234, 5678);

		System.out.println("Saldo poupança: " + cp.getSaldo());
		System.out.println("Saldo corrente: " + cc.getSaldo());
		System.out.println("Saldo corrente + limite: " + cc.getSaldoComLimite());
		System.out.println("Saldo Especial: " + ce.getSaldo());
		System.out.println("Saldo Especial + limite: " + ce.getSaldoComLimite());
		System.out.println();
		
		cp.depositar(1000);
		cc.depositar(1000);
		ce.depositar(1000);
		
		System.out.println("Saldo poupança: " + cp.getSaldo());
		System.out.println("Saldo corrente: " + cc.getSaldo());
		System.out.println("Saldo corrente + limite: " + cc.getSaldoComLimite());
		System.out.println("Saldo Especial: " + ce.getSaldo());
		System.out.println("Saldo Especial + limite: " + ce.getSaldoComLimite());
		System.out.println();
		
		cp.sacar(500);
		cc.sacar(500);
		ce.sacar(500);
		
		System.out.println("Saldo poupança: " + cp.getSaldo());
		System.out.println("Saldo corrente: " + cc.getSaldo());
		System.out.println("Saldo corrente + limite: " + cc.getSaldoComLimite());
		System.out.println("Saldo Especial: " + ce.getSaldo());
		System.out.println("Saldo Especial + limite: " + ce.getSaldoComLimite());
		System.out.println();
		
		cp.transferir(200, doe);
		cc.transferir(200, doe);
		ce.transferir(200, doe);
		
		System.out.println("Saldo poupança: " + cp.getSaldo());
		System.out.println("Saldo corrente: " + cc.getSaldo());
		System.out.println("Saldo corrente + limite: " + cc.getSaldoComLimite());
		System.out.println("Saldo Especial: " + ce.getSaldo());
		System.out.println("Saldo Especial + limite: " + ce.getSaldoComLimite());
		System.out.println("Saldo doação: " + doe.getSaldo());
		System.out.println();
		
		cp.atualizar(0.01);
		ce.atualizar(0.025);
		
		System.out.println("Saldo poupança: " + cp.getSaldo());
		System.out.println("Saldo corrente: " + cc.getSaldo());
		System.out.println("Saldo corrente + limite: " + cc.getSaldoComLimite());
		System.out.println("Saldo Especial: " + ce.getSaldo());
		System.out.println("Saldo Especial + limite: " + ce.getSaldoComLimite());
		System.out.println("Saldo doação: " + doe.getSaldo());
		System.out.println();
	}
}
