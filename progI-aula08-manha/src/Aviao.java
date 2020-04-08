//Sub classe de veiculo (filha)
public class Aviao extends Veiculo{
	private int qtdMotores;
	private String radar;
	
	public Aviao() {
		super();
	}

	public Aviao(String motor, String combustivel, String id, int qtdPassageiros, 
												int qtdMotores, String radar) {
		super(motor, combustivel, id, qtdPassageiros);
		this.qtdMotores = qtdMotores;
		this.radar = radar;	
	}
	
	public int getQtdMotores() {
		return qtdMotores;
	}
	public void setQtdMotores(int qtdMotores) {
		this.qtdMotores = qtdMotores;
	}
	public String getRadar() {
		return radar;
	}
	public void setRadar(String radar) {
		this.radar = radar;
	}
	
	@Override
	public void locomover() {
		System.out.println("Cortando os céus...");
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Motores: " + qtdMotores);
		System.out.println("Radar: " + radar);
	} 
	
	public void ativarTremDePouso() {
		System.out.println("Descendo o trem de pouso...");
	}
	
}
