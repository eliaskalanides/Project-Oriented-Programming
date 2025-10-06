package Madlip;

import java.util.Scanner;

public class Madlip 
{

	public static void main(String[] args) 
	{
		String[] words = new String[5];
		Scanner keyboard = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) 
		{
			System.out.print("Enter word " + (i + 1) + ": ");
	        words[i] = keyboard.next();
			
			
		
	    }

	}
}