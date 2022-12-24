package br.com.desafio.supera.solucao;

import java.util.Locale;
import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args){
		
		System.out.println("Digite um valor:");
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		Double valorScanner = scanner.nextDouble();
		
		Double total = valorScanner;
		
		int notaCem = 0;
		int notaCinquenta = 0;
		int notaVinte = 0;
		int notaDez = 0;
		int notaCinco = 0;
		int notaDois = 0;
		
		int moedaUmReal = 0;
		int moedaCinquenta = 0;
		int moedaVinteECinco = 0;
		int moedaDez = 0;
		int moedaCinco = 0;
		int moedaUm = 0;
		
		while(total >= 100.00) {
			total -= 100.00;
			notaCem++;
		}
		while(total >= 50.00) {
			total -= 50.00;
			notaCinquenta++;
		}
		while(total >= 20.00) {
			total -= 20.00;
			notaVinte++;
		}
		while(total >= 10.00) {
			total -= 10.00;
			notaDez++;
		}
		while(total >= 5.00) {
			total -= 5.00;
			notaCinco++;
		}
		while(total >= 2.00) {
			total -= 2.00;
			notaDois++;
		}
		
		while(total >= 1.00) {
			total -= 1.00;
			moedaUmReal++;
		}
		while(total >= 0.50) {
			total -= 0.50;
			moedaCinquenta++;
		}
		while(total >= 0.25) {
			total -= 0.25;
			moedaVinteECinco++;
		}
		while(total >= 0.10) {
			total -= 0.10;
			moedaDez++;
		}
		while(total >= 0.05) {
			total -= 0.05;
			moedaCinco++;
		}
		while(total >= 0.01) {
			total -= 0.01;
			moedaUm++;
		}
		
		scanner.close();
		
		System.out.println("NOTAS:");
		System.out.println(notaCem + " notas(s) de R$ 100.00" );
		System.out.println(notaCinquenta + " notas(s) de R$ 50.00" );
		System.out.println(notaVinte + " notas(s) de R$ 20.00" );
		System.out.println(notaDez + " notas(s) de R$ 10.00" );
		System.out.println(notaCinco + " notas(s) de R$ 5.00" );
		System.out.println(notaDois + " notas(s) de R$ 2.00" );
		
		System.out.println("MOEDAS:");
		System.out.println(moedaUmReal + " moeda(s) de R$ 1.00" );
		System.out.println(moedaCinquenta + " moeda(s) de R$ 0.50" );
		System.out.println(moedaVinteECinco + " moeda(s) de R$ 0.25" );
		System.out.println(moedaDez + " moeda(s) de R$ 0.10" );
		System.out.println(moedaCinco + " moeda(s) de R$ 0.05" );
		System.out.println(moedaUm + " moeda(s) de R$ 0.01" );
		
	}
}
