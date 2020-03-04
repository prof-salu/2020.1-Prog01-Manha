
public class Exe05 {

	public static void main(String[] args) {
		// Escreva um programa que imprima na tela a soma dos números ímpares 
		// entre 0 e 30 e a multiplicação dos números pares entre 0 e 30.
		
		// 1 + 3 + 5 ... + 30 + ???
		// 2 * 4 * 6 ... * 30 = ???
		
		int somaImpar = 0;
		long prodPar = 1;
		
		for(int i = 1; i <= 30; i++) {
			if(i % 2 == 0) {
				prodPar = prodPar * i;
			}else {
				somaImpar = somaImpar + i;
			}
		}
		
		System.out.println("Produto dos valores pares: " + prodPar);
		System.out.println("Soma dos valores impares: " + somaImpar);

	}

}
