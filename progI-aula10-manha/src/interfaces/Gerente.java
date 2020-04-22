package interfaces;

public class Gerente extends Funcionario implements Autenticavel{
	private String login;
	private String senha;
	
	@Override
	public boolean validarLogin(String login, String senha) {
		return this.login == login && this.senha == senha;
	}
}
