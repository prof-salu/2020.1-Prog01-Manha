package login;

public class Usuario {
	/*
	 * - privado (private) + publico (public) # protegido (protected)
	 * 
	 */

	private String id;
	private String nome;
	private String login;
	private String senha;
	private String email;
	private String fone;
	private boolean bloqueado = false;
	private int tentativasAcesso = 0;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public boolean isBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	public int getTentativasAcesso() {
		return tentativasAcesso;
	}
	
	public void falhaLogin() {
		tentativasAcesso++;
		
		bloquearUsuario();
	}
	
	private void bloquearUsuario() {
		if(tentativasAcesso  == 3) {
			this.bloqueado = true;
		}
	}
}