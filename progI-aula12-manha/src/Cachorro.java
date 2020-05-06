
public class Cachorro extends Animal 
implements AnimalDeEstimacao{
	//CTRL + 1 ==> dicas em erros
	private String nome;
	
	public Cachorro() {
		
	}
	
	public Cachorro(String nome){
		this.nome = nome;
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
		System.out.println("Cachorro brincando ...");
	}
	
	@Override
	public void comer() {
		System.out.println("Cachorro comendo...");
	}
	
}
