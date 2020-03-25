
public class Conta {
	//modificadores de  acesso
		//default --> Apenas classes do mesmo pacote tem acessso aos membros
		//public  --> Todas as classes tem acesso ao membros de uma classe
		//private --> Apenas a propria classe tem acesso aos seus membros
		//protected --> Apenas classes filhas ou do mesmo pacote tem acessso aos membros

	private int numero;
	private String titular;
	private double saldo;
	private double limite;
	private static int totalDecontas = 0;
		
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0;
		this.limite = 500;
		totalDecontas = totalDecontas +  1;
	}
	
	//Construtor vazio ()
	public Conta() {
		totalDecontas = totalDecontas +  1;
	}
	
	//get e set	
	//Encapsulamento
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public static int getTotalDeContas() {
		return Conta.totalDecontas;
	}
	
	//Encapsulmanento
	public boolean sacar(double valor) {
		double taxa = 0.10;
		if(valor <= (this.saldo + this.limite) && valor > 0) {
			this.saldo = this.saldo - valor - taxa;
			return true;
		}else{
			System.out.println("Valor inválido");
			return false;
		}
	}
	
	public boolean depositar(double valor) {
		if(valor > 0) {
			this.saldo = this.saldo + valor;
			return true;
		}else {
			System.out.println("Valor inválido");
			return false;			
		}
	}
	
	public boolean transferir(double valor, Conta destinatario) {
		if(this.sacar(valor) == true) {
			destinatario.depositar(valor);
			return true;
		}else{
			System.out.println("Saldo insuficiente");
			return false;
		}
	}
}