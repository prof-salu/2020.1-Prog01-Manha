
public class Livro {
	String titulo;
	double valor;
	int edicao;
	String isbn;
	Autor autor;
	
	//void --> funcao nao possui retorno
	
	//M�todo sem retorno e sem par�metro
	void exibeInformacao() {
		System.out.println("T�tulo: " + titulo);
		System.out.println("Pre�o: R$ " + valor);
		System.out.println("Edi��o: " + edicao);
		System.out.println("ISBN: " + isbn);
		autor.exibeInformacao();
	}
	
	//M�todo sem retorno e com par�metro
	void aplicarDesconto(double desconto) {
		System.out.println("Valor atual: " + valor);
		valor = valor - (valor * desconto);
		System.out.println("Valor alterado: " + valor);
	}
	
	boolean temAutor() {
		return autor == null;
	}

	
}
