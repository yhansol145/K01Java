package p_ex05method;
/*
문제5-2) 파일명 : QuCircleCalculator.java (난이도:중)
원의 반지름을 파라메타로 전달하면 원의넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자. 이를 호출하는 main 메소드를 정의하라.

메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
-넓이공식 : 3.14 * 반지름 * 반지름
-둘레공식 : 2 * 3.14 * 반지름


실행결과]
원의 둘레(5.5) : 34.54
원의 넓이(5.5) : 94.985
 */
public class QuCircleCalculator {
	
	static double circleArea(double rad) {
		double area = 3.14 * rad * rad;
		return area;
	}
	
	static double circleRound(double rad) {
		double round = 2 * 3.14 * rad;
		return round;
	}
	
	public static void main(String[] args) {
		System.out.println("원의둘레:"+ circleRound(5.5));
		System.out.println("원의넓이:"+ circleArea(5.5));
	}
}

