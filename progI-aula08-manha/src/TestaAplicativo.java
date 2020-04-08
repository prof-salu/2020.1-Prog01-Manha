
public class TestaAplicativo {

	public static void main(String[] args) {
		Aplicativo app = new Aplicativo();
		//Todo circulo é uma forma
		Forma circulo = new Circulo();		
		Forma quadrado = new Quadrado();
		Forma triangulo = new Triangulo();

		//Nem toda forma é um circulo
		//Circulo circulo2 = new Forma();
		
		app.desenharNaTela(quadrado);
		app.desenharNaTela(triangulo);
		app.desenharNaTela(circulo);

	}

}
