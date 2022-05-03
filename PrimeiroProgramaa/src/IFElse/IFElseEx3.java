package IFElse;

import java.util.Scanner;

public class IFElseEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int idade = 0;
		String genero = "";
		
		System.out.println("Digite sua idade");
		idade = scan.nextInt();
		System.out.println("Digite seu genero");
		idade = scan.nextInt();


		System.out.println("idade: " + idade);
		System.out.println("Genero: " + genero);

		if ((idade >= 18) && (genero.equals("Masculino") )) {
			System.out.println("Está pronto para servir o exercito");
		} else {
			System.out.println("não es pronto para servir");
		}

	}
}
