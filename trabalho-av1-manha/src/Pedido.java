import java.time.LocalDate;

public class Pedido {
	private LocalDate dataPedido;
	private Cliente cliente;
	private Vendedor vendedor;
	private ItemDePedido itemDePedido;

	public Pedido() {

	}

	public Pedido(LocalDate dataPedido, Cliente cliente, Vendedor vendedor, ItemDePedido itemDePedido) {
		super();
		this.dataPedido = dataPedido;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.itemDePedido = itemDePedido;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public ItemDePedido getItemDePedido() {
		return itemDePedido;
	}

	public void setItemDePedido(ItemDePedido itemDePedido) {
		this.itemDePedido = itemDePedido;
	}

}
