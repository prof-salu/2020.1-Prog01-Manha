import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		// Faça um programa que:
		// - Leia a cotação do dólar
		// - Leia um valor em dólares
		// - Converta esse valor para Real
		// - Mostre o resultado
		
		Scanner teclado = new Scanner(System.in);
		double cotacaoDolar;
		double valorDolar;
		double valorReal;
		
		//Valores com casa decimal via Scanner devem ser passados com virgula ',' ao inves do ponto '.'
		System.out.println("Informe a cotação do dia: ");
		cotacaoDolar = teclado.nextDouble();
		
		System.out.println("Informe o valor a ser convertido:");
		valorDolar = teclado.nextDouble();
		
		teclado.close();
		
		valorReal = valorDolar * cotacaoDolar;
		System.out.printf("Valor convertido em Reais: R$%.2f", valorReal);

	}

}
