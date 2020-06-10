package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteInput3 {

	public static void main(String[] args) throws IOException {
		InputStream input = new FileInputStream("java.txt");
		InputStreamReader leitor = new InputStreamReader(input);
		BufferedReader br = new BufferedReader(leitor);
		
		String linha = br.readLine();
		
		System.out.println(linha);
		
		br.close();
		leitor.close();
		input.close();

	}

}
