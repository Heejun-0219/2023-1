import java.util.Scanner;

public class Chap5Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		double intInput;

		double max =  9999;

		System.out.println("Please input five numeric values:");

		for (int i = 0; i < 5; i++) {
			intInput = scanner.nextDouble();
			if (intInput > max)
				max = intInput;
		}
		System.out.print("Maximum value is : " + max);

		scanner.close();
	}

}