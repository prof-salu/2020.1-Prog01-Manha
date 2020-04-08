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
	
}
