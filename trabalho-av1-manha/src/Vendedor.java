import java.time.LocalDate;

public class Vendedor extends Funcionario {
	private LocalDate admissao;

	public Vendedor() {

	}

	public Vendedor(String nome, String email, String matricula, LocalDate admissao) {
		super(nome, email, matricula);
		this.admissao = admissao;
	}

	public LocalDate getAdmissao() {
		return admissao;
	}

	public void setAdmissao(LocalDate admissao) {
		this.admissao = admissao;
	}

}
