
public abstract class Cliente implements Autentica{
	private String nome;
	private String senha;
	private String email;

	public Cliente() {

	}

	public Cliente(String nome, String senha, String email) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean validarLogin(String email, String senha) {
		return this.email.equals(email) &&
				this.senha.equals(senha);
	}

}
