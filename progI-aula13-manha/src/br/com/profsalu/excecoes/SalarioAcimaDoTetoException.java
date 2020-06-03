package br.com.profsalu.excecoes;

public class SalarioAcimaDoTetoException extends Exception{
	
	public SalarioAcimaDoTetoException() {
		super("Salario acima da media");
	}
}
