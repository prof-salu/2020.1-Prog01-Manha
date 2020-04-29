package pagamentos;
public abstract class Mensalista extends Funcionario{
	private double salario;
	
	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
