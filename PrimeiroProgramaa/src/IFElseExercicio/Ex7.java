package IFElseExercicio;
import java.util.Scanner;

public class Ex7 {

//
	// 7. Faça um Programa que leia três números e mostre o maior e o menor deles
	
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

		int soma=0;
		int local=0;
		

		System.out.println("Escreva Primeiro numero: ");
		n1 = scan.nextInt();

		System.out.println("Escreva segundo numero: ");
		n2 = scan.nextInt();

		System.out.println("Escreva tereceiro numero: ");
		n3 = scan.nextInt();


		   if (n1 > n2 && n1>n3 ) {
			   
	    	   System.out.println("Maior numeor é: "+n1);
		   } else if
	        (n2 > n1 && n2>n3 ) {
	    	   
	    	   System.out.println("Maior numeor é: "+n2);
	       }
	       else if
	        (n3 > n1 && n3>n2 )
	    	   
	    	   System.out.println("Maior numeor é: "+n3);
		   
//
		   if (n1 < n2 && n1 < n3 ) {
			   
	    	   System.out.println("Menor numeor é: "+n1);
		   } else if
	        (n2 < n1 && n2 < n3 ) {
	    	   
	    	   System.out.println("Menor numeor é: "+n2);
	       }
	       else if
	        (n3 < n1 && n3 < n2 )
	    	   
	    	   System.out.println("Menor numeor é: "+n3);
		   
		   
	     
} }




