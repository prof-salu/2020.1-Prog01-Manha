package br.com.profsalu.controle;

import javax.swing.JOptionPane;

import br.com.profsalu.excecoes.SalarioAcimaDoTetoException;
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

		try {
			if (nome.length() < 3) {
				throw new IllegalArgumentException("Nome muito curto!");
			}
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return getNome();
		}

		return nome;
	}

	private double getSalario() {
		double salario = visao.lerSalario();
		
		try {
			if(salario > 10000) {
				throw new SalarioAcimaDoTetoException();
			}
		}catch(SalarioAcimaDoTetoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return getSalario();
		}
		return salario;
	}

	public Vendedor getVendedor() {
		vendedor.setNome(getNome());
		vendedor.setSalario(getSalario());
		visao.exibeVendedor(vendedor);
		return vendedor;
	}
}
