package cdjn;

import java.util.Scanner;

public class Chap4Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 10, secondNum = 5;
		
		// Binary selection grammar
		System.out.println("Difference between two values" 
		+ ((firstNum > secondNum) ? (firstNum - secondNum)
				: (secondNum - firstNum)));
		
		//If conditional statement
		System.out.print("Difference between two values");
		if (firstNum > secondNum) {
			System.out.println(firstNum - secondNum);
		}
		else {
			System.out.println(secondNum - firstNum);
			
		// Input UI
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		System.out.println("Please input the score (0 - 100 scale): ");
		int score = scanner.nextInt();
		
		// Comput.
		switch(score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		
		System.out.println("Grade : " + grade);
		
		int scr = scanner.nextInt();
		char gra;
		
		scr = scr / 10;
		if (scr == 9 || scr == 10)
			gra = 'A';
		else if(scr == 8)
			gra = 'B';
		else if(scr == 7)
			gra = 'C';
		else if(scr == 6)
			gra = 'D';
		else
			gra = 'F';
		
		System.out.println("Grade : " + gra);
		}
	}

}
