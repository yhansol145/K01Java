package p_ex05method;

import java.util.Scanner;

/*
시나리오] 인원수를 매개변수로 전달받고 전달받은 인원의 나이도 입력받아
	그 나이의 합을 반환하는 메소드를 작성하시오.
 */
public class P_E05MethodType04_1 {

	public static void main(String[] args) {
		
		System.out.println("입력받은 나이의 합은? "+ getTotalAge(5));
		
	}
	
	public static int getTotalAge(int personCnt) {
		
		Scanner sc = new Scanner(System.in);
		
		int sumAge=0;
		
		for(int i=1 ; i<=personCnt ; i++) {
			System.out.println(i+"번째 사람의 나이");
			int age = sc.nextInt();
			sumAge += age;
		}
		return sumAge;
	}

}
