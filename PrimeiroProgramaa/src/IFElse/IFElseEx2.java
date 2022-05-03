package IFElse;

import java.util.Scanner;

public class IFElseEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int idade = 0;
		
		
		System.out.println("Digite sua idade");
		idade = scan.nextInt();
		
		
		
		if (idade > 18) {
			System.out.println("Maior de Idade");
		} else {	System.out.println("Menor de Idade");
		}
	}
}
					
