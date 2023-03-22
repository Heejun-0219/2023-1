package cdjn;

import javax.swing.JOptionPane;

public class Chap4Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStr;
		int age;

		inputStr = JOptionPane.showInputDialog(null, "Please enter your age (0-130 scale)");
		age = Integer.parseInt(inputStr);

		while (age < 0 || age > 130) {
			JOptionPane.showMessageDialog(null, "Invaild age was enterred. Please try again");

			// input exception handling 
			inputStr = JOptionPane.showInputDialog(null, "Please enter your age (0-130 scale)");
			age = Integer.parseInt(inputStr);
		}
		
		do {
			age = Integer.parseInt(JOptionPane.showInputDialog(null, "enter age"));
			if (age < 0 || age > 130) JOptionPane.showMessageDialog(null, "invaild age");
		} while (age < 0 || age > 130);
	}

}
