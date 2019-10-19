package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
		String nickels ="";
		String dimes = "";
		String quarters = "";
		int numNick = 0;
		int numDime = 0;
		int numQuart = 0;
		// Ask the user how many nickels they have
			nickels = JOptionPane.showInputDialog(null,"How may nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
			numNick = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
			dimes = JOptionPane.showInputDialog(null,"How may dimes do you have?");
			numDime = Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
			quarters = JOptionPane.showInputDialog(null,"How may quarters do you have?");
			numQuart = Integer.parseInt(quarters);
		// Calculate how much money the user has and save it in a double variable 
			double money = (0.25 * numQuart) + (0.1 * numDime)+ (0.05 * numNick);
		// Tell the user how much money they have
			JOptionPane.showConfirmDialog(null,"You have $" + money);
	}
}

