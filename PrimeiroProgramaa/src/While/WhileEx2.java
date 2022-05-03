package While;

import java.util.Scanner;

public class WhileEx2 {
	// i contator é o niumero de vezes que vai repetir

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
