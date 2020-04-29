package login;

public class Cliente extends Usuario implements IUsuario{
	private String ranking;

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
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
