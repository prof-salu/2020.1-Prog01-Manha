package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class ListaDeCompras {

	public static void main(String[] args) throws IOException {
		File caminho = new File("C:\\Users\\saluo\\Desktop\\lista.txt");
		OutputStream arquivo = new FileOutputStream(caminho);
		OutputStreamWriter writer = new OutputStreamWriter(arquivo);
		BufferedWriter bw = new BufferedWriter(writer);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Lista de compras: ");	
		String linha = sc.nextLine();
		
		while(!linha.equals("FIM")) {
			bw.write(linha + "\n");
			linha = sc.nextLine();
		}
		
		System.out.println("Encerrando a gravacao");
		
		sc.close();
		bw.close();
		writer.close();
		arquivo.close();
	}
}
