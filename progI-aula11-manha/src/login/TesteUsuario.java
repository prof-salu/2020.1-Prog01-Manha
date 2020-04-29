package login;

public class TesteUsuario {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		
		c1.setNome("Ana");
		c1.setEmail("ana@email.com");
		c1.setId("1234");
		c1.setRanking("A2");
		c1.setLogin("ana123");
		c1.setSenha("123ana");
		
		System.out.println(c1.validarLogin("ana123", "123"));
		System.out.println("bloqueado: " + c1.isBloqueado());
		
		System.out.println(c1.validarLogin("123", "123ana"));
		System.out.println("bloqueado: " + c1.isBloqueado());
		
		System.out.println(c1.validarLogin("123", "123ana"));
		System.out.println("bloqueado: " + c1.isBloqueado());
		
		System.out.println(c1.validarLogin("ana123", "123ana"));
		System.out.println("bloqueado: " + c1.isBloqueado());
	}

}
