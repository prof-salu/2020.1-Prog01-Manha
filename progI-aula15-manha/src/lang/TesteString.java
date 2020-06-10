package lang;

public class TesteString {

	public static void main(String[] args) {
		String msg1 = "Ola mundo!";
		String msg2 = new String("Ola mundo!");
		
		String vazia = "";
		
		int i = 10;
		float f = 3.14f;
		Integer i2 = new Integer(50);
		
		vazia = "i=" + i + ", f=" + f + ", i2=" + i2;
		
		System.out.println(vazia);
		
		String s = "Java";
		
		System.out.println("Tamanho da string: " + s.length());
		System.out.println("Caractere armazenado na posicao ZERO: " + s.charAt(0));
		System.out.println("Posicao do caractere v: " + s.indexOf('v'));
		System.out.println("Substitui caracteres: " + s.replace("J", "L"));
		System.out.println(s);
		s.toUpperCase();
		System.out.println(s);
		System.out.println(s.substring(1,3));
		
		String nome = "Salustiano";
		System.out.println(nome.substring(0,4));
		
		String cpf = "123.456.789-00";
		
		//subString == substr
		System.out.println(cpf.substring(0,3) + cpf.substring(4,7) + 
				cpf.substring(8,11) + cpf.substring(12,14));
		
		//datas ==> dd/mm/aaaa

	}
}
