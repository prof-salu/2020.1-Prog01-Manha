import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Loja {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.nome = "Carlos";
		c1.email = "carlos@email.com";
		c1.cpf = "123566789-10";
		
		Funcionario f1 = new Funcionario();
		f1.matricula = 1234;
		f1.nome = "Antônio";
		f1.cpf = "9876654321-11";
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.marca = "Del";
		p1.codigo = "12345";
		p1.preco =  3500;
		p1.quantidade = 77;
		
		Vendas v1 =  new  Vendas();
		v1.cliente = c1;
		v1.funcionario = f1;
		v1.produto = p1;
		v1.quantidade = 2;
		//LocalDate.now() --> recupera a data atual do sistema
		v1.dataCompra  = LocalDate.now();
		//LocalDate.of(ano, mes, dia) --> armazena uma data passada seguindo os parametros
		//v1.dataCompra = LocalDate.of(2020, 03, 18);
		
		System.out.println("Cliente: " + c1.nome);
		System.out.println("Funcionario: " + f1.nome);
		System.out.println("Produto: " + p1.nome);
		System.out.println("Valor unitário: " + p1.preco);
		System.out.println("Valor total: " + (p1.preco * v1.quantidade));
		System.out.println("Data da compra: " + v1.dataCompra);
		//dd-mm-yyyy
		System.out.println("Data da compra: " + v1.dataCompra.format(DateTimeFormatter.ofPattern("d/MMMM/yyyy")));
		
	}

}
