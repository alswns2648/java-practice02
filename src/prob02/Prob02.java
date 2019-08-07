package prob02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println( "5개의 숫자를 입력하세요." );
		
		int intArray[] = new int[5];
			
		double sum = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]=scanner.nextInt();
			sum += intArray[i];
		}		
		
		for(int i=0; i < intArray.length; i++) {
			sum += intArray[i]; 
			System.out.println(intArray[i]);
		}
		
		double average = sum / intArray.length;
		System.out.println("평균은" + average + "입니다.");
		scanner.close();
	}
}
