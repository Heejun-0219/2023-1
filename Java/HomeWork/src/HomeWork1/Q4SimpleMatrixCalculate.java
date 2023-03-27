/*  HomeWork1 사용자로부터 총 9개의 정수를 입력받아 다음과 같은 형식으로 입력값과 함께, 행 합, 열 합, 총 합을 출력하는 프로그램
 *  File: SimpleMatrixCalculate.java
 *  2023-03-27
 * 	Implemeted by Heejune Kim
 */

package HomeWork1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4SimpleMatrixCalculate {

	public static void main(String[] args) {
		// 스캐너와 합을 계산할 부분과 값이 들어갈 행렬을 선언
		Scanner scanner = new Scanner(System.in);
		int[][] matrix = new int[4][4];

		try {
			// 행을 기준으로 0번째 행을 채운 후, 1번째 행을 채우는 방식을 사용했다.
			System.out.print("Please input nine integers: ");
			for (int i = 0; i < matrix.length - 1; i++) {
				for (int j = 0; j < matrix[i].length - 1; j++) {
					matrix[i][j] = scanner.nextInt();
					// Row Sum 
					matrix[i][3] += matrix[i][j];
					// Column Sum
					matrix[3][j] += matrix[i][j];
				}
				// 마지막 Row sum 계산
				matrix[3][3] += matrix[i][3];
			}

			// 행렬의 형태로 출
			System.out.println("\t\t\t\t\tRow Sum");
			for (int i = 0; i < matrix.length; i++) {
				if (i == 3) 
					System.out.print("Column Sum");
				else
					System.out.print("\t");
				for (int j = 0; j< matrix[i].length; j++) {
					System.out.print("\t" + matrix[i][j]);
				}
				System.out.println();

				// 스캐너 마무리
				scanner.close();
			}
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력해야합니다.");
			e.printStackTrace();
			scanner.close();
		}
	}

}
