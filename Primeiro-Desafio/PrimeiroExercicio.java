package br.com.desafio.supera.solucao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class PrimeiroExercicio {

	public static void main(String[] args) throws IOException {
	
		System.out.println("Digite a quantidade de valores que deseja digitar");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
		int linhas = Integer.parseInt(stringTokenizer.nextToken());
		
		List<Integer> numerosPares = new ArrayList<Integer>();
		List<Integer> numerosImpares = new ArrayList<Integer>();
		
		for(int i = 0; i < linhas; i++) {
			System.out.println("Digite o " + (i+1) + "° valor:");
			stringTokenizer = new StringTokenizer(br.readLine());
			int numero = Integer.parseInt(stringTokenizer.nextToken());
			if(numero % 2 == 0) {
				numerosPares.add(numero);
			}else {
				numerosImpares.add(numero);
			}
		}
		List<Integer> ordemNumerosPares = numerosPares.stream().filter(l -> l % 2 == 0).sorted().collect(Collectors.toList());
		List<Integer> ordemNumerosImpares = numerosImpares.stream().filter(l -> l % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		List<Integer> totalNumeros = new ArrayList<Integer>();
		totalNumeros.addAll(ordemNumerosPares);
		totalNumeros.addAll(ordemNumerosImpares);
		
		totalNumeros.forEach(numero -> System.out.println(numero));
	}
}
