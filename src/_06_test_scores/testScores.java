package _06_test_scores;

import javax.swing.JOptionPane;

public class testScores {
public static void main(String[] args) {
	double grade = Double.parseDouble(JOptionPane.showInputDialog(null, "What is you test score?"));
	if(grade >= 90) {
		JOptionPane.showConfirmDialog(null, "Amazing");
	}else {
		JOptionPane.showConfirmDialog(null,"You Suck");
	}
}
}

