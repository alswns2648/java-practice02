package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );
		System.out.print( "금액: " );
		int money = scanner.nextInt();

		int[] intArray = {50000,10000,5000,1000,500,100,50,10,5,1};

		for(int i=0; i<intArray.length; i++) {
			int rest = money / intArray[i];
			System.out.println(intArray[i] + "원" + rest + "개");
			money = money % intArray[i];
		}
		scanner.close();
	}
}