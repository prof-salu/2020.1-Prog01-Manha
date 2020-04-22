package interfaces;

public class Analista extends Funcionario implements Imprimivel{

	@Override
	public void imprimivel() {
		System.out.println("Nome: " + getNome());
		System.out.println("Salario: " + getSalario());
	}
}
