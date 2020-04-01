import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Loja {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Carlos", "carlos@email.com", "123456789-10");
		//c1.nome = "Carlos";
		//c1.email = "carlos@email.com";
		//c1.cpf = "123566789-10";
		
		Funcionario f1 = new Funcionario(1234, "Antônio", "9876654321-11");
		//f1.matricula = 1234;
		//f1.nome = "Antônio";
		//f1.cpf = "9876654321-11";
		
		Produto p1 = new Produto();
		p1.setNome("Notebook");
		p1.setMarca("Dell");
		p1.setCodigo("12345");;
		p1.setPreco(3500);
		p1.setQuantidade(77);
		
		Vendas v1 =  new  Vendas();
		v1.setCliente(c1);
		v1.setFuncionario(f1);
		v1.setProduto(p1);
		v1.setQuantidade(2);
		//LocalDate.now() --> recupera a data atual do sistema
		v1.setDataCompra(LocalDate.now());
		//LocalDate.of(ano, mes, dia) --> armazena uma data passada seguindo os parametros
		//v1.dataCompra = LocalDate.of(2020, 03, 18);
		
		System.out.println("Cliente: " + c1.getNome());
		System.out.println("Funcionario: " + f1.getNome());
		System.out.println("Produto: " + p1.getNome());
		System.out.println("Valor unitário: " + p1.getPreco());
		System.out.println("Valor total: " + (p1.getPreco() * v1.getQuantidade()));
		System.out.println("Data da compra: " + v1.getDataCompra());
		//dd-mm-yyyy
		System.out.println("Data da compra: " + v1.getDataCompra().format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy")));
		
	}

}
