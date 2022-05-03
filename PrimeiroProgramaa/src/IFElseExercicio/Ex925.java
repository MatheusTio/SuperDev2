package IFElseExercicio;

import java.util.Scanner;

public class Ex925 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*25.	Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. 
		 * As perguntas são:
		 
			"Telefonou para a vítima?"
			"Esteve no local do crime?"
			"Mora perto da vítima?"
			"Devia para a vítima?"
			"Já trabalhou com a vítima?" O programa deve no final emitir 
			uma classificação sobre a participação da pessoa no crime. 
			Se a pessoa responder positivamente a 2 questões ela deve ser 
			classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 
			5 como "Assassino". Caso contrário, ele será classificado como "Inocente".*/
		
		int classificacao=0;
		int op =0;
		System.out.println("1- Sim 2-Não");
		
		System.out.println("Telefonou para a vítima?");
		op = scan.nextInt();

		if(op ==1) {
			classificacao++;
		}
		
		System.out.println("Esteve no local do crime?");
		op = scan.nextInt();

		if(op ==1) {
			classificacao++;
		}
		
		System.out.println("Mora perto da vítima?");
		op = scan.nextInt();

		if(op ==1) {
			classificacao++;
		}
		
		System.out.println("Devia para a vítima?");
		op = scan.nextInt();

		if(op ==1) {
			classificacao++;
		}
		
		System.out.println("Já trabalhou com a vítima?");
		op = scan.nextInt();

		if(op ==1) {
			classificacao++;
		}
		
		 /*a pessoa responder positivamente a 2 questões ela deve ser 
			classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 
			5 como "Assassino". Caso contrário, ele será classificado como "Inocente".*/
		
		
		System.out.println("Classificação: "+classificacao);
		if(classificacao == 2) {
			System.out.println("Suspeito");
		}else if(classificacao ==3 || classificacao ==4) {
			System.out.println("Cúmplice");
		}else if(classificacao ==5) {
			System.out.println("Assassino");
		}else {
			System.out.println("Inocente");
		}
	}

}
