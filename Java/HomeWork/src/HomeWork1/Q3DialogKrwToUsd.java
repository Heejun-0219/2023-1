/*  HomeWork1 다이얼로그를 통해 원화를 달러로 변환하는 GUI 프로그램을 작성하십시오. 환율은 $1당 1295.83로 가정합니다.
 *  File: DialogKrwToUsd.java
 *  2023-03-27
 * 	Implemeted by Heejune Kim
 */


package HomeWork1;

import java.text.ParseException;

import javax.swing.JOptionPane;

public class Q3DialogKrwToUsd {

	public static void main(String[] args) {
		try {
			// 입력받을 Won은 문자열로, 변환 값이 담길 Dollar는 실수형으로 선언한다. 
			String moneyWon = JOptionPane.showInputDialog(null, "Please input the Korean Won: ");
			double moneyDollar;
	
			// 원을 달러로 변환한다. 이때, 숫자가 아닌 다른 값이 입력되면 예외처리 해준다. 
			moneyDollar = Double.parseDouble(moneyWon) / 1295.83;
			
			// 계산된 달러를 출력한다. 
			JOptionPane.showMessageDialog(null, moneyDollar + "$ ( 1$ = 1295.85won )");
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "숫자만 입력해야합니다.");
			e.printStackTrace();
		}
	}

}
