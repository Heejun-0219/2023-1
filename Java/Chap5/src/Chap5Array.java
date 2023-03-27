
public class Chap5Array {

	final static double PI = 3.141592;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] multipleValues = {1,2,3,4,5}; // {1,2,3,4,5};
		int[] duplicateArray = multipleValues;
		//int multipleValues[] = {1,2, 3, 4, 5};
		duplicateArray[0] = 10;
		
		for (int i=0; i<multipleValues.length; i++)
			System.out.println(multipleValues[i]);
	}

}
