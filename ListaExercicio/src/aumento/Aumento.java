package aumento;

import java.util.Scanner;

public class Aumento 
{
	
	public static void main(String [] args)
	{
		Scanner leitor = new Scanner(System.in);
		float valorA, percent, valFn;
		
		System.out.println("Digite o valor atual ");
		valorA = leitor.nextFloat();
				
		System.out.println("Digite o valor de aumento (%): ");
		percent = leitor.nextFloat();
		
		valFn = ((percent/100)*valorA)+valorA;
		
		System.out.println("seu salario sera: "+valFn);
	}

}
