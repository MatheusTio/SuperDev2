package WhileExercicios;
import java.util.Scanner;

public class WhileExercicios10 {
	/*10.	Fa�a um programa que receba dois n�meros inteiros
	e gere os n�meros inteiros que est�o no intervalo compreendido por eles. */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		System.out.println("Digite Primeiro numero: ");
		numero1 = scan.nextInt();		
		System.out.println("Digite segundo numero: ");
		numero2 = scan.nextInt();	
		
		for (int i = numero1; i < numero2; i++) {
			System.out.println(i);
		}
	}
}

		
		
		
		
		
		
		
	
