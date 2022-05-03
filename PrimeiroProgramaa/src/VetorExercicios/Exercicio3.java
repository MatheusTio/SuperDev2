package VetorExercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// 3. Ler um vetor de 10 elementos inteiros e positivos. 
//		Criar um segundo vetor da seguinte forma: os elementos de 
//		índice par receberão os respectivos elementos divididos por 2; 
//		os elementos de índice ímpar receberão os respectivos elementos 
//		multiplicados por 3. Imprima os dois vetores. 
		
		Scanner scan = new Scanner(System.in);
		
		double vetor1[]= new double[10], vetor2[]= new double[10];
		double vetorR1[]=  new double[5];
		double vetorR2[]=  new double[5];
		
		for (int i = 0, j = 0,k=0; i < vetor2.length; i++) {
			System.out.println("Digite um número: ");
			vetor1[i] = scan.nextDouble();
			
			if(i % 2 == 0) {
				vetor2[i] = vetor1[i] / 2;
				
				vetorR1[j]=vetor2[i];
				j++;
			}else {
				vetor2[i] = vetor1[i] * 3;
				
				vetorR2[k] = vetor2[i];
				k++;
			}
		}
		
		for (int i = 0; i < vetor2.length; i++) {
			System.out.println("Vetor 1["+i+"]: "+vetor1[i]+" - Vetor 2: "+vetor2[i]);
		}
		
		for (int i = 0; i < vetorR1.length; i++) {
			System.out.println(vetorR1[i]);
		}
		
		for (int i = 0; i < vetorR2.length; i++) {
			System.out.println(vetorR2[i]);
		}

	}

}
