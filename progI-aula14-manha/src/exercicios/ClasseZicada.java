package exercicios;

public class ClasseZicada {

	public static void main(String[] args) {
		metodo01();
		metodo02();
		try {
			metodo03();
		} catch (IllegalArgumentException e) {
			System.out.println("Argumento ilegal!");
		}
	}

	public static void metodo01() {
		try {
			int numA = 5;
			int numB = 0;
			System.out.println(numA / numB);
		} catch (ArithmeticException e) {
			System.out.println("Divisao por zero");
		}
	}

	public static void metodo02() {
		Object objeto = null;
		try {
			System.out.println(objeto.toString());
		} catch (NullPointerException e) {
			System.out.println("Objeto nulo!");
		}
	}

	public static void metodo03() {
		throw new IllegalArgumentException("Algo esta errado.");
	}
}
