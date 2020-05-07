
public class Hardware extends Produto {
	private String serial;

	public Hardware() {

	}

	public Hardware(String descricao, double preco, String serial) {
		super(descricao, preco);
		this.serial = serial;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

}
