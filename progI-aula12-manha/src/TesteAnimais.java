
public class TesteAnimais {

	public static void main(String[] args) {
		Formiga formiga = new Formiga();
		Cachorro cachorro = new Cachorro("Rex");
		Peixe peixe = new Peixe();
		
		formiga.comer();
		
		cachorro.comer();
		cachorro.brincar();
		
		peixe.setNome("Bill");
		peixe.comer();
		peixe.brincar();

	}

}
