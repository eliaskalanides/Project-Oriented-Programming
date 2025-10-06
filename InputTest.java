package InputTest;

import java.util.Scanner;

public class InputTest 
{

	public static void main(String[] args) 
	{
	
		double test1 ;
		double test2 ;
		double test3 ;
		double average ;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the first number :");
		test1 = keyboard.nextDouble();
		System.out.print("Enter second number : ");
		test2 = keyboard.nextDouble();
		System.out.print("Enter Third number : ");
		test3 = keyboard.nextDouble();
		
		average = (test1 + test2) / 2.0 ;
		
		System.out.println("Test Average :" + average);
	}

}
