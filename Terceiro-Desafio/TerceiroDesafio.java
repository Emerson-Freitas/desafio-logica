package br.com.desafio.supera.solucao;

import java.util.Arrays;
import java.util.Scanner;

public class TerceiroDesafio {

	public static void main(String[] args) {
		
		System.out.println("DIGITE O TAMANHO DO ARRAY");
		Scanner scanner = new Scanner(System.in);
		int tamanho = scanner.nextInt();
		int[] array = new int[tamanho];
		
		System.out.println("Digite o valor alvo:");
		Scanner scanner2 = new Scanner(System.in);
		int valorAlvo = scanner2.nextInt();
		
		for(int i = 0; i < array.length; i++) {
			System.out.println((i+1) + "° valor do array: ");
			Scanner scanner3 = new Scanner(System.in);
			int numero = scanner3.nextInt();
			array[i] = numero;
		}
		
		int contador = 0;
		int numeroAnterior = 0;
		
		for(int pos = 0; pos < array.length; pos++) {
			if(pos == 0) {
				numeroAnterior = array[pos];
			}
			if(array[pos] - numeroAnterior == valorAlvo) {
				contador++;
				numeroAnterior = array[pos];
			}
		}
		
		scanner.close();
		scanner2.close();
		System.out.println("array" + Arrays.toString(array));
		System.out.println("Numero de pares que satisfazem o criterio: " + contador);
	}
}
