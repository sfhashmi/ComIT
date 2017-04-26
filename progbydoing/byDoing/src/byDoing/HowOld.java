package byDoing;

import java.util.Scanner;

public class HowOld
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		int drive = 16;
		int vote = 18;
		int car = 25;
		
		System.out.print( "What should I call you? " );
		name = keyboard.next();
		
		System.out.print( "How old are you? " );
		age = keyboard.nextInt();
		
		if ( age < drive ) {
			System.out.println( "You're too young to drive, " + name + "." );
		}
		if ( age < vote ) {
			System.out.println( "You're too young to vote, " + name + "." );
		}
		if ( age < car ) {
			System.out.println( "You're too young to rent a car, " + name + "." );
		}
		else {
			System.out.println( "You can do anything that is legal, " + name + "." );
		}
	}

}
