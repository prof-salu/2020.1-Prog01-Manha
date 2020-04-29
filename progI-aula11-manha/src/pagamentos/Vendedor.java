package pagamentos;

public class Vendedor extends Mensalista {
	private double comissao; // 5%
	private double totalVendas; // ~15000

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	public double calcularSalario() {
		return getSalario() + (comissao * totalVendas);
	}
}
