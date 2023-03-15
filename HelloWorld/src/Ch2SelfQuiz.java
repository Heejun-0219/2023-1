import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Ch2SelfQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = JOptionPane.showInputDialog(null, "First of Firstname");
		String second = JOptionPane.showInputDialog(null, "Second of Firstname");
		String third = JOptionPane.showInputDialog(null, "Lastname");
		
		Date data = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("(yyyy-MM-dd)");
		System.out.println(first.substring(0, 1) + second.substring(0, 1) + third.substring(0, 1) + sdf.format(data));
	}

}
// 설명 추가하기 