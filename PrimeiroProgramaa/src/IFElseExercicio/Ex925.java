package IFElseExercicio;

import java.util.Scanner;

public class Ex925 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*25.	Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. 
		 * As perguntas s�o:
		 
			"Telefonou para a v�tima?"
			"Esteve no local do crime?"
			"Mora perto da v�tima?"
			"Devia para a v�tima?"
			"J� trabalhou com a v�tima?" O programa deve no final emitir 
			uma classifica��o sobre a participa��o da pessoa no crime. 
			Se a pessoa responder positivamente a 2 quest�es ela deve ser 
			classificada como "Suspeita", entre 3 e 4 como "C�mplice" e 
			5 como "Assassino". Caso contr�rio, ele ser� classificado como "Inocente".*/
		
		int classificacao=0;
		int op =0;
		System.out.println("1- Sim 2-N�o");
		
		System.out.println("Telefonou para a v�tima?");
		op = scan.nextInt();

		if(op ==1) {
			classificacao++;
		}
		
		System.out.println("Esteve no local do crime?");
		op = scan.nextInt();

		if(op ==1) {
			classificacao++;
		}
		
		System.out.println("Mora perto da v�tima?");
		op = scan.nextInt();

		if(op ==1) {
			classificacao++;
		}
		
		System.out.println("Devia para a v�tima?");
		op = scan.nextInt();

		if(op ==1) {
			classificacao++;
		}
		
		System.out.println("J� trabalhou com a v�tima?");
		op = scan.nextInt();

		if(op ==1) {
			classificacao++;
		}
		
		 /*a pessoa responder positivamente a 2 quest�es ela deve ser 
			classificada como "Suspeita", entre 3 e 4 como "C�mplice" e 
			5 como "Assassino". Caso contr�rio, ele ser� classificado como "Inocente".*/
		
		
		System.out.println("Classifica��o: "+classificacao);
		if(classificacao == 2) {
			System.out.println("Suspeito");
		}else if(classificacao ==3 || classificacao ==4) {
			System.out.println("C�mplice");
		}else if(classificacao ==5) {
			System.out.println("Assassino");
		}else {
			System.out.println("Inocente");
		}
	}

}
