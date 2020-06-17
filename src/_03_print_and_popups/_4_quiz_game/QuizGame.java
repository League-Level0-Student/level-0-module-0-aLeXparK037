package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String first = JOptionPane.showInputDialog("Are books better than video games?");
				// 3.  Use an if statement to check if their answer is correct
				if (first.equals("yes")) {
					score = score + 1;
				}
				else {
					score = score - 1;
				}
				// 4.  if the user's answer was correct, add one to their score 
				JOptionPane.showMessageDialog(null, "score = "+score);
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
				String second = JOptionPane.showInputDialog("Is wolfgod42 better than Mufasa?");
				if (second.equals("yes")) {
					score = score +1;
				}
				else {
					score = score - 1;
				}
				JOptionPane.showMessageDialog(null, "score = "+ score);
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
