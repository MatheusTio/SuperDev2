package WhileExercicios;

public class WhileExercicios6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// faca um contador de 1 ao 10
		//6.	Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. 
		//Depois modifique o programa para que ele mostre os números um ao lado do outro

		int i = 0;
		int i2 = 0;
		int max = 20;
		
		System.out.println("imprimindo um de baixo do outro");
		
			while (i < 20) {
				i++;
				System.out.println(i);
			}
			
			System.out.println("Um do lado do outro");
			
		while (i2 < 20) {
			i2++;
			System.out.print(" "+i2);
		}
			
	}
}
