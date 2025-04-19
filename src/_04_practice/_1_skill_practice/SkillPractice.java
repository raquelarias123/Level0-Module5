package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {

	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
		String userDimes = JOptionPane.showInputDialog("How many dimes do you have? ");
		int userDimesInteger = Integer.parseInt(userDimes);

// Tell them how many cents they have (hint multiply by 10)
		JOptionPane.showMessageDialog(null, userDimesInteger *= 10);
// Ask the user how tall they are (inches)
		String userHeight = JOptionPane.showInputDialog("How tall are you in inches? ");
		int userHeightInteger = Integer.parseInt(userHeight);

// If they are shorter than 36 inches, tell them to eat their Wheaties
		if (userHeightInteger < 37) {
			JOptionPane.showMessageDialog(null, "Eat your Wheaties!");
		}

	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console
		for (int i = 3; i < 31; i += 3) {
			System.out.println(i);
		}

	}

	void skill3() { // Get a random number that is less than 20 and print it to the console

		// Get another random number that is less than 10 and print it to the console

		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction
		Random ran = new Random();
		int randomNumber = ran.nextInt(20 - 1 +1)+1;
		int randomNumber2 = ran.nextInt(10 - 1 +1)+1;
		
		JOptionPane.showMessageDialog(null, randomNumber - randomNumber2);
		
		

	}

	void skill4() { // In a pop-up, ask the user for the city they live in
		String userCity = JOptionPane.showInputDialog("What city do you live in? ");
		if (userCity.equals("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's Finest City.");
		} else {
			JOptionPane.showMessageDialog(null, "You should move to San Diego.");
		}

		int cars = 2;
		if (cars == 0) {
			JOptionPane.showMessageDialog(null, "I bet you use public transportation. ");
		} else if (cars == 1) {
			JOptionPane.showMessageDialog(null, "Tesla Model S");
		} else {
			JOptionPane.showMessageDialog(null, "In total there is 8 wheels");
		}

		// If they answered "San Diego", tell them they live in America's Finest City

		// Otherwise, tell them to move to San Diego

		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."

		// If there is 1 car, use a pop-up to display the make/model of the car

		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.

	}

	void skill5() { // In a pop-up, ask the user for the name of their school

		// In another pop-up, tell the user, that their school is a fantastic school. //
		// You must include the name of the school in the message.
		
		String userSchool = JOptionPane.showInputDialog("What is the name of your school? ");
		JOptionPane.showMessageDialog(null, userSchool + " is a fantastic school!");

	}
}
