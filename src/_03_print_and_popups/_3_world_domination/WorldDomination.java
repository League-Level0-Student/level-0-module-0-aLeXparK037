package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String code = JOptionPane.showInputDialog("DO you know how to Coooode?");

		//2. If they say "yes", tell them they will rule the world.
		if (code.equals("yes")) {
			JOptionPane.showMessageDialog(null, "You will rule over Earth!!!!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Weeeell then SIGN UP for THE LEAGUE and their coding!");
		}

		// 3. Otherwise, tell them to sign up for classes at The League.

	}
}

