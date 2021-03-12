package ex05method;

import java.util.Scanner;

public class QuCircleCalculator {
	//원의 넓이와 둘레는 원주율 3.14를 곱해야 하므로 
	//실수로 정의한다.
	
	//넓이
	static double circleArea(double rad) {
	
		double result = 3.14 * rad * rad;
		return result;
	}
	
	
	//둘레
	static double circleRound(double rad) {
		
		return 2 * 3.14 * rad;
	}

	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("원의넓이:"+ circleArea(10.2));
		System.out.println("원의둘레:"+ circleRound(12.5));
		int Num = scanner.nextInt();
		
		circleArea(Num);
		circleRound(Num);
	}

}
