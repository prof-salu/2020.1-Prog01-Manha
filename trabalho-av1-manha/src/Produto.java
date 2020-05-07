
public abstract class Produto {
	private String descricao;
	private double preco;

	public Produto() {

	}

	public Produto(String descricao, double preco) {
		super();
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
