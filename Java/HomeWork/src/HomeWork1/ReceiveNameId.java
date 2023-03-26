/*
 *  HomeWork1 receive Name & Id: Dialog로 부터 이름/학번 입력 받아 출력하기
 *  File: ReceiveNameId.java
 *  2023-03-25
 * 	Implemeted by Heejune Kim
 */
package HomeWork1;

import javax.swing.JOptionPane;

public class ReceiveNameId {

	public static void main(String[] args) {
		// Name & Student ID를 받을 변수 생성 
		String name;
		int studentId = 0;
		// 이름과 아이디를 한번에 받아서 처리하기 위한 변수 선언
		String dialogInput;
		// 문자 /를 기준으로 이름과 아이디를 나누어 주기 때문에 구분자를 사용하기 위한 변수 선언
		String separator = "/";
		
		// Dialog를 통해 이름과 아이디를 입력받는다.
		dialogInput = JOptionPane.showInputDialog(null, "Enter your name & student ID (i.e. Minseok Seo /  12345678");
		System.out.println(dialogInput);
		
		// String 클래스의 substr 메서드를 사용해서 이름과 아이디를 나눈다. 
		name = dialogInput.substring(0, dialogInput.indexOf(separator));
		dialogInput = dialogInput.substring(dialogInput.indexOf(separator) + 1, dialogInput.length());
		
		// dialogInput 변수에 남아있는 아이디를 인덱스를 확인하면서 아이디릐 합을 구한다.
		for (int i = 0; i < dialogInput.length(); i++) {
			if (dialogInput.charAt(i) != ' ')
				studentId += Integer.parseInt(dialogInput.substring(i, i + 1));
		}
		
		// 이름과 아이디 출력 
		System.out.println("Hello OOP World! " + name);
		System.out.println("The sum of each number of your student number entered is " + studentId);
	}

}
