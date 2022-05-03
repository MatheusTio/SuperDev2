package WhileExercicios;

import java.util.Scanner;

public class WhileExercicios8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("quantas notas você deseja cadastrar?");
		int op = scan.nextInt();

		double notas[] = new double[5];
		double soma = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + (i + 1) + ": ");
			notas[i] = scan.nextDouble();
			soma += notas[i];
		}
		for (int i = 0; i < notas.length; i++) {
			System.out.println("nota " + (i + 1) + ": " + notas[i]);
		}
		System.out.println("Media : " + (soma / notas.length));
	}

}
//for é para finito, para quantidades finitas 
// vetor = for 
//+= mantenho o valor anterior 