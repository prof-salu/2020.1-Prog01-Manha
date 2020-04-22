package abstrato;

public class Triangulo extends Poligono{
	public Triangulo(int lados) {
		super(lados);
	}

	@Override
	public void desenhar() {
		System.out.println("Triangulo");
	}	
	
	@Override
	public void aumentar(int tamanho) {
		System.out.println("Triangulo.aumentar");
		
	}
	
	@Override
	public void pintar(int cor) {
		System.out.println("Triangulo.pintar");
		
	}
}