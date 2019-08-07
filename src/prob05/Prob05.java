package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );

		int minNumber = 1;
		int maxNumber = 100;
		Random random = new Random();
		int correctNumber = random.nextInt(maxNumber) + minNumber;
		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		int count = 1;
		
		
		while(true) {
			// 정답 랜덤하게 만들기
			System.out.println(minNumber + "-" + maxNumber);
			
			System.out.print( count + ">>" );
			int input = scanner.nextInt();
			
			if(input < correctNumber) {
				System.out.println("더 높게");
				minNumber = Math.max(minNumber, input);
			}else if(input > correctNumber) {
				System.out.println("더 낮게");
				maxNumber = Math.min(maxNumber, input);				
			}else if(input == correctNumber) {
				System.out.println("맞았습니다");
				System.out.print("다시하시겠습니까(y/n)>>");
				String yn = scanner.next();
				
				if(yn.equals("y")) {
					count = 1;
					minNumber = 1;
					maxNumber = 100;
					correctNumber = random.nextInt(maxNumber) + minNumber;
					System.out.println("");
					System.out.println("수를 결정하였습니다. 맞추어 보세요");
					continue;
				}else if(yn.equals("n")) {
					break;
				}
				
			}
			count++;
		}
		scanner.close();		
	}
}