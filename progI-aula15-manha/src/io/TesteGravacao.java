package io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteGravacao {

	public static void main(String[] args) throws IOException {
		OutputStream output = new FileOutputStream("disciplinas.txt");
		OutputStreamWriter escreve = new OutputStreamWriter(output);
		BufferedWriter bw = new BufferedWriter(escreve);
		
		bw.write("Linguagem de programa��o I\n");
		bw.write("Banco de dados\n");
		bw.write("Tecnicas de programacao e animacao\n");
		bw.write("Modelagem 3D\n");
		
		bw.close();
		escreve.close();
		output.close();
	}
}
