package IFElseExercicio;

import java.util.Scanner;

public class Ex927 {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       /* 					Até 5 Kg           Acima de 5 Kg
			Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
			Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg*/
			
			Scanner scan = new Scanner(System.in);
			
			double qtdMaca,qtdMorango,valorFinal=0;
			double kgMorango =2.5,  kgMaca=1.8;
			
			System.out.println("Quantos kg de morango?");
			qtdMorango = scan.nextDouble();
			
			System.out.println("Quantos kg de maca?");
			qtdMaca = scan.nextDouble();
		
			if (qtdMorango >5) {
				kgMorango =  2.2;
			}
			
			if (qtdMaca >5) {
				kgMaca = 1.5;
			}		
			
			double valorMaca=kgMaca*qtdMaca;
			double	valorMorango = kgMorango*qtdMorango;
			
			valorFinal = valorMaca+valorMorango;
			
			if(valorFinal>25 || (qtdMaca+qtdMorango >8)) {
				valorFinal = valorFinal- (valorFinal*0.1);
			}
			System.out.println("Valor final da compra: R$"+valorFinal);
			
			


		}

	

		
	}


