package VetorExercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//Ler um vetor de 10 elementos. Crie um segundo vetor, 
//		com todos os elementos na ordem inversa, ou seja, o último 
//		elemento passará a ser o primeiro, o penúltimo será o segundo 
//		e assim por diante. Imprima os dois vetores. 
		Scanner scan = new Scanner(System.in);
		
		
		
		int vetor1[] =  new int[10];
		int novoVetor[] =  new int[10];
		
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println("Digite um numero:");
			vetor1[i] = scan.nextInt();
		}
		
		for (int i =0, j = novoVetor.length -1; i < novoVetor.length; i++ , j--) {
			
		
			novoVetor[i] = vetor1[j];
			
			System.out.println("novoVetor["+i+"] = vetor1["+j+"];");
			
		}
		
		
		System.out.println();
		System.out.println("Vetor Antigo: ");
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println(vetor1[i]);
		}
		System.out.println("Novo vetor: ");
		for (int i = 0; i < novoVetor.length; i++) {
			System.out.println(novoVetor[i]);
		}

	}

}
