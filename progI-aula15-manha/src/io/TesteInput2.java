package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteInput2 {

	public static void main(String[] args) throws IOException {
		InputStream input = new FileInputStream("java.txt");
		InputStreamReader leitor = new InputStreamReader(input);
		
		char c = (char) leitor.read();
		System.out.println(c);
		
		leitor.close();
		input.close();

	}

}
