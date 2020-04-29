package validador;

public class Juridico extends Pessoa{
	private String cnpj;
	
	public boolean validarDocumento() {
		return true;
	}
}