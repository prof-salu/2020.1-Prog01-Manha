
public class CadastrarLivros {
	public static void main(String[] args) {
		//Instanciação		
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		Livro livro3 = livro1;
		Livro livro4 = new Livro();
		
		livro1.titulo = "Aprendendo Java";
		livro1.isbn = "1234ABC";
		livro1.valor = 45.50;
		livro1.edicao = 1;
		livro1.autor = "Carlos";
		
		livro2.titulo = "Aprendendo Banco de dados";
		livro2.isbn = "4789ABC";
		livro2.valor = 49.90;
		livro2.edicao = 3;
		livro2.autor = "Ana";
		
		//Imprime a posicao de memoria ocupada por livro1
		System.out.println(livro1);
		
		System.out.println(livro1.titulo);
		System.out.println(livro1.isbn);
		System.out.println(livro1.valor);
		System.out.println(livro1.edicao);
		System.out.println(livro1.autor);
		
		System.out.println();
		
		System.out.println(livro2);
		System.out.println(livro2.titulo);
		System.out.println(livro2.isbn);
		System.out.println(livro2.valor);
		System.out.println(livro2.edicao);
		System.out.println(livro2.autor);
		
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
		System.out.println(livro3.titulo);
		System.out.println(livro3.isbn);
		System.out.println(livro3.valor);
		System.out.println(livro3.edicao);
		System.out.println(livro3.autor);
		
		livro3.valor = 77;
		
		System.out.println();
		
		System.out.println(livro1.valor);
		System.out.println(livro3.valor);
		
		livro4.titulo = "Aprendendo Banco de dados";
		livro4.isbn = "4789ABC";
		livro4.valor = 49.90;
		livro4.edicao = 3;
		livro4.autor = "Ana";
		
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
	}
}
