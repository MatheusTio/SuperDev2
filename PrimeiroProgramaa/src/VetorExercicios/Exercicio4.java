package VetorExercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Ler um vetor com 10 nomes de pessoas, 
	//	após pedir que o usuário digite um nome qualquer de pessoa. 
	//	Escrever a mensagem “ACHEI”, se o nome estiver armazenado no vetor 
//		C ou “NÃO ACHEI” caso contrário. 

		
		Scanner scan = new Scanner(System.in);
		
		String nome[] =  new String[10];
		
		boolean flag=false;
		
		for (int i = 0; i < nome.length; i++) {
			System.out.println("Digite um nome: ");
			nome[i] = scan.next();
		}
		
		System.out.println("Digite o nome que deseja procurar");
		String verificaNome =  scan.next();
		
		for (int i = 0; i < nome.length; i++) {
			
			if(verificaNome.equalsIgnoreCase(nome[i])) {
				flag =  true;
				}
		
		}
		
		if(flag == true) {
			System.out.println("Achei");
		}else {
			System.out.println("Nao achei");
		}
		
	}

}
