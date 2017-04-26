package byDoing;

import javax.swing.JOptionPane;

public class TwoQuestions
{

	public static void main(String[] args)
	{
		boolean animal;
		boolean vegetable;
		boolean mineral;
		boolean breadbox;
		
		String q1 = JOptionPane.showInputDialog( "Is it an \"animal\", \"vegetable\", or \"mineral\"?" );
		animal = q1.equalsIgnoreCase( "animal" );
		vegetable = q1.equalsIgnoreCase( "vegetable" );
		mineral = q1.equalsIgnoreCase( "mineral" );
		
		String q2 = JOptionPane.showInputDialog( "Is it bigger than a breadbox?" );
		breadbox = q2.equalsIgnoreCase( "yes" );
		
		if (animal && breadbox) {
			JOptionPane.showMessageDialog(null, "My guess is that you are thinking of a moose." );
		}	else if (animal && !breadbox) {
			JOptionPane.showMessageDialog(null, "My guess is that you are thinking of a squirrel." );
		}	else if (vegetable && breadbox) {
			JOptionPane.showMessageDialog(null, "My guess is that you are thinking of a watermelon." );
		}	else if (vegetable && !breadbox) {
			JOptionPane.showMessageDialog(null, "My guess is that you are thinking of a carrot." );
		}	else if (mineral && breadbox) {
			JOptionPane.showMessageDialog(null, "My guess is that you are thinking of a Camaro." );
		}	else if (mineral && !breadbox) {
			JOptionPane.showMessageDialog(null, "My guess is that you are thinking of a paperclip." );
		}
	
		JOptionPane.showMessageDialog(null, "I would ask you if I am right, but I don't actually care." );
	}

}
