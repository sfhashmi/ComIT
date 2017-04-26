package examples;

import java.util.Scanner;

public class Ex20 // determine negative or positive
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int B;
		System.out.println( "Give me a number" );
		Scanner keyboard = new Scanner(System.in);
		B = keyboard.nextInt();
		if (B < 0) {
			System.out.print( "Your input is negative" );
		} else {
			System.out.print( "Your input is positive" );
		}
	}
}