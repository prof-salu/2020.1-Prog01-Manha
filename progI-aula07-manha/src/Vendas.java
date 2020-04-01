import java.time.LocalDate;

public class Vendas {
	private Funcionario funcionario;
	private Cliente cliente;
	private Produto produto;
	private int quantidade;
	private LocalDate dataCompra;
	private static int totalVendas = 0;
	
	public Vendas() {
		Vendas.totalVendas++;
	}

	public Vendas(Funcionario funcionario, Cliente cliente, Produto produto, int quantidade, LocalDate dataCompra) {
		this.funcionario = funcionario;
		this.cliente = cliente;
		this.produto = produto;
		this.quantidade = quantidade;
		this.dataCompra = dataCompra;
		Vendas.totalVendas++;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}

	public static int getTotalVendas() {
		return totalVendas;
	}
}