import java.util.Scanner;

public class ForLoopChallenges 
{
	public static void main(String[] args)
	{
		iLoveDonuts();
		ascendingDescending();
		multiples();
		totalOfMultiples();
		lowerBoundUpperBound();
		rectangleAsterisks();
		extraCredit();	
	}

	private static void iLoveDonuts() 
	{
		for(int i = 0; i < 5; i++)
		{
			System.out.println("I love Donuts");
		}
	}

	private static void ascendingDescending() 
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(i);
		}
		for(int j = 5; j >= 1; j--)
		{		
			System.out.println(j);
		}
	}
	private static void multiples() 
	{
		for(int i = 5; i <= 100; i+= 5)
		{
			System.out.println(i);
		}
	}

	private static void totalOfMultiples() 
	{
		int sum = 0;
		for(int i = 5; i <= 100; i+= 5)
		{
			sum +=i;
		}
		System.out.println("Total is " + sum);
	}

	private static void lowerBoundUpperBound() 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Choose a small number.");
		int lowerBound = userInput.nextInt();
		System.out.println("Now choose a higher number, and I will add all the numbers in range.");
		int upperBound = userInput.nextInt();
		
		int sum = 0;
		for(int i = lowerBound; i <= upperBound; i++)
			{
				
				System.out.println(i);
				sum +=i;
				
			}
		System.out.println("The sum of the number in between is " + sum + ".");
	}

	private static void rectangleAsterisks() 
	{
		{
			System.out.println("*********");
		}
	for (int i = 1; i < 9; i++)
		{
			System.out.println("*       *");
		}
		{
			System.out.println("*********");
		}	
	}

	private static void extraCredit() 
	{		
		
		for(int i = 9+1; i < 51; i+= 9+1)
		{
			System.out.println(i);
		}
		
	}
}
