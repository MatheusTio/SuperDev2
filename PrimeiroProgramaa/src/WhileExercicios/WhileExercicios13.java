package WhileExercicios;
import java.util.Scanner;


public class WhileExercicios13 {

	/*
	 * 13. Fa�a um programa que pe�a dois n�meros, base e expoente, calcule e mostre
	 * o primeiro n�mero elevado ao segundo n�mero. N�o utilize a fun��o de pot�ncia
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
