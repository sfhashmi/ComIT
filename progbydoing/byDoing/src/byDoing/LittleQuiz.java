package byDoing;

import java.util.Scanner;

public class LittleQuiz
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String q0bool;
		boolean q0;
		int q1;
		int q2;
		int q3;
		int win = 0;
		
		System.out.print( " Are you ready for a quiz? Y/N " );
		q0bool = keyboard.next();
		q0 = q0bool.equalsIgnoreCase( "y" );
		q0 = q0bool.equalsIgnoreCase( "yes" );
		
		if ( q0 = true ) {
			System.out.print( "Okay, here it comes!\n\n" );
			System.out.println( "Q1) What is the capital of Alaska?" );
			System.out.println( "	1 - Melbourne" );
			System.out.println( "	2 - Anchorage" );
			System.out.println( "	3 - Juneau\n" );
			q1 = keyboard.nextInt();
			
			if ( q1 == 3 ) {
				win++;
				System.out.println( "That's right!\n" );
			} else {
				System.out.println( "Actually, the capital of Alaska is 3 - Anchorage, not " + q1 + "...\n");
			}
			
			System.out.println( "Q2) Can you store the value \"cat\" in a variable of type int?" );
			System.out.println( "	1) yes" );
			System.out.println( "	2) no\n" );
			q2 = keyboard.nextInt();
			
			if ( q2 == 2 ) {
				win++;
				System.out.println( "That's correct!\n" );
			} else {
				System.out.println( "Sorry, \"cat\" is a string. ints can only store numbers." );
				}
	
			System.out.println( "Q3) What is the result of 9+6/3?" );
			System.out.println( "	1) 5" );
			System.out.println( "	2) 11" );
			System.out.println( "	3) 15/3");
			q3 = keyboard.nextInt();
			
			if ( q3 == 2) {
				win++;
				System.out.println( "You're right!\n");
			} else {
				System.out.println( "Not quite...\n" );
			}
		
			System.out.println( "Overall, you got " + win + " out of 3." );
			System.out.println( "Thanks for playing!" );
		} else {
			System.out.println( "I guess that's a no.");
			
		}
	}
}
