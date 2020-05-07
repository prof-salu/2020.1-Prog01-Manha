import java.time.LocalDate;

public class TesteLoja {

	public static void main(String[] args) {
		Cliente cliente = new Fisica("Carlos", "1234", "carlos@email.com", "987654321");
		Vendedor vendedor = new Vendedor("Ana", "ana@email.com", "6543", LocalDate.of(2001, 1, 20));
		Produto produto = new Hardware("Memória ram 8GB", 150, "ABC123");
		ItemDePedido itemDePedido = new ItemDePedido(8, produto);
		
		System.out.println(cliente.validarLogin("carlos@gmail.com", "1234"));//false
		System.out.println(cliente.validarLogin("carlos@email.com", "1234"));//true
		
		Pedido p1 = new Pedido(LocalDate.now(), cliente, vendedor, itemDePedido);
	}
}
