package algorithms;

import java.util.Scanner;

public class Alg11 {
	static int x = 4;
	public static void main(String[] args) {
		Invoker();
	}
		public static void Invoker() {
			Invokee();
		}
		public static void Invokee() {
			System.out.print( x );
		}
}