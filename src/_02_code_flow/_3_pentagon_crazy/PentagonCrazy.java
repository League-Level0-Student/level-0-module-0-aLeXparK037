package _02_code_flow._3_pentagon_crazy;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

public class PentagonCrazy {
	
	private void drawPattern() {
		
		//  Create a new Robot
		Robot ap = new Robot("mini");
	
		//  Put the robot's pen down
			ap.penDown();

		//  SPEED. Make the robot go at maximum speed (100)
		ap.setSpeed(100);

		//  COLOR. Set the pen to a color that you like for the shape
		ap.setPenColor(Color.BLUE);

		//  NUMBER OF SIDES. Make an int variable for the number of sides the shape has.
		//  				(Hint: its called PentagonCrazy)
		int nos5 = 5;
		int nos6 = 6;

		//  TURN ANGLE. Make another int variable for the angle you want the robot to turn. 
		//  			Hint: Divide 360 by the number of sides the shape has.
		int angle = 72;

		//  LOOP. Use a for loop to repeat ALL the following lines of code 200 times. 
		
				//  DRAW.  Make the robot move "i" pixels
				//         "i" is the variable in the for loop
			for (int i = 0; i < 50; i++) {
				ap.move(3*i);
			
				//  TURN.  Turn the robot the amount in your angle variable + 1
			ap.turn(angle+1);
			}
		// Hide the robot so you can see the pattern.
			ap.hide();
		// Check the pattern against the picture in the recipe. If it matches, you are done!
	}

	
	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	
	public static void main(String[] args) {
		new PentagonCrazy().drawPattern();
	}
}
