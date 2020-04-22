package lista04;

public class CD extends Produto{

	private int numeroFaixas;
	
	public CD(String codigoDeBarras, String nome, double preco, int numeroFaixas) {
		super(codigoDeBarras, nome, preco);
		this.numeroFaixas = numeroFaixas;
	}
	
	public int getNumeroFaixas() {
		return this.numeroFaixas;
	}
	
	public void setNumeroFaixas(int numeroFaixas) {
		this.numeroFaixas = numeroFaixas;
	}
	
	@Override
	public String toString() {
		return "CD[codigo de barras: " + getCodigoDeBarras() +
				 	", nome: " + getNome() + 
					", preço: " + getPreco() + 
					", faixas: " + this.numeroFaixas + "]";
	}
}
