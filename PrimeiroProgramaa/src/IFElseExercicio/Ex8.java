package IFElseExercicio;
import java.util.Scanner;

public class Ex8 {

//
	// 8. 8.	Faça um programa que pergunte o preço de três produtos 
	//e informe qual produto você deve comprar, sabendo que a decisão 
	//é sempre pelo mais barato
	
	//int local;
	//aqui você está comparando se number1 é maior que number2,
	//se sim salva o valor de number1 na variável local, se não
	//salva o valor de number2
	//if(number1 > number2)
	//local = number1;
	//else
	//local = number2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n1;
		int n2;
		int n3;

		int soma;
		int local;
		int numero3 = 0;

		System.out.println("Qual valor desse primeiro produto?");
		n1 = scan.nextInt();

		System.out.println("Qual valor desse segundo produto?:");
		n2 = scan.nextInt();

		System.out.println("Qual valor desse terceiro produto?");
		n3 = scan.nextInt();

		   if (n1 < n2 && n1 < n3 ) {
			   
	    	   System.out.println("O produto de menor valor é de: "+n1+" Reais");
		   } else if
	        (n2 < n1 && n2 < n3 ) {
	    	   
	    	   System.out.println("O produto de menor valor é de: "+n2+" Reais");
	       }
	       else if
	        (n3 < n1 && n3 < n2 )
	    	   
	    	   System.out.println("O produto de menor valor é de: "+n3+" Reais");
	}
}




