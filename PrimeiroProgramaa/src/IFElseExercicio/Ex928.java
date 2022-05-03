package IFElseExercicio;

import java.util.Scanner;

public class Ex928 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*               Até 5 Kg           Acima de 5 Kg
 	 File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
 	 Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
	 Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg*/
		
		Scanner scan = new Scanner(System.in);
		String tipoCarne="";
		double qtdCarne=0;
		double precoTotal; 
		String tipoPagamento;
		double valorDesconto=0;
		double valorFinal;
		double valorKG= 0;
		
		double precoFileDuplo = 4.90;
		double precoAlcatra = 5.90;
		double precoPicanha = 6.90;
		
		
	
		
		int op =0;
		
		
		
		System.out.println("1-File Duplo");
		System.out.println("2-Alcatra");
		System.out.println("3-Picanha");
		op =  scan.nextInt();
		
		System.out.println("Quantos kg?");
		qtdCarne = scan.nextDouble();
		
		
		if(op==1) {//Validação tipo carne e preço
			tipoCarne = "FileDuplo";
			
			if(qtdCarne >5) {
				precoFileDuplo = 5.80;
				
			}
				valorKG = precoFileDuplo; 
					
		}else if(op==2) {
			tipoCarne = "Alcatra";
			
			if(qtdCarne >5) {
				precoAlcatra = 6.80;
			}
			valorKG = precoAlcatra;
			
		}else if(op==3) {
			tipoCarne = "Picanha";
			
			if(qtdCarne >5) {
				precoPicanha = 7.80;
			}
			valorKG = precoPicanha;
		}
		
		precoTotal = qtdCarne*valorKG;
		
		System.out.println("Forma de Pagamento: ");
		System.out.println("1- Dinheiro");
		System.out.println("2- Cartão Tabajara");
		int opPagamento = scan.nextInt();
		
		if(opPagamento==1) {//Validação Pagamento
			tipoPagamento= "Dinheiro";
		}else {
			tipoPagamento="Cartão Tabajara";
			valorDesconto = precoTotal*0.05;
		}
		
		valorFinal= precoTotal-valorDesconto;
		
		System.out.println("Tipo carne: "+tipoCarne);
		System.out.println("Valor kg: "+valorKG);
		System.out.println("Kg carne: "+qtdCarne);
		System.out.println("Preco Total:"+precoTotal);
		System.out.println("Tipo pagamento :"+tipoPagamento);
		System.out.println("Valor Desconbto:"+valorDesconto);
		System.out.println("Valor à pagar: "+valorFinal);
		
		
		/*String tipoCarne="";
		double qtdCarne=0;
		double precoTotal; 
		String tipoPagamento;
		double valorDesconto=0;
		double valorFinal;
		double valorKG= 0;*/
		
		
		
		
		
		
	}

}
