package byDoing;

import java.util.Scanner;

public class SpaceBoxing
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double weight;
		int n;
		
		System.out.print( "Please enter your current weight on Earth: " );
		weight = keyboard.nextInt();
		
		System.out.println( "I have information for the following planets: ");
		System.out.println( "   1. Venus   2. Mars    3. Jupiter" );
		System.out.print( "   4. Saturn  5. Uranus  6. Neptune" );
		
		System.out.print( "\n Which planet are you visiting?: " );
		n = keyboard.nextInt();
		
		if ( n == 1 ) {
			weight *= 0.78;
		} else if ( n == 2 ) {
			weight *= 0.39;
		} else if ( n == 3 ) {
			weight *= 2.65;
		} else if ( n == 4 ) {
			weight *= 1.17;
		} else if ( n == 5 ) {
			weight *= 1.05;
		} else if ( n == 6 ) {
			weight *= 1.23;
		} else {
			System.out.print( "That's not a choice. Try again." );			
		}
		System.out.print( "Your weight would be " + weight + " units on that planet." );
	}

}
