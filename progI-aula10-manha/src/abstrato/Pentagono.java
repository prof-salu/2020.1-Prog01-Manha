package abstrato;

public class Pentagono extends Poligono {

	public Pentagono(int lados) {
		super(lados);
	}

	@Override
	public void desenhar() {
		System.out.println("Pentagono");
	}

	@Override
	public void aumentar(int tamanho) {
		System.out.println("Pentagono.aumentar");
	}

	@Override
	public void pintar(int cor) {
		System.out.println("Pentagono.pintar");

	}
}
