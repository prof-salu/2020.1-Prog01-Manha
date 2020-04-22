package lista04;

public class Livro extends Produto{

	private String autor;
	
	public Livro(String codigoDeBarras, String nome, double preco, String autor) {
		super(codigoDeBarras, nome, preco);
		this.autor = autor;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return "Livro[codigo de barras: " + getCodigoDeBarras() + 
						", nome: " + getNome() + 
						", preço: " + getPreco() + 
						", autor: " + this.autor + "]";
	}
}
