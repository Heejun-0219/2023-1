/*
 *	File name : Ch2Sample1.java
 *	This is program to simply ~~
 *	2023-03-13
 *	Heejune Kim
 */
import javax.swing.JFrame;

public class Ch2Samle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		코멘트 추가하기 
		/*
		 * JFrame myWindow;
		 * 
		 * myWindow = new JFrame();
		 */
		//Generate window objects from the JFrame class
		JFrame myWindow = new JFrame();
		JFrame secondWindow = new JFrame();

		// For the window1 object
		myWindow.setSize(300,200);
		myWindow.setTitle("My First Java Program");
		myWindow.setVisible(true);

		//		For the window2 object
		secondWindow.setSize(100,200);
		secondWindow.setTitle("secondwindow");
		secondWindow.setVisible(true);
	}

}
