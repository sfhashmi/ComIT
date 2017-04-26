package byDoing;

import java.util.Scanner;

public class HowOldSpecifically
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		
		System.out.print( "How old are you? " );
		age = keyboard.nextInt();
		
		if ( age <= 16 ) {
			System.out.print( "You can't drive." );
		} else if ( age <= 17 ) {
			System.out.print( "You can drive but you can't vote." );
		} else if ( age <= 24 ) {
			System.out.print( "You can vote but you can't rent a car." );
		} else {
			System.out.print( "You can do pretty much anything." );
		}
	}
}