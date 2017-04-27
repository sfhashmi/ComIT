// Write a program that allows you to enter the height of 10 students, then show average height
// How many elements are above average, how many are below average

package daytime;

import java.util.Arrays;
import java.util.Scanner;

public class April261 {

	public static int [] keyboardInt() {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int[] storeInt;
		storeInt = new int[10];
		for (int i = 0; i < 10; i++) {
			if (keyboard.hasNextInt()) {
				storeInt[i] = keyboard.nextInt();
			} else {
				System.out.println( "Sorry?" );
				break;
			}
		}
		return storeInt;
	}
//	public static void getAverage() {
//		int sum = 0;
//		for (int d : keyboardInt()) sum += d;
//		double average = 1.0d * sum / 10;
//		for (int p = 0; p <= keyboardInt().length; p++) {
//			if ( p < average ) {				
//			}
//		}
//	}
}