package cdjn;

import java.util.Date;

public class Chap4Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date startTime = new Date();
		
		// nested-for
		for (int i = 0; i <= 100000; i++) {
			for (int j = 0; j <= 100000; j++) {
				for (int k=0; k <= 100000; k++) {
					
				}
			}
		}
		
		Date endTime = new Date();
		
		long elapedTimeInMilliSec = 
				endTime.getTime() - startTime.getTime();
		
		System.out.println("elapsedTime : " + elapedTimeInMilliSec);
	}

}
