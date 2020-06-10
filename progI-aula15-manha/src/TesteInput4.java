import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteInput4 {

	public static void main(String[] args) throws IOException {
		InputStream input = new FileInputStream("frutas.txt");
		InputStreamReader leitor = new InputStreamReader(input);
		BufferedReader br = new BufferedReader(leitor);
		
		String linha = br.readLine();
		
		while(linha != null) {
			if(!linha.isEmpty())
				System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
		leitor.close();
		input.close();

	}

}
