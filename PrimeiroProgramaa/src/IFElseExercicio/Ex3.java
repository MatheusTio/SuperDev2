package IFElseExercicio;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3 Faça um Programa que verifique se uma letra digitada 
       //é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
	    
		Scanner scan = new Scanner(System.in);
		
		String genero = "";
		// char genero = '';
		
	
		System.out.println("informe: ");
		System.out.println("M-Masculino: ");
		System.out.println("F-Femenuino: ");
		genero=scan.next();
		
		
		if (genero.equalsIgnoreCase("F")) {
			System.out.println("Femenino");
		}
		else if (genero.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
			
		} else { System.out.println("invalido");
	
			
		}}}
				
				




