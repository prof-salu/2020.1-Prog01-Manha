package br.com.profsalu.visao;

import javax.swing.JOptionPane;

import br.com.profsalu.modelo.Vendedor;

public class VisaoVendedor {
	public VisaoVendedor() {
		JOptionPane.showMessageDialog(null, "***Cadastro de vendedores***");
	}
	
	public String lerNome() {
		String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
		return nome;
	}
	
	public double lerSalario() {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salario: "));
		return salario;
	}
	
	public void exibeVendedor(Vendedor vendedor) {
		JOptionPane.showMessageDialog(null, "Nome: " + vendedor.getNome() + 
											"\nSalario: R$" + vendedor.getSalario());
	}
}
