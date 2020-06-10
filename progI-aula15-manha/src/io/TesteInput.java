package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TesteInput {

	public static void main(String[] args) throws IOException {
		InputStream input = new FileInputStream("java.txt");
		
		int b = input.read();
		
		System.out.println(b);
		
		input.close();
		//ASC
	}

}
