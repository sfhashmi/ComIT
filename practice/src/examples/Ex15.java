package examples;

public class Ex15 // print squares of first 30 natural numbers 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int p = 1;
		int n = 1;
		for (int i = 1; i < 30; i++) {
			n = (p * p);
			p++;
			System.out.println( n );
		}
	}
}