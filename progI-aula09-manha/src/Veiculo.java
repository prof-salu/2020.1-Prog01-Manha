//Super classe
public class Veiculo extends Object{
	//Protected --> A própria classe, as classes filhas e as classes do mesmo pacote 
	//				tem acesso a esse membro.
	protected String motor;
	private String combustivel;
	private String id;
	private int qtdPassageiros;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String motor, String combustivel, String id, int qtdPassageiros) {
		this.motor = motor;
		this.combustivel = combustivel;
		this.id = id;
		this.qtdPassageiros = qtdPassageiros;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

	public void locomover() {
		System.out.println("To andando!!!");
	}
	
	public void imprimir() {
		System.out.println("Motor: " + motor);
		System.out.println("Combustivel: " + getCombustivel());
		System.out.println("Id: " + getId());
		System.out.println("Passageiros: " + getQtdPassageiros());
	}
	
	public final void acelerar() {
		System.out.println("Pisando no acelerador...");
	}
}
