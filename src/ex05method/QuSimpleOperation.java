package ex05method;

import java.util.Scanner;

/*
문제5-1) 파일명 : QuSimpleOperation.java (난이도:하)
두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
파라메타로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
 */
public class QuSimpleOperation {

	static void arithmetic(int x, int y) {
		System.out.println("덧셈결과 ->" +" " +(x+y));
		System.out.println("뺄셈결과 ->" +" " +(x-y));
		System.out.println("곱셈결과 ->" +" " +(x*y));
		System.out.println("나눗셈 몫 ->" +" " +(x/y));
		System.out.println("나눗셈 나머지 ->" +" " +(x%y));
		//'printf' 에서 %기호를 콘솔에 출력하기 위해서 이스케이프 시퀀스를 사용함

	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 양의정수 입력:");
		int sNum = scanner.nextInt();
		System.out.println("두번째 양의정수 입력:");
		int eNum = scanner.nextInt();
		
		arithmetic(sNum, eNum);

	}

}
