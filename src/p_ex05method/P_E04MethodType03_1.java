package p_ex05method;

import java.util.Scanner;

/*
시나리오] 사용자가 입력한 2개의 시작값과 끝값사이에 있는
	수를 모두 더해 출력하는 프로그램 작성
		출력결과]
			시작값 : 5
			종료값 : 9
			결과 : 5+6+7+8+9 = ?
 */
public class P_E04MethodType03_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작값 입력 :");
		int s = sc.nextInt();
		System.out.println("종료값 입력 :");
		int e = sc.nextInt();
		yesParamNoReturn(s, e);
	}
	
	public static void yesParamNoReturn(int startNum, int endNum) {
		
		int sum = 0;
		
		for(int i=startNum ; i<=endNum ; i++) {
			sum += i;
			
		}
		
		System.out.printf("%d~%d 까지의 합은 : %d",startNum, endNum, sum);
		
	}
	
}
