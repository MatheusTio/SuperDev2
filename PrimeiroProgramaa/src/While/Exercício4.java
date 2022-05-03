package While;

import java.util.Scanner;

public class Exercício4 {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int senha = 3327;
		int usuario = 71780;

		System.out.println("digite seu usuario: ");
		usuario = scan.nextInt();

		while (usuario != 71780) {
			System.out.println("usuario incorreto, Digite novamente: ");
			usuario = scan.nextInt();
		}
			System.out.println("digite sua senha: ");
			senha = scan.nextInt();
		
			while (senha != 3327) 
				System.out.println("senha incorreto, Digite novamente: ");
				senha = scan.nextInt();

				System.out.println("bem vindo ao sistema "+usuario);

			}
		}
	

