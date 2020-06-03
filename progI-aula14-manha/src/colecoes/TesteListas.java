package colecoes;

import java.util.ArrayList;

public class TesteListas {
	//CTRL + SHIFT + O (Corrigir imports)
	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		
		lista.add("ana");
		lista.add("bia");
		lista.add("mara");
		lista.add("pedro");
		lista.add("marcus");
		lista.add("salu");
		
		//System.out.println(lista.get(0));
		System.out.println(lista.get(1));
//		System.out.println(lista.get(2));
//		System.out.println(lista.get(3));
//		System.out.println(lista.get(4));
//		System.out.println(lista.get(5));
		System.out.println();
		System.out.println();
		lista.remove(1);		
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println();
		System.out.println(lista.get(1));
		System.out.println(lista.size());
		
		lista.clear();
		
		System.out.println(lista.size());
	}
}
