package lista04;

public class Loja {

	public static void main(String[] args) {
		Livro l1 = new Livro("1234", "Aprendendo Java", 45.50, "Max");
		Livro l2 = new Livro("5678", "Aprendendo Banco de dados", 59.90, "Sofia");
		CD cd1 = new CD("9999", "Nirvana", 19.90, 12);
		DVD dvd1 = new DVD("7777", "Duro de matar", 9.90, 120);
		DVD dvd2 = new DVD("2323", "Titanic", 19.90, 220);
		
		Livro l3 = l1;
		Livro l4 = new Livro("1234", "Aprendendo Java", 45.50, "Max");
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(cd1);
		System.out.println(dvd1);
		System.out.println(dvd2);

		System.out.println();
		
		System.out.println("l1 é igual l2 ? ==> " + l1.equals(l2));
		System.out.println("l1 é igual l3 ? ==> " + l1.equals(l3));
		System.out.println("l1 é igual l4 ? ==> " + l1.equals(l4));
		System.out.println("dvd1 é igual dvd2 ? ==> " + dvd1.equals(dvd2));
	}

}
