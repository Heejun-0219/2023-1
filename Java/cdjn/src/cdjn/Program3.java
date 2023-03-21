package cdjn;

import java.util.Scanner;

public class Program3 {

	static final int UNIT_CHANGER = 60;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Input UI
		Scanner scanner = new Scanner(System.in); // 스캐너에게 어떤 객체를 확인할 지 알려준다. 
		System.out.println("Please input the seconds unit as interger value:");
		int time = scanner.nextInt();

		// Main Calc.
		int second = time % UNIT_CHANGER;
		int minute = (time / UNIT_CHANGER) % UNIT_CHANGER;
		int hour = (time / UNIT_CHANGER) / UNIT_CHANGER;

		//Output UI
		System.out.print(time + " second is  ");
		System.out.print(hour + "hr., ");
		System.out.print(minute + "min., and ");
		System.out.print(second + " sec.");

	}

}
