package br.com.profsalu.testes;

import br.com.profsalu.controle.ControleVendedor;
import br.com.profsalu.modelo.Vendedor;

public class TesteVendedor {

	public static void main(String[] args) {
//		VisaoVendedor visao = new VisaoVendedor();
//		Vendedor v = new Vendedor();
//		v.setNome("Mario");
//		v.setSalario(3500);
//		//visao.lerNome();
//		
//		//visao.lerSalario();
//		
//		visao.exibeVendedor(v);
		
		ControleVendedor controle = new ControleVendedor();
		Vendedor v = controle.getVendedor();
	}

}
