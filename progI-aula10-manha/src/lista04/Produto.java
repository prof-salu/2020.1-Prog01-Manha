package lista04;

public class Produto {
	private String codigoDeBarras;
	private String nome;
	private double preco;
	
	public Produto(String codigoDeBarras, String nome, double preco) {
		this.codigoDeBarras = codigoDeBarras;
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getCodigoDeBarras() {
		return this.codigoDeBarras;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		if(!(obj instanceof Produto)) {
			return false;
		}
		
		Produto outro = (Produto) obj;
		
		if(this.codigoDeBarras == outro.getCodigoDeBarras()) {
			return true;
		}else {
			return false;
		}		
	}
}
