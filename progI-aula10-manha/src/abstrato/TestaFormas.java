package abstrato;

public class TestaFormas {

	public static void main(String[] args) {
		//Forma f1 = new Forma();
		Triangulo t1 = new Triangulo(3);
		Quadrado q1 = new Quadrado(4);
		Circulo c1 = new Circulo(1);
		Pentagono p1 = new Pentagono(5);
		
		//f1.desenhar();
		t1.desenhar();
		q1.desenhar();
		c1.desenhar();
		p1.desenhar();

	}

}
