package VetorExercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//1. Faça um programa que lê 10 números inteiros do teclado e 
		//armazene em um vetor. Ao final imprima o vetor armazenado nos dois sentidos.
		
		Scanner scan = new Scanner(System.in);
		
		int numeros[] =  new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = scan.nextInt();
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		for (int i = numeros.length -1 ; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
		

	}

}
