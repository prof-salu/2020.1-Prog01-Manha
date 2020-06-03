package br.com.profsalu.excecoes;

import java.util.Scanner;

public class TesteFinally {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		try {
			System.out.println("Informe A: ");
			a = sc.nextInt();
			
			System.out.println("Informe B: ");
			b = sc.nextInt();
			
			System.out.println("Soma de a + b = " + (a + b));
		}catch (IllegalArgumentException e) {
			System.out.println(e);
		}finally {
			sc.close();
			System.out.println("Fechando o scanner");
		}
	}
}
