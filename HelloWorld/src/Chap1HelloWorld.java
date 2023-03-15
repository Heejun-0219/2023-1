/*
 *	File name : Chap1HelloWorld.java
 *	This is program to simply show the your input name with Hello World!
 *	2023-03-13
 *	Heejune Kim
 *
 *	파일 이름 + 어떤 일을 하는 파일인지 + 누가 개발한 파일인지 + 개발한 날짜 ( + 버전 x.x.x) 
 */

// top part + golden naming
import javax.swing.JOptionPane;
// import line 
/*
 * javax ( swing ( JOptionPane 
 * .*을 사용해도 컴파일러가 사용할 때만 램에 작업하므로 지금 상태에서는 상관이 없다. 
 */

public class Chap1HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스 이름 대문자 시작 
		// 변수 이름 소문자 시작 (다음 문자부터는 대문자 시작) 
		System.out.println("HelloWorld"); // System == class
		//		System.out.println("HelloWorld"); (cmd + /) 줄 주석처리
		//		crtl + cmd + / 세 줄 주석처리 <-> crtl + cmd + \
		// cmd + i 들여쓰
		//		template 추가하

		// gc라고 하는 가비지 콜렉터가 프로그램을 지켜보다가 쓰레기가 발견되면 해결해준다. + 개발자가 메서드를 사용하여 정리 가능 

		String firstName = JOptionPane.showInputDialog(null, "please Enter the your first name");
		String lastName = JOptionPane.showInputDialog(null, "please Enter the your last name");
		//		골든스탠다드 클래스 == 두 개의 대문자로 시작한다. 

		JOptionPane.showMessageDialog(null, "Hello world! \n\t\b"+ firstName + " " + lastName);
		// string.indexOf() == 대소문자 구분을 한다. 
		//		문자열 + 문자열 

		System.out.println(firstName.length());
	}

}
// 어떤 객체에 어떤 인스턴스와 메서드를 가지는 지를 바로 확인 할 수 있다.
// 메서드 = 메세지, 클래스 = 오브젝트 