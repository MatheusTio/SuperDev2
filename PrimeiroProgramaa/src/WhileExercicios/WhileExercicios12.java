package WhileExercicios;

import java.util.Scanner;

public class WhileExercicios12 {
	// i contator é o niumero de vezes que vai repetir
	//
	//12.	Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. 
	//O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
	//Tabuada de 5:
		//5 X 1 = 5
		//5 X 2 = 10
	//	...
		//	5 X 10 = 50


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i = 0;
		int n2 = 0;

		System.out.println("Quer ver a tabuada de qual numero?");
		n2 = scan.nextInt();

		while (i < 10) {
			i++;
			System.out.println(i + "x" + n2 + "=" + (i * n2));

		}

	}

}
