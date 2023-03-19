import java.text.SimpleDateFormat;
import java.util.Date;

public class Ch2Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4, sdf5;
		
		sdf1 = new SimpleDateFormat("MM/dd/yy");
		System.out.println(sdf1.format(today));
		
		sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf2.format(today));
		
		sdf3 = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf3.format(today));
		
		sdf4 = new SimpleDateFormat("HH:mm:ss a");
		System.out.println(sdf4.format(today));
		
		sdf5 = new SimpleDateFormat("HH:mm:ss a, E");
		System.out.println(sdf5.format(today));
	}

}
