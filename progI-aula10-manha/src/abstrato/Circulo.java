package abstrato;

public class Circulo extends Poligono{
	public Circulo(int lados) {
		super(lados);
	}

	@Override
	public void desenhar() {
		System.out.println("Circulo");
	}
	
	@Override
	public void aumentar(int tamanho) {
		System.out.println("Circulo.aumentar");
		
	}

	@Override
	public void pintar(int cor) {
		System.out.println("Circulo.pintar");
		
	}
}