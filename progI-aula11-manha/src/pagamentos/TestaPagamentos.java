package pagamentos;

import java.time.LocalDate;

public class TestaPagamentos {

	public static void main(String[] args) {
		Motorista m1 = new Motorista();
		
		m1.setNome("Carlos");
		m1.setCargo("A1");
		m1.setAdmissao(LocalDate.of(2008, 11, 17));
		m1.demitir(LocalDate.now());
	}
}
