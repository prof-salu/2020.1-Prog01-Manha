package lista04;

public class DVD extends Produto{
	
	private int duracao;
	
	public DVD(String codigoDeBarras, String nome, double preco, int duracao){
		super(codigoDeBarras, nome, preco);
		this.duracao = duracao;
	}
	
	public int getDuracao() {
		return this.duracao;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		return "DVD[codigo de barras: " + getCodigoDeBarras() + 
					", nome: " + getNome() + 
					", pre�o: " + getPreco() + 
					", dura��o: " + this.duracao + "]";
	}
}
