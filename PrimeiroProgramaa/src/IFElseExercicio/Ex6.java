package IFElseExercicio;

import java.util.Scanner;

public class Ex6 {

//
	// 6. Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.

	// int local;
	// aqui voc� est� comparando se number1 � maior que number2,
	// se sim salva o valor de number1 na vari�vel local, se n�o
	// salva o valor de number2
	// if(number1 > number2)
	// local = number1;
	// else
	// local = number2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n1;
		int n2;
		int n3;

		int soma;
		int local;
		int numero3 = 0;

		System.out.println("Escreva Primeiro numero: ");
		n1 = scan.nextInt();

		System.out.println("Escreva segundo numero: ");
		n2 = scan.nextInt();

		System.out.println("Escreva tereceiro numero: ");
		n3 = scan.nextInt();

		   if (n1 > n2 && n1>n3 ) {
			   
	    	   System.out.println("Maior numeor �: "+n1);
		   } else if
	        (n2 > n1 && n2>n3 ) {
	    	   
	    	   System.out.println("Maior numeor �: "+n2);
	       }
	       else if
	        (n3 > n1 && n3>n2 )
	    	   
	    	   System.out.println("Maior numeor �: "+n3);
	     
} }



