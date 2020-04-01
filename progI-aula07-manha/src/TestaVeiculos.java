
public class TestaVeiculos {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo();
		v1.motor = "Ferrari turbo";
		v1.combustivel = "alcool";
		v1.id = "zic-9999";
		v1.qtdPassageiros = 1;
		
		v1.andar();
		
		Carro c1 = new Carro();
		c1.motor = "Mercedes 34 v1";
		c1.combustivel = "gasolina";
		c1.id = "lvf-4567";
		c1.qtdPassageiros = 5;
		c1.chassi = "1234acf";
		c1.qtdPneus = 4;
		
		c1.andar();
		
		Aviao a1 = new Aviao();
		a1.motor = "Briener 7789 v12";
		a1.combustivel = "diesel";
		a1.id = "fla777";
		a1.qtdPassageiros = 88;
		a1.radar = "radar 12000";
		a1.qtdMotores = 2;
		
		a1.andar();
		
		
	}

}
