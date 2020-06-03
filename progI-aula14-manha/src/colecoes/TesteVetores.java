package colecoes;

public class TesteVetores {

	public static void main(String[] args) {
		String lista01[] = new String[3];
		
		lista01[0] = "ana";
		lista01[1] = "bia";
		lista01[2] = "gabi";
		//lista01[3] = "mara";
		
		for(int i = 0; i < lista01.length; i++) {
			//System.out.println(lista01[i]);
		}
		
		String lista02[] = new String[5];
		lista02[0] = lista01[0];
		lista02[1] = lista01[1];
		lista02[2] = lista01[2];
		lista02[3] = "carlos";
		lista02[4] = "bruno";
		
		for(int i = 0; i < lista02.length; i++) {
			System.out.println(lista02[i]);
		}
	}
}
