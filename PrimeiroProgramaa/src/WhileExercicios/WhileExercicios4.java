package WhileExercicios;

public class WhileExercicios4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*4.	Supondo que a popula��o de um pa�s A seja da ordem de 80.000 habitantes com uma taxa anual de crescimento de 3% 
e que a popula��o de B seja 200.000 habitantes com uma taxa de crescimento de 1.5%. 
Fa�a um programa que calcule e escreva o n�mero de anos necess�rios para que a popula��o do pa�s A
ultrapasse ou iguale a popula��o do pa�s B, mantidas as taxas de crescimento.*/
		
		/* pais A com 80.000 taxa anual 3% ao ano 80.000  3%= 2.400
		 * pais B com 200.000 1.5% ao ano 
		em quantos ano o pais A chega na popula��o do pais B ( B crescendo junto )
		a + = a*0,03
		
		  */
		double popula��o =80000;
		
		System.out.println("popula��o"+popula��o);
		
		int i= 0 ;
		while (popula��o < 1000000) {
			i++;
			popula��o += popula��o * (0.03);
			System.out.println("popula��o= "+popula��o);
			
		}
		System.out.println(i);
	}

}
