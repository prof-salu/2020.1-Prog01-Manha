package abstrato;

public class Gato extends Felino{
	@Override
	public void procuraComida() {
		System.out.println("Gato procurando comida");
	}
	
	public void miar() {
		System.out.println("Miau");
	}
}
