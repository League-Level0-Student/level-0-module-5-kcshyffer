package extra;

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

	String s = JOptionPane.showInputDialog("Ayo, how many dimes you baggin fool?");
	int a = Integer.parseInt(s);

// Tell them how many cents they have (hint multiply by 10)
	JOptionPane.showMessageDialog(null, "You have " + a*10 + " cents.");



// Ask the user how tall they are (inches)

	String h = JOptionPane.showInputDialog("How tall are you in inches?");
	int he = Integer.parseInt(h);
	

// If they are shorter than 36 inches, tell them to eat their Wheaties
	
	if (he < 36) {
		JOptionPane.showMessageDialog(null, "Eat your Wheaties dum dum.");
	}


}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console
		for (int i = 0; i < 31; i++) {
			System.out.println(i);
			i = i + 1;
			i = i + 1;
		}
	}

	void skill3() { // Get a random number that is less than 20 and print it to the console
		
		int r1 = new Random().nextInt(20);
		// Get another random number that is less than 10 and print it to the console
		int r2 = new Random().nextInt(10);
		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction
		JOptionPane.showMessageDialog(null, "The difference of the random numbers is " + (r1-r2) + ".");
	}

	void skill4() { // In a pop-up, ask the user for the city they live in
		String C = JOptionPane.showInputDialog("What city do you live in?");
		// If they answered "San Diego", tell them they live in America's Finest City
		if ( C.equals ("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's finest city!");
		}
		// Otherwise, tell them to move to San Diego
		else{
			JOptionPane.showMessageDialog(null, "You really should move to San Diego.");
		}
		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."
		String B = JOptionPane.showInputDialog("How many cars do you have.");
		int car = Integer.parseInt(B);
		if ( car == 0 ) {
			JOptionPane.showMessageDialog(null, "I bet you use public transportation");
		}
		// If there is 1 car, use a pop-up to display the make/model of the car
		else if ( car == 1 ) {
			JOptionPane.showMessageDialog(null, "I bet you own a lexus");
		}
		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.
		
		else{
			int w = car * 4;
			JOptionPane.showMessageDialog(null, "Your cars have " + w + " wheels on them");
		}
	}

	void skill5() { // In a pop-up, ask the user for the name of their school
		String school = JOptionPane.showInputDialog("What school do you go to?");
		// In another pop-up, tell the user, that their school is a fantastic school. //
		// You must include the name of the school in the message.
		JOptionPane.showMessageDialog(null, "WOW, " + school + " really is an amazing school!");
	}
}