//Sub classe de veiculo (filha)
public class Carro extends Veiculo{
	private String chassi;
	private int qtdPneus;
	
	public Carro() {
		super();
	}
	
	public Carro(String motor, String combustivel, String id, int qtdPassageiros,
					String chassi, int qtdPneus) {
		super(motor, combustivel, id, qtdPassageiros);
		this.chassi = chassi;
		this.qtdPneus = qtdPneus;		
	}
		
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public int getQtdPneus() {
		return qtdPneus;
	}
	public void setQtdPneus(int qtdPneus) {
		this.qtdPneus = qtdPneus;
	}
	
	//REESCRITA
	//Assinatura (nomeDoMetodo + parametros)
	
	@Override
	public void locomover() {
		System.out.println("Percorrendo as estradas...");
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Chassi: " + chassi);
		System.out.println("Pneus: " + qtdPneus);
	}
	
	public void passarMarcha() {
		System.out.println("Passando a marcha...");
	}
		
	//Erro. Não podemos reescrever um método final
//	public void acelerar() {
//		System.out.println("Pisando no acelerador...");
//	}
	//NomeDaclasse[propriedade1: valor, propriedade2:valor, propriedadeN:valor]
	@Override
	public String toString() {
		return "Carro[Motor: " + motor + ", Combustivel: " + getCombustivel() + 
				", ID: " + getId() + ", Passageiros: " + getQtdPassageiros() + 
				", Chassi: " + chassi + ", Pneus: " + qtdPneus + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		//Verificar se o objeto foi instanciado
		if(obj == null) {
			return false;
		}
		
		//Verificar se o objeto é instancia dessa mesma classe
		if(!(obj instanceof Carro)) {
			return false;
		}
		
		//Comparando e convertendo
		Carro outroCarro = (Carro) obj;
		
		if(this.chassi == outroCarro.chassi) {
			return true;
		}
		
		return false;
	}
	

	
	
}
