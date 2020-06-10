package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ListaDeCompras2 {

	public static void main(String[] args) throws IOException {
		// Retorna o nome do usuario logado
		String usuario = System.getProperty("user.name");

		// Caminho (path) para o arquivo
		File caminho = new File("C:\\Users\\" + usuario + "\\Desktop\\lista.txt");

		// lendo o arquivo
		InputStream is = new FileInputStream(caminho);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String linha = br.readLine();
		String listaAntiga = "";
		System.out.println("Lista de compras: ");
		while (linha != null) {
			listaAntiga += linha + "\n";

			linha = br.readLine();
		}

		System.out.println(listaAntiga);

		// Gravando o arquivo
		OutputStream out = new FileOutputStream(caminho);
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write(listaAntiga);
		Scanner sc = new Scanner(System.in);
		System.out.println("Novo item: ");
		String novaLinha = sc.nextLine();

		while (!novaLinha.equals("FIM")) {
			bw.write(novaLinha + "\n");
			System.out.println("Novo item: ");
			novaLinha = sc.nextLine();
		}

		System.out.println("Encerrando a gravacao");

		br.close();
		isr.close();
		is.close();

		bw.close();
		osw.close();
		out.close();

		sc.close();

	}

}
