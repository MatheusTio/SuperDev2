package WhileExercicios;

import java.util.Scanner;

public class WhileExercicios3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 3. Faça um programa que leia e valide as seguintes informações: Nome: maior
		 * que 3 caracteres; Idade: entre 0 e 150; Salário: maior que zero; Sexo: 'f' ou
		 * 'm'; Estado Civil: 's', 'c', 'v', 'd';
		 */
		Scanner scan = new Scanner(System.in);

		String nome, genero, estado = "";
		int idade;
		Double salario;
		boolean flag = true;

		while (flag == true) {
			System.out.println("Digite seu nome: ");
			nome = scan.next();
			if (nome.chars().count() > 3) { // char para caracteres, count é para a quantidade de caracteres
				flag = false; // nessa condição tem que ser maior que 3 para sair do looping
			} else {
				System.out.println("valor invalido, tente novamente ");
			}
		}
		//

		flag = true;
		while (flag == true) {
			System.out.println("digite sua idade: ");
			idade = scan.nextInt();

			if (idade > 0 && idade < 150) {
				flag = false;
			} else {
				System.out.println("idade invalida, digite novamente: ");
			}
		}

		flag = true;
		while (flag == true) {
			System.out.println("digite seu salario: ");
			salario = scan.nextDouble();
			if (salario > 0) {
				flag = false;
			} else {
				System.out.println("salario invalido, digite novamente: ");
			}
		}

		flag = true;
		while (flag == true) {
			System.out.println("digite seu Genero: ");
			System.out.println("M-Masculino: ");
			System.out.println("F-Femenuino: ");
			genero = scan.next();
			
			 if (genero.equalsIgnoreCase("f")) {
				System.out.println("Femenino");
			}
			else if (genero.equalsIgnoreCase("m")) {
				System.out.println("Masculino");
				flag = false;
			} else {
				System.out.println("genero invalido, digite novamente: ");
			}
		}
		flag = true;
		while (flag == true) {
			System.out.println("Informe seu estado civil: ");
			System.out.println("S-Solteiro: ");
			System.out.println("C-Casado: ");
			System.out.println("V-Viúvo: ");
			System.out.println("D-Divorciado: ");
			genero = scan.next();

			if (genero.equalsIgnoreCase("S")) {
				System.out.println("Solteiro");}
			else if (genero.equalsIgnoreCase("C")) {
				System.out.println("Casado");
			} else if (genero.equalsIgnoreCase("V")) {
				System.out.println("Viúvo");
			} else if (genero.equalsIgnoreCase("D")) {
				System.out.println("Divorciado");
				flag = false;
			} else {
				System.out.println("genero invalido, digite novamente: ");
			} 
		}
	

		
		}
}

//if (genero.equalsIgnoreCase("F")) {
//System.out.println("Femenino");