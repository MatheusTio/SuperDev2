package IFElseExercicio;
import java.util.Scanner;
public class Ex5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.	Faça um programa para a leitura de duas notas parciais de um aluno. 
		//O programa deve calcular a média alcançada por aluno e apresentar:
		// mensagem "Aprovado", se a média alcançada for maior ou igual a sete;A 
		//mensagem "Reprovado", se a média for menor do que sete;
		 // mensagem "Aprovado com Distinção", se a média for igual a dez.

		Scanner scan = new Scanner(System.in);{
		
	    double nota1=0;
	    double nota2=0 ;
	    
		System.out.println("Escreva a primeira nota: ");
		
		nota1 = scan.nextDouble (); 
		
		System.out.println("Escreva a segunda nota: ");

		nota2 = scan.nextDouble (); 
		
		double media = (nota1 + nota2) / 2;
		System.out.println("media: " + media);

		
		if (media == 10) {
			System.out.println("aluno aprovado com distinção");
		} else if (media >=7 && media <10) {
			
			System.out.println("aluno aprovado");
		}else if  (media <7) {
			
			System.out.println("aluno aprovado"); 
		} else  {
			System.out.println("Valor inválido"); 

		}
	}
}}






