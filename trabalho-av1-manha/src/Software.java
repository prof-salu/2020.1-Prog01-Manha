
public class Software extends Produto {
	private String versao;

	public Software() {

	}

	public Software(String descricao, double preco, String versao) {
		super(descricao, preco);
		this.versao = versao;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

}
