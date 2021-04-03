package p_ex05method;

import java.util.Scanner;

public class P_E01MethodBasic {
	
	public static int simpleFunc(int a, int b) {
		int sum = a + b;
		return sum;
		
	//메소드정의1 : 반환형O 매개변수O 형태로 정의
		// -> 두개의 정수를전달받아 합의 결과를 반환
	}
	
	public static void menuPrint() {
		System.out.println("당신의 이름은 무엇인가요?");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		namePrint(name);
		
	//메소드정의2 : 반환형X 매개변수X 형태로 정의
		// -> 전달되는 값 없이 이름을 입력한 후 namePrint()메소드를
		//	호출한다. 반환값이 없는 경우에는 반드시 'void'라고명시해야 한다.
	}
	
	public static void namePrint(String n) {
		System.out.println("제 이름은 "+ n +" 입니다.");
	//메소드정의3 : 반환형X 매개변수O 형태로 정의
			// -> 반환값이 없는 경우 실행이 종료되면 호출했던 지점으로 돌아간다.
	}
	
	
	public static void main(String[] args) {
		
		int result = simpleFunc(1, 2);
		System.out.println("1과2를 전달한 결과:"+ result);
		System.out.println("10과 20을 전달한 결과:"+ simpleFunc(10, 20));
		
		menuPrint();
		
		
	}

}
