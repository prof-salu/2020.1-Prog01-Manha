package interfaces;

public class Administrador extends Funcionario implements Autenticavel, Imprimivel{
	private String login;
	private String senha;
	
	@Override
	public boolean validarLogin(String login, String senha) {
		if(this.login == login && this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void imprimivel() {
		System.out.println("Nome: " + getNome());
		System.out.println("Salario: " + getSalario());
	}
}
