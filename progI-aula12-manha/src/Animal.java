
public class Animal {
	/*Modificadores de acesso:
	 * 	+ ==> public
	 * 	- ==> private
	 * 	# ==> protected
	 * 	~ ==> default 
	 * */
	protected int pernas = 0;
	
	public Animal() {
		
	}
	
	public void caminhar() {
		System.out.println("Caminhando...");
	}
	
	public void comer() {
		System.out.println("Comendo...");
	}
	/*
	public boolean teste() {
		System.out.println("teste animal");
		return false;
	}
	
	public int teste2() {
		if(pernas == 0) {
			System.out.println("Nao possui pernas");
			return 1;
		}else {
			return 0;
		}
	}
	
	public String teste3() {
		return "Isso é um teste";
	}
	*/
}
