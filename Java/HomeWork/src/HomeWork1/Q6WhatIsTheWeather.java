/*  HomeWork1 한국 표준에 따라 날짜가 봄, 여름, 가을, 겨울인지 알려주는 프로그
 *  File: WhatIsTheWeather.java
 *  2023-03-27
 * 	Implemeted by Heejune Kim
 */
package HomeWork1;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Q6WhatIsTheWeather {

	public static void main(String[] args) {
		// 날짜 포멧과 날짜, 문자열로 나타낼 문자열과, 실제 계산에 사용할 인스턴스 선
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String now = dateFormat.format(date);
		String nowWeather;

		// Compute. 문자열을 잘라서 몇 월인지 파악한다. 
		now = now.substring(now.indexOf('-') + 1);
		int nowMonth = Integer.parseInt(now.substring(0, now.indexOf('-')));

		// Compute. 계절확
		switch (nowMonth / 3) {
		case 1:
			nowWeather = "봄";
			break;
		case 2:
			nowWeather = "여름";
			break;
		case 3:
			nowWeather = "가을";
			break;
		default:
			nowWeather = "겨울";
		}

		// Output. 
		JOptionPane.showMessageDialog(null, "It's " + nowWeather + " now.");
	}
}
