import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		// Crie uma classe java que contenha um m�todo que receba um n�mero inteiro e imprima, 
		// em ordem decrescente, o valor do n�mero at� 0.
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe um valor: ");
		//numero = entrada.nextInt();
		numero = Integer.parseInt(entrada.next());
		
		entrada.close();
		
		for(int i = numero; i >= 0; i--) {
			if(i == 0) {
				System.out.print(i);
				break;
			}
			System.out.print(i + " > ");
		}
	}

}
