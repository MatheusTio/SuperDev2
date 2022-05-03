package IFElse;

import java.util.Scanner;

public class IFElseEx1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		
		System.out.println("Digite sua nota 1: ");
		nota1 = scan.nextDouble ();
		System.out.println("Digite sua nota 2: ");
		nota2 = scan.nextDouble ();	
		System.out.println("Digite sua nota 3: ");
		nota3 = scan.nextDouble ();
		System.out.println("Digite sua nota 4: ");
		nota4 = scan.nextDouble ();
		

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("media: " + media);

		if (media >= 6) {
			System.out.println("aluno Aprovado");
		} else {
			System.out.println("aluno reprovado");
		}
	}
}

