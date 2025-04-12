package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	/*
	 * 
	 * Have the robot draw a square. Put this code into a drawSquare() method. Have
	 * the robot draw a triangle. Put this code into a drawTriangle() method. Have
	 * the robot draw a circle. Put this code into a drawCircle() method. Ask the
	 * user which shape they want. Draw the appropriate shape depending on their
	 * answer (call the right method). Ask the user which color they want. Give them
	 * some choices so you don't have to accomodate every possible color. Color the
	 * the shape depending on their answer.
	 */

	static Robot rob = new Robot();

	public static void main(String[] args) {
		rob.penDown();
		rob.setSpeed(100);
		
		String userColor = JOptionPane.showInputDialog("What color shape would you like to draw: Red, Green, or Blue: ");
		if(userColor.equals("blue")) {
			rob.setPenColor(0,0,255);
		}else if(userColor.equals("green")) {
			rob.setPenColor(0,255,0);
		}else if(userColor.equals("red")) {
			rob.setPenColor(255,0,0);
		}
		
		String userShape = JOptionPane.showInputDialog("What shape would you like to draw?");
		if(userShape.equals("square")) {
			drawSquare();
		}else if(userShape.equals("triangle")) {
			drawTriangle();
		}else if(userShape.equals("circle")) {
			drawCircle();
		}
		
		rob.hide();

	}

	public static void drawSquare() {
		for (int i = 0; i<4; i++) {
			rob.move(50);
			rob.turn(90);
		}
	}

	public static void drawTriangle() {
		for(int i=0; i<3; i++) {
		rob.move(50);
		rob.turn(120);
	}
	}
	
	public static void drawCircle() {
		for(int i=0; i<90; i++) {
			rob.move(1);
			rob.turn(4);
		}
	}
	
}
