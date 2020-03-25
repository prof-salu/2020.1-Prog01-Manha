
public class TestaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta(1234, "Carlos");
		System.out.println("Total de contas: " + Conta.getTotalDeContas());
		
		//c1.titular = "Carlos";
		//c1.numero = 1234;
		//c1.saldo = 500;
		//c1.limite = 1000;
		
		//c1.setTitular("Carlos");
		//c1.setNumero(1234);
		
		//c1.setLimite(1000);
		//Saque
		//c1.saldo = c1.saldo - 200;
		//c1.saldo = c1.saldo - 2000;
		
//		System.out.println("Saldo atual: " + c1.getSaldo());
//		System.out.println("Saldo total: " + (c1.getSaldo()+ c1.getLimite()));
//		
//		System.out.println();
//		c1.sacar(100);
//
//		System.out.println("Saldo atual: " + c1.getSaldo());
//		System.out.println("Saldo total: " + (c1.getSaldo() + c1.getLimite()));
//		
//		System.out.println();
//		c1.sacar(2000);
//
//		System.out.println("Saldo atual: " + c1.getSaldo());
//		System.out.println("Saldo total: " + (c1.getSaldo() + c1.getLimite()));
//		
//		c1.depositar(1000);
//		System.out.println();
//		
//		System.out.println("Saldo atual: " + c1.getSaldo());
//		System.out.println("Saldo total: " + (c1.getSaldo() + c1.getLimite()));
//		
//		c1.depositar(-1000);
//		System.out.println();
//		
//		System.out.println("Saldo atual: " + c1.getSaldo());
//		System.out.println("Saldo total: " + (c1.getSaldo() + c1.getLimite()));
//		
//		c1.sacar(-1000);
//		System.out.println();
//		
//		System.out.println("Saldo atual: " + c1.getSaldo());
//		System.out.println("Saldo total: " + (c1.getSaldo() + c1.getLimite()));
		
		Conta c2 = new Conta(2345, "Ana");
		System.out.println("Total de contas: " + Conta.getTotalDeContas());
		Conta c3 = new Conta(777, "Miguel");
		System.out.println("Total de contas: " + Conta.getTotalDeContas());
		Conta c4 = new Conta();
		System.out.println("Total de contas: " + Conta.getTotalDeContas());
		c2.depositar(1000);
		System.out.println();		
		System.out.println("C2 Saldo atual: " + c2.getSaldo());
		System.out.println("C2 Saldo total: " + (c2.getSaldo() + c2.getLimite()));
		System.out.println("C3 Saldo atual: " + c3.getSaldo());
		System.out.println("C3 Saldo total: " + (c3.getSaldo() + c2.getLimite()));
		
		c2.transferir(500, c3);
		System.out.println();		
		System.out.println("C2 Saldo atual: " + c2.getSaldo());
		System.out.println("C2 Saldo total: " + (c2.getSaldo() + c2.getLimite()));
		System.out.println("C3 Saldo atual: " + c3.getSaldo());
		System.out.println("C3 Saldo total: " + (c3.getSaldo() + c2.getLimite()));
		

	}

}
