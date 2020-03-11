
public class Livro {
	String titulo;
	double valor;
	int edicao;
	String isbn;
	Autor autor;
	
	//void --> funcao nao possui retorno
	
	//Método sem retorno e sem parâmetro
	void exibeInformacao() {
		System.out.println("Título: " + titulo);
		System.out.println("Preço: R$ " + valor);
		System.out.println("Edição: " + edicao);
		System.out.println("ISBN: " + isbn);
		autor.exibeInformacao();
	}
	
	//Método sem retorno e com parâmetro
	void aplicarDesconto(double desconto) {
		System.out.println("Valor atual: " + valor);
		valor = valor - (valor * desconto);
		System.out.println("Valor alterado: " + valor);
	}
	
	boolean temAutor() {
		return autor == null;
	}

	
}
