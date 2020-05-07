
public class Gerente extends Funcionario implements Autentica {

	private String senha;

	public Gerente() {

	}

	public Gerente(String nome, String email, String matricula, String senha) {
		super(nome, email, matricula);
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public boolean validarLogin(String email, String senha) {
		return getEmail().equals(email) && this.senha.equals(senha);
	}

}
