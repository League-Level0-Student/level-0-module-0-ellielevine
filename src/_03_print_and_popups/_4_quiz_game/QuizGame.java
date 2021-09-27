package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int count = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String answer = JOptionPane.showInputDialog("How many days are there in a year?");
				// 3.  Use an if statement to check if their answer is correct
				if(answer.equalsIgnoreCase("365")) {
				// 4.  if the user's answer was correct, add one to their score 
		count += 1;}
				else {
					JOptionPane.showMessageDialog(null, "The correct answer is 365");
					count -= 1;
				}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		answer = JOptionPane.showInputDialog("What is the first color in the rainbow?");
		if(answer.equalsIgnoreCase("Red")) {
		count += 1;}
		else {
			JOptionPane.showMessageDialog(null, "incorrect. The answer is red.");
			count -= 1;
		}
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, "congratulations, you've scored " +count);
	}
}
