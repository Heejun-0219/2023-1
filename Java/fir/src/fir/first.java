package fir;
import javax.swing.JOptionPane;

public class first {

	static final double PI = 3.14592;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String.valueOf(value) -> String
		// String -> xxx | Interger.parseInt(value) | Double.parseDouble(value)
		double radius, area, circumference;
		
		// Input Part 
		String radiusStr = JOptionPane.showInputDialog(null, "Enter radius: ");
		
		radius = Double.parseDouble(radiusStr);
		
		//compute area and circumference
		area = PI * radius * radius;
		circumference = 2.0 * PI * radius;
		
		// Output part 
		JOptionPane.showMessageDialog(null , "Given Radius : " + radius + "\n" + "Area : " + area + "\n" + "Circumference :" + circumference + "\n" );
	
	}

}
