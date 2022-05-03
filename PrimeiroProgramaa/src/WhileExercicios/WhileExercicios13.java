package WhileExercicios;
import java.util.Scanner;


public class WhileExercicios13 {

	/*
	 * 13. Faça um programa que peça dois números, base e expoente, calcule e mostre
	 * o primeiro número elevado ao segundo número. Não utilize a função de potência
	 * da linguagem.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		int numero1base;
		int numero2expoente;
		int potencia=0;
		
		
		System.out.println("Digite o Primeiro numero");
		numero1base = scan.nextInt();
		System.out.println("Digite o Segundo numero");
		numero2expoente = scan.nextInt();
		System.out.println("Resultado"+potencia);
		potencia= numero1base*numero1base;
		
		
		
		
	}

}
