import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {
		// Escreva um programa que leia um n�mero inteiro (vari�vel CODIGO). 
		// Verificar se o c�digo � igual a 1, igual a 2 ou igual a 3. 
		// Caso n�o seja, apresentar a mensagem �C�digo inv�lido�. 
		// Ao ser verificado o c�digo e constatado que � um valor v�lido, 
		// o programa deve verificar cada c�digo em separado para determinar seu valor 
		// por extenso, ou seja, apresentar a mensagem �um�, �dois� ou �tr�s�.
		
		int codigo;
		Scanner teclado = new Scanner(System.in);
				
		do {			
			System.out.println("Informe o c�digo: ");
			codigo = teclado.nextInt();
			
			switch(codigo) {
			case 1:
				System.out.println("UM");
				break;
			case 2:
				System.out.println("DOIS");
				break;
			case 3:
				System.out.println("TR�S");
				break;
			case -100:
				System.out.println("Encerrando o programa");
				break;
			default:
				System.out.println("CODIGO INV�LIDO");
				break;
			}
		}while(codigo != -100);
		
		teclado.close();
		
	}

}
