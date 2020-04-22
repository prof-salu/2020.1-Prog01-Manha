package interfaces;

public class Engenheiro extends Funcionario implements Imprimivel{

	@Override
	public void imprimivel() {
		System.out.println("Nome: " + getNome());
		System.out.println("Salario: " + getSalario());
	}

}
