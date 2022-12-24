package br.com.desafio.supera.solucao;

import java.util.Scanner;

public class QuartoExercicio {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Digite o numero de linhas:");
		Scanner scanner = new Scanner(System.in);
		int quantidadeLinha = scanner.nextInt();
		
		for(int  i = 0; i < quantidadeLinha; i++) {
			Scanner scanner2 = new Scanner(System.in);
			String frase = scanner2.next();
			
			if(validaFrase(frase)) {
				
				StringBuilder primeiraParte = new StringBuilder(frase.substring(0, frase.length() / 2));
				StringBuilder segundaParte = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
				
				primeiraParte.reverse();
				segundaParte.reverse();
				System.out.println(primeiraParte.toString() + segundaParte.toString());
			}else {
				throw new Exception("A frase deve conter de 2 a 100 caracteres");
			}
		}
		scanner.close();
	}
	
	public static boolean validaFrase(String frase) {
		
		boolean fraseValida = true;
		if(frase.length() < 2 || frase.length() > 100) {
			fraseValida = false;
		}
		
		return fraseValida;
	}
}
