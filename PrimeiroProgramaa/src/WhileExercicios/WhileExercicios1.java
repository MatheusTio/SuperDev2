package WhileExercicios;

import java.util.Scanner;

public class WhileExercicios1 {

	public static void main(String[] args) {
		/*
		 * 1. Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma mensagem
		 * caso o valor seja inv�lido e continue pedindo at� que o usu�rio informe um
		 * valor v�lido.
		 */

		Scanner scan = new Scanner(System.in);

		int i = 0;
		double nota = 0;

		System.out.println("digite uma nota: ");
		nota = scan.nextInt();

		while (nota < 0 || nota > 10) {
			System.out.println("nota invalida, digite novamente: ");
			nota = scan.nextInt();
		}

	}

}
