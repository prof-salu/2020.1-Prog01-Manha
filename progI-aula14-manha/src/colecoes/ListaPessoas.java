package colecoes;

import java.util.ArrayList;

public class ListaPessoas {

	public static void main(String[] args) {
		ArrayList listaPessoas = new ArrayList();
		
		Pessoa p1 = new Pessoa("pedro");
		Pessoa p2 = new Pessoa("augusto");
		Pessoa p3 = new Pessoa("clara");
		
		listaPessoas.add(p1);
		listaPessoas.add(p2);
		listaPessoas.add(p3);
				
		for(int i = 0; i < listaPessoas.size(); i++) {
			Pessoa pessoa = (Pessoa) listaPessoas.get(i);
			System.out.println(pessoa.getNome());
		}
		
		//System.out.println(listaPessoas1.get(1).getNome());
		Pessoa pessoa = (Pessoa) listaPessoas.get(1);
		System.out.println(pessoa.getNome());
	}
}
