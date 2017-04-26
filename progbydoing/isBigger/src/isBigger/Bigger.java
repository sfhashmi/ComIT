package isBigger;

import java.awt.Component;

import javax.swing.JOptionPane;

public class Bigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);

		// query
		JOptionPane.showMessageDialog(null, "Enter two numbers");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		if (n1 > n2) {
			System.out.print(n1+" is greater than "+n2);
		} else if (n2 > n1) {
			System.out.print(n2+" is greater than "+n1);
		} else if (n1 == n2) {
			System.out.print("They are the same. Try again.");
		}
	}
}