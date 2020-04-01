
public class Produto {
	private String codigo;
	private String nome;
	private String marca;
	private double preco;
	private int quantidade;
	private static int totalProdutos = 0;
	
	public Produto() {
		Produto.totalProdutos++;
	}
	
	public Produto(String codigo, String nome, String marca, double preco, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.marca= marca;
		this.preco = preco;
		this.quantidade  = quantidade;
		Produto.totalProdutos++;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public static int getTotalProdutos() {
		return totalProdutos;
	}
}
