package CondStatement;

import java.util.Scanner;

public class CondStatement 
{

	public static void main(String[] args) 
	{
		double number;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number :");
		number = keyboard.nextDouble();
		
		if (number > 0)
			
			System.out.println("The number is positive");
		
		else if (number < 0 )
			
			System.out.println("The number is negative");
		
		else if (number == 0 )
		
			System.out.println("The number is equal to zero");
	}

}
