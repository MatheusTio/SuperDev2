package IFElseExercicio;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.

		Scanner scan = new Scanner(System.in);

		int n1 = 0, n2 = 0;

		System.out.println("digito um numero : ");
		n1 = scan.nextInt();

		System.out.println("digite outro numero : ");
		n2 = scan.nextInt();

		if (n1 > n2) {
			System.out.println("O maior numero maior �: " + n1);
		} else {
			System.out.println("O maior numero maior �: " + n2);
		}
	}
}







