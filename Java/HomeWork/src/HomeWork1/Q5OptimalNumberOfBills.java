/*  HomeWork1 특정 금액을 입력하여 최적의 지폐 개수를 알라져는 프로그램 
 *  File: OptimalNumberOfBills.java
 *  2023-03-27
 * 	Implemeted by Heejune Kim
 */

package HomeWork1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5OptimalNumberOfBills {

	public static void main(String[] args) {
		// 스캐너, 지폐 종류, 몇 장으로 최적화할 지 정해주는 인스턴스 선
		Scanner scanner = new Scanner(System.in);
		int[] kindOfBills = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] valueOfBills = new int[9];

		try {
			// Input
			System.out.print("Please input the money(KRW) : ");
			int moneyWon = scanner.nextInt();

			// Compute
			for (int i = 0; i < kindOfBills.length; i++) {
				valueOfBills[i] = moneyWon / kindOfBills[i];
				moneyWon %= kindOfBills[i];
			}

			// Output
			for (int i = 0; i < kindOfBills.length; i++) {
				if (valueOfBills[i] > 0)
					System.out.print(valueOfBills[i] + "개 " + kindOfBills[i] + "원, ");
			}
			
			// Scanner
			scanner.close();
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력가능힙니다.");
			e.printStackTrace();
			scanner.close();
		}
	}
}
