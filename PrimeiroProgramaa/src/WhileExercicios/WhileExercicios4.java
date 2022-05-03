package WhileExercicios;

public class WhileExercicios4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*4.	Supondo que a população de um país A seja da ordem de 80.000 habitantes com uma taxa anual de crescimento de 3% 
e que a população de B seja 200.000 habitantes com uma taxa de crescimento de 1.5%. 
Faça um programa que calcule e escreva o número de anos necessários para que a população do país A
ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.*/
		
		/* pais A com 80.000 taxa anual 3% ao ano 80.000  3%= 2.400
		 * pais B com 200.000 1.5% ao ano 
		em quantos ano o pais A chega na população do pais B ( B crescendo junto )
		a + = a*0,03
		
		  */
		double população =80000;
		
		System.out.println("população"+população);
		
		int i= 0 ;
		while (população < 1000000) {
			i++;
			população += população * (0.03);
			System.out.println("população= "+população);
			
		}
		System.out.println(i);
	}

}
