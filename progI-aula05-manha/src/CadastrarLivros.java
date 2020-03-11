
public class CadastrarLivros {
	public static void main(String[] args) {
		//Instanciação		
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		Livro livro3 = livro1;
		Livro livro4 = new Livro();
		
		Autor autor1 = new Autor();
		autor1.nome = "Carlos";
		autor1.cpf = "12345678910";
		autor1.email = "carlos@email.com";
		
		livro1.titulo = "Aprendendo Java";
		livro1.isbn = "1234ABC";
		livro1.valor = 45.50;
		livro1.edicao = 1;
		livro1.autor = autor1;
		
		livro2.titulo = "Aprendendo Banco de dados";
		livro2.isbn = "4789ABC";
		livro2.valor = 49.90;
		livro2.edicao = 3;
		livro2.autor = autor1;
		
		//Imprime a posicao de memoria ocupada por livro1
		System.out.println(livro1);
		
		livro1.exibeInformacao();
		
		System.out.println();
		
		livro2.exibeInformacao();
		
		System.out.println();
		
		System.out.println(livro3);
		System.out.println(livro3.titulo);
		System.out.println(livro3.isbn);
		System.out.println(livro3.valor);
		System.out.println(livro3.edicao);
		System.out.println(livro3.autor);
		
		livro1.titulo = "Java Orientado a objetos";
		
		System.out.println();
		
		System.out.println(livro3);
		livro3.exibeInformacao();
		
		//livro3.valor = 77;
		
		System.out.println();
		
		System.out.println(livro1.valor);
		System.out.println(livro3.valor);
		
		livro4.titulo = "Aprendendo Banco de dados";
		livro4.isbn = "4789ABC";
		livro4.valor = 49.90;
		livro4.edicao = 3;
		
		
		if(livro2 == livro4) {
			System.out.println("Livros iguais");
		}else {
			System.out.println("Livros diferentes");
		}
		
		if(livro2.titulo == livro4.titulo) {
			System.out.println("Titulos iguais");
		}else {
			System.out.println("Titulos diferentes");
		}
		
		if(livro1 == livro3) {
			System.out.println("livros iguais");
		}else {
			System.out.println("livros diferentes");
		}
		
		//Desconto de 20%
		livro1.aplicarDesconto(0.2);
		
		//livro1.exibeInformacao();
		
		System.out.println(livro4.autor);
		
		boolean possuiAutor = livro4.temAutor();
		
		System.out.println(livro4.temAutor());
		System.out.println(livro1.temAutor());
	}
}