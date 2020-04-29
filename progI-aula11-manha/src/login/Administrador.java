package login;

public class Administrador extends Usuario implements IUsuario{
	private String matricula;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public boolean validarLogin(String login, String senha) {
		if(isBloqueado() == false && (getLogin().equals(login) && getSenha().equals(senha))) {
			return true;
		}else {
			falhaLogin();
			return false;
		}
	}
}
