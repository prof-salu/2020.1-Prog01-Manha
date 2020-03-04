import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		// Desenvolva um programa em java que leia o nome e a idade de 3 pessoas e 
		// mostre o nome da pessoa mais velha e o nome da pessoa mais nova.
		
		int idade, idadeNovo = 0, idadeVelho = 0;
		String nome, pessoaMaisNova = null, pessoaMaisVelha = null;
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Informe o seu nome: ");
			nome = teclado.next();
			
			System.out.println("Informe a sua idade: ");
			idade = teclado.nextInt();
			
			if(i == 0) {
				pessoaMaisVelha = nome;
				pessoaMaisNova = nome;
				idadeNovo = idade;
				idadeVelho = idade;
			}
			
			if(idade > idadeVelho) {
				pessoaMaisVelha = nome;
				idadeVelho = idade;
			}
			
			if(idade < idadeNovo) {
				pessoaMaisNova = nome;
				idadeNovo = idade;
			}
		}
		
		teclado.close();
		
		System.out.println("Pessoa mais nova: " + pessoaMaisNova);
		System.out.println("Pessoa mais velha: " + pessoaMaisVelha);
		
		
	}

}
