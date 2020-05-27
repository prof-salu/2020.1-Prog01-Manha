package br.com.profsalu.controle;

import br.com.profsalu.modelo.Vendedor;
import br.com.profsalu.visao.VisaoVendedor;

public class ControleVendedor {
	private Vendedor vendedor;
	private VisaoVendedor visao;

	public ControleVendedor() {
		visao = new VisaoVendedor();
		vendedor = new Vendedor();
	}
	
	private String getNome() {
		String nome = visao.lerNome();
		return nome;
	}
	
	private double getSalario() {
		double salario = visao.lerSalario();
		return salario;
	}
	
	public Vendedor getVendedor() {
		vendedor.setNome(getNome());
		vendedor.setSalario(getSalario());
		visao.exibeVendedor(vendedor);
		return vendedor;
	}
}
