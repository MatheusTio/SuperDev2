package WhileExercicios;

import java.util.Scanner;

public class WhileExercicios7 {

	// 7. Fa�a um programa que leia 5 n�meros e informe o maior n�mero.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int numero[] = new int[5];
		int maior=0;
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite numero: " + (i + 1));
			numero[i] = scan.nextInt();		
			
		}
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Numero " + (i + 1) + ": " + numero[i]);
			
			System.out.println("Numero Maior: "+maior);
			}
			
	}

}
