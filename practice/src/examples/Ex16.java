package examples;

import java.util.Scanner;

public class Ex16 // 100 numbers after input int
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int in;
		System.out.println( "What number to start with?");
		in = keyboard.nextInt();
		
		for (int i = 1; i < 101; i++) {
			in++;
			System.out.println( in );
		}
	}
}