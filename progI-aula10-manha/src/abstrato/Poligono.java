package abstrato;

public abstract class Poligono extends Forma{
	private int lados;
	
	public Poligono(int lados) {
		this.lados = lados;
	}
	
	public int getLados() {
		return this.lados;
	}
	
	public abstract void pintar(int cor);
}
