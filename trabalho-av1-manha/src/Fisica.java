
public class Fisica extends Cliente {
	private String cpf;

	public Fisica() {

	}

	public Fisica(String nome, String senha, String email, String cpf) {
		super(nome, senha, email);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
