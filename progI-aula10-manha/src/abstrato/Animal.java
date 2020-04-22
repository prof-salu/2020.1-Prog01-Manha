package abstrato;

public abstract class Animal {
	private String nome;
	private int idade;
	private boolean doente;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isDoente() {
		return doente;
	}
	public void setDoente(boolean doente) {
		this.doente = doente;
	}
	
	public void dorme() {
		System.out.println("Está dormindo");
	}
	
	public abstract void fazBarulho();
	
	public abstract void procuraComida();
}

