
public class Exe02 {

	public static void main(String[] args) {
		// Fa�a um programa em Java, que calcule e mostre o valor do aumento e o 
		// novo sal�rio de um funcion�rio, sabendo-se que o sal�rio do funcion�rio � de 
		// R$ 2500,00 e o percentual de aumento foi de 10%.
		
		double salario = 2500;
		double percentual = 0.1;
		
		//System.out.println("Salario atual: R$" + salario);
		//System.out.println("Valor do aumento: R$" + (salario * percentual));
		//System.out.println("Salario com aumento: R$" + (salario + (salario * percentual)));
		
		System.out.printf("Salario atual: R$ %.2f\n", salario);
		System.out.printf("Valor do aumento: R$ %.2f\n" , (salario * percentual));
		System.out.printf("Salario com aumento: R$ %.2f\n", (salario + (salario * percentual)));

	}

}
