package IFElseExercicio;
import java.util.Scanner;

public class Ex8 {

//
	// 8. 8.	Fa�a um programa que pergunte o pre�o de tr�s produtos 
	//e informe qual produto voc� deve comprar, sabendo que a decis�o 
	//� sempre pelo mais barato
	
	//int local;
	//aqui voc� est� comparando se number1 � maior que number2,
	//se sim salva o valor de number1 na vari�vel local, se n�o
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
			   
	    	   System.out.println("O produto de menor valor � de: "+n1+" Reais");
		   } else if
	        (n2 < n1 && n2 < n3 ) {
	    	   
	    	   System.out.println("O produto de menor valor � de: "+n2+" Reais");
	       }
	       else if
	        (n3 < n1 && n3 < n2 )
	    	   
	    	   System.out.println("O produto de menor valor � de: "+n3+" Reais");
	}
}




