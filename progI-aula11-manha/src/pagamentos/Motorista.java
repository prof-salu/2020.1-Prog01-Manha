package pagamentos;
public class Motorista extends Funcionario {
	private double valorHora;
	private int totalHoras;
	
	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getTotalHoras() {
		return totalHoras;
	}

	public void setTotalHoras(int totalHoras) {
		this.totalHoras = totalHoras;
	}

	public double calcularSalario() {
		return valorHora * totalHoras;
	}
}
