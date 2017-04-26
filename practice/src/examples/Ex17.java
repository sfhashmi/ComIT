package examples;

import java.util.Scanner;

public class Ex17 // convert CAD to USD
{
	public static void main(String[] args)
	{
		double input;
		double conv = 0.74;
		Scanner keyboard = new Scanner(System.in);
		System.out.print( "Enter amount in CAD: " );
		input = keyboard.nextDouble();
		double result = (input * conv);
		
		System.out.print( "That comes to $" + result + " USD.");
	}
}