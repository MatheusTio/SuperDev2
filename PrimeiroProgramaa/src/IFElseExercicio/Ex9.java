package IFElseExercicio;

import java.util.Scanner;

public class Ex9 {
	//9.	Faça um Programa que leia três números e mostre-os em ordem decrescente.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n1,n2,n3;
		
		System.out.println("Escreva Primeiro numero: ");
		n1 = scan.nextInt();

		System.out.println("Escreva segundo numero: ");
		n2 = scan.nextInt();

		System.out.println("Escreva tereceiro numero: ");
		n3 = scan.nextInt();
		
		//maior
		
		 if (n1 > n2 && n1>n3 ) {
			   
	    	   System.out.println("Maior numeor é: ");
		   } else if
	        (n2 > n1 && n2>n3 ) {
	    	   
	    	   System.out.println("Maior numeor é: "+n2);
	       }
	       else if
	        (n3 > n1 && n3>n2 )
	    	   
	    	   System.out.println("Maior numeor é: "+n3);
		  //meio
		   if (n2 > n1 && n2 > n3 ) {
			   
	    	   System.out.println("O numero do meio é: "+n1);
		   } else if
	        (n3 > n2 && n3 > n2 ) {
	    	   
	    	   System.out.println("O numero do meio é: "+n2);
	       }
	       else if
	        (n1 > n3 && n1 > n2 )
	    	   
	    	   System.out.println("O numero do meio é: "+n3);
		   // menor 
		 if (n1 < n2 && n1 < n3 ) {
			   
	    	   System.out.println("Menor numeor é: "+n1);
		   } else if
	        (n2 < n1 && n2 < n3 ) {
	    	   
	    	   System.out.println("Menor numeor é: "+n2);
	       }
	       else if
	        (n3 < n1 && n3 < n2 )
	    	   
	    	   System.out.println("Menor numeor é: "+n3); 
		   //		   
} }






