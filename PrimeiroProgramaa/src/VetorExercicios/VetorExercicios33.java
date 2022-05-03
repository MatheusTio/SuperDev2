package VetorExercicios;

import java.util.Scanner;

public class VetorExercicios33 {
	// 3. Ler um vetor de 10 elementos inteiros e positivos.
//	Criar um segundo vetor da seguinte forma: os elementos de índice par receberão os respectivos
//	elementos divididos por 2; os elementos de índice ímpar receberão 
//	os respectivos elementos multiplicados por 3. 
//	Imprima os dois vetores. 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double vetor1[] = new double[10];
		double vetor2[] = new double[10];
		double vetorR1[] = new double[10];
		double vetorR2[] = new double[10];
		

		for (int i = 0; i < vetor2.length; i++) {
			System.out.println("digite um numero: ");
			vetor1[i] = scan.nextInt();
			if (i % 2 == 0) {
				vetor2[i] = vetor1[i] / 2;
				vetorR1[i] = vetor2[i] / 2;
				
			} else {
				vetor2[i] = vetor1[i] * 3;
			}
		}
		for (int i = 0; i < vetor2.length; i++) {
			System.out.println("vetor1: "+vetor1[i]+" - vetor2: "+vetor2[i]);
		}

	}
}
