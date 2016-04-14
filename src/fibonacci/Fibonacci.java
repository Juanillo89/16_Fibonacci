package fibonacci;

import java.util.Scanner;

public class Fibonacci 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num3;
		int num1 = 1;
		int num2 = 1;
		System.out.print("Introduce número para mostrar los N primeros números de la sucesión de Fibonacci: ");
		int N = sc.nextInt();
		sc.close();
		if(N == 1)
		{
			System.out.println(num1);
		}
		else if(N == 2)
		{
			System.out.println(num1);
			System.out.println(num2);
		}
		else if(N > 2)
		{
			System.out.println(num1);
			System.out.println(num2);
			for(int i = 0 ; i < (N - 2) ; i++)
			{
				num3 = num2 + num1;
				System.out.println(num3);
				num1 = num2;
				num2 = num3;
			}
		}
		else
		{
			System.out.println("No válido.");
		}
	}
}

