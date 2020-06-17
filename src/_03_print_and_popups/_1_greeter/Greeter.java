package _03_print_and_popups._1_greeter;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	//System.out.println("wow");
	//JOptionPane.showMessageDialog(null, "all right bye");

	//String input = JOptionPane.showInputDialog("How are you do'in");
	//JOptionPane.showMessageDialog(null,input);	
	String input = JOptionPane.showInputDialog("what is your name");
	JOptionPane.showMessageDialog(null, "Hello" + input);
	
}
		
}
