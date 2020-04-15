
public class TestaVeiculos {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("Ferrari turbo", "alcool", "zic-9999", 1);
		final int X = 10;
		
		
		//protected
//		v1.motor = "Ferrari turbo";
//		v1.setCombustivel("alcool");
//		v1.setId("zic-9999");
//		v1.setQtdPassageiros(1);
		
		v1.locomover();
		v1.acelerar();
		v1.imprimir();
		System.out.println();
		
		
		Carro c1 = new Carro();
		//protected
		c1.motor = "Mercedes 34 v1";
		c1.setCombustivel("gasolina");
		c1.setId("lvf-4567");
		c1.setQtdPassageiros(5);
		c1.setChassi("1234acf");
		c1.setQtdPneus(4);
		
		c1.passarMarcha();
		c1.acelerar();
		c1.imprimir();
		c1.locomover();
		System.out.println();
		
				
		Aviao a1 = new Aviao();
		//protected
		a1.motor = "Briener 7789 v12";
		a1.setCombustivel("diesel");
		a1.setId("fla777");
		a1.setQtdPassageiros(88);
		a1.setRadar("radar 12000");
		a1.setQtdMotores(2);
		
		a1.locomover();
		a1.acelerar();
		a1.ativarTremDePouso();
		a1.imprimir();
		System.out.println();
		
		CarroEletrico ce = new CarroEletrico();
		ce.motor = "Trubo 7789 v12";
		ce.setCombustivel("energia");
		ce.setId("POT777");
		ce.setQtdPassageiros(4);
		ce.setQtdPneus(4);
		ce.setChassi("abc34556");
		
		//Impressao carro eletrico
		ce.imprimir();
		
		System.out.println();
		//ToString
		System.out.println(c1.toString());
		System.out.println(a1);
		System.out.println(ce);
		System.out.println();
		
		
		
		
	}

}
