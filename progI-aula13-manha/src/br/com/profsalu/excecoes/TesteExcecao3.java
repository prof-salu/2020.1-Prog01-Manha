package br.com.profsalu.excecoes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.annotation.processing.FilerException;

public class TesteExcecao3 {
	
	public void executaArquivo() throws FileNotFoundException {
		inputArquivo();
	}
	
	public void inputArquivo() throws FileNotFoundException {
		FileInputStream input = new FileInputStream("arquivo.txt");
	}
}
