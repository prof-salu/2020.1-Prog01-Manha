package exercicios;

public class Lista06_1 {

	public static void main(String[] args) {
		int[] vetor = new int[] { 2, 4, 6, 8, 10, 12 };
		for (int i = 0; i <= 12; i++) {
			try {
				System.out.println(vetor[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}

	}

}
