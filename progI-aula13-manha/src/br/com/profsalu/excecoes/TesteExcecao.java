package br.com.profsalu.excecoes;

public class TesteExcecao {
	public static void main(String[] args) {
		System.out.println("inicio do main");
		try {
			metodo1();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Tentou acessar uma posicao invalida do vetor");
		}finally {
			System.out.println("Fim do try-catch");
		}
		System.out.println("fim do main");
	}

	public static void metodo1() {
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}

	public static void metodo2() {
		System.out.println("inicio do metodo2");
		int[] vet = { 1, 2, 3, 4, 5 };// 0 posInicial - 4 posFinal

		for (int i = 0; i <= 4; i++)
			System.out.println(vet[i]);
		System.out.println("fim do metodo2");
	}
}