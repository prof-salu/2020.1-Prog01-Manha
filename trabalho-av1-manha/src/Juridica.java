
public class Juridica extends Cliente {
	private String cnpj;

	public Juridica() {

	}

	public Juridica(String nome, String senha, String email, String cnpj) {
		super(nome, senha, email);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
