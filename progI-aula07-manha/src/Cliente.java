
public class Cliente {
	//Variaveis globais
	private String nome;
	private String cpf;
	private String email;
	
	//Variavel de classe
	private static int totalClientes = 0;
	
	//Construtor vazio
	public Cliente() {
		totalClientes++;
	}
	
	//Construtor cheio
	public Cliente(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		totalClientes++;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getTotalClientes() {
		return Cliente.totalClientes;
	}	
}
