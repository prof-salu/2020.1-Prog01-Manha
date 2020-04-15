
public class TesteEquals {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		System.out.println(a==b);
		
		Carro c1 = new Carro("XYZ", "gasolina", "1", 5, "ABC123", 4);
		Carro c2 = new Carro("XYZ", "gasolina", "1", 5, "ABC123", 4);
		Carro c3 = c1;
		Forma f = new Forma();
		
		
		System.out.println(c1 == c2);
		
		System.out.println(c1 == c3);
		
		System.out.println(c1.equals(c2));
		
		//System.out.println(c1.equals(f));
	}

}
