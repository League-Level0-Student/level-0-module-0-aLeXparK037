package _02_code_flow._2_robot_spiral;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */


import org.jointheleague.graphical.robot.Robot;

public class RobotSpiral {

	public static void main(String[] args) {
		
		// Create a new Robot
		Robot gab = new Robot("mini"); 
		
		// Set your robot's pen down 
		gab.penDown();
		
		// SPEED. Set the robot to go at max speed (100)
		gab.setSpeed(100);
        // LOOP. Use a for loop to repeat ALL the following lines of code 50 times. 
		
				// Change the robot pen color to random
			gab.setRandomPenColor();
				// DRAW.    Move the robot (5*i) pixels
				//          "i" is the variable in the for loop
			for (int i = 0; i < 50; i++) {
			gab.move(5*i);
				// TURN.    Turn the robot (360/3) degrees to the right
			gab.turn(360/3);
			
				// Change the robot pen width to (i)
			gab.setPenWidth(10);
			}

		
		// Check the pattern against the picture in the recipe. If it matches, you are done!
		
	}
}
