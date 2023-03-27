 /*  HomeWork1 JOptionPane, String, Date, SimpleDateFormat 클래스와 조건문 구문을 포함한 프로그램 만들기
 *  File: MakeTopicwithClass.java
 *  2023-03-25
 * 	Implemeted by Heejune Kim
 */

package HomeWork1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Q2MakeTopicwithClass {

	public static void main(String[] args) {
		try {
			// SimpleDateFormat 지정을 위한 포멧 변수 선언 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			// 결과를 출력하기 위한 이름과 생년월일을 입력받을 변수 선언
			String name = JOptionPane.showInputDialog(null, "Enter your name");
			String inputBirth = JOptionPane.showInputDialog(null, "Enter your Birthday (i.e. 2001-02-19)");
			
			// 계산을 위해 현재 날짜와 생년월일의 데이터를 Date 변수에 선언
			Date now = new Date();
			Date birth = dateFormat.parse(inputBirth);
			// 실질적인 계산을 위해 Long형 변수에 값을 대입하고 계산한다. 
			Long nowTime = now.getTime();
			Long birthTime = birth.getTime();
			// 밀리세크, 초, 분, 시간을 계산해준다. 
			Long birthFromDay = (nowTime - birthTime) / (1000 * 60 * 60 * 24) + 1;
			
			// 이름과 일자 출력 
			System.out.print(name + "님은 ");
			System.out.println("태어난 지 : " + birthFromDay + "일째");
		}
		catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "숫자만 입력해야합니다.");
			e.printStackTrace();
		}
	}

}

// JoptionPane : String 입력 받기 
// Date : simpledateformat a 오전오후, E 요일 yMd	Hms Date o = new Date() | SimpleDateFormat p = new SimpleDateFormat("") | p.format(o)
