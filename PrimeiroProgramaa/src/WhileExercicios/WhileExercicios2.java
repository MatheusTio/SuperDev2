package WhileExercicios;

import java.util.Scanner;

public class WhileExercicios2 {
	Scanner scan = new Scanner(System.in);
	//2.	Fa�a um programa que leia um nome de usu�rio e a sua 
	//senha e n�o aceite a senha igual ao nome do usu�rio, 
	//mostrando uma mensagem de erro e voltando a pedir as informa��es.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String senha, usuario;

		System.out.println("digite seu usuario: ");
		usuario = scan.next();

		System.out.println("digite sua senha: ");
		senha = scan.next();
	//
			while (senha.equals(usuario)) {
				System.out.println("usuario e senha iguais, digite novamente: ");
				
				System.out.println("digite um usuario");
				usuario = scan.next();

				System.out.println("digite um usuario");
				senha = scan.next();

				System.out.println("bem vindo");
			}
		}
}
	

