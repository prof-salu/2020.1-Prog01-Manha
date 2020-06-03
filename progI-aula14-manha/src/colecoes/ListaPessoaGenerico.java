package colecoes;

import java.util.ArrayList;

public class ListaPessoaGenerico {

	public static void main(String[] args) {
		ArrayList<Pessoa> listaPessoas = new ArrayList();
		
		Pessoa p1 = new Pessoa("pedro");
		Pessoa p2 = new Pessoa("augusto");
		Pessoa p3 = new Pessoa("clara");

		listaPessoas.add(p1);
		listaPessoas.add(p2);
		listaPessoas.add(p3);

		for (int i = 0; i < listaPessoas.size(); i++) {
			System.out.println(listaPessoas.get(i).getNome());
		}
	}
}