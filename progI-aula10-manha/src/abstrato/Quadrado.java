package abstrato;

public class Quadrado extends Poligono{
	
	public Quadrado(int lados) {
		super(lados);
	}

	@Override
	public void desenhar() {
		System.out.println("Quadrado");
	}

	@Override
	public void aumentar(int tamanho) {
		System.out.println("Quadrado.aumentar");
		
	}
	
	@Override
	public void pintar(int cor) {
		System.out.println("Quadrado.pintar");
		
	}
}