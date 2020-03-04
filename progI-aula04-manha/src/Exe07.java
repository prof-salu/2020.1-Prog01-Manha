import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {
		// Escreva um programa que leia um número inteiro (variável CODIGO). 
		// Verificar se o código é igual a 1, igual a 2 ou igual a 3. 
		// Caso não seja, apresentar a mensagem “Código inválido”. 
		// Ao ser verificado o código e constatado que é um valor válido, 
		// o programa deve verificar cada código em separado para determinar seu valor 
		// por extenso, ou seja, apresentar a mensagem “um”, ”dois” ou “três”.
		
		int codigo;
		Scanner teclado = new Scanner(System.in);
				
		do {			
			System.out.println("Informe o código: ");
			codigo = teclado.nextInt();
			
			switch(codigo) {
			case 1:
				System.out.println("UM");
				break;
			case 2:
				System.out.println("DOIS");
				break;
			case 3:
				System.out.println("TRÊS");
				break;
			case -100:
				System.out.println("Encerrando o programa");
				break;
			default:
				System.out.println("CODIGO INVÁLIDO");
				break;
			}
		}while(codigo != -100);
		
		teclado.close();
		
	}

}
