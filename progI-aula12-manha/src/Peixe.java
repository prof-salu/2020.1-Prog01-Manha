//CTRL + 1 ==> dicas em erros

public class Peixe extends Animal
implements AnimalDeEstimacao{
	
	private String nome;
	
	public Peixe() {
		
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
		
	}

	@Override
	public void brincar() {
		System.out.println("Peixe brincando...");		
	}
	
	@Override
	public void comer() {
		System.out.println("Peixe comendo...");
	}

}
