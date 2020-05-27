package br.com.profsalu.excecoes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TesteExcecao2 {

	public static void main(String[] args) {
		
//		try {
//			System.out.println(10 / 0);//unchecked			
//		}catch(ArithmeticException ex1) {
//			System.out.println("Erro de divisao por zero");
//		}
		
		try {
			FileInputStream input = new FileInputStream("arquivo.txt");//checked
		}catch(FileNotFoundException ex1) {
			System.out.println("Arquivo nao encontrado");
		}catch(IOException ex) {
			System.out.println("Sem permissao de acesso");
		}catch(Exception e) {
			System.out.println("ERROR");
		}
		
		
		//TesteExcecao3 exc = new TesteExcecao3();
		//exc.executaArquivo();
		
	}

}
