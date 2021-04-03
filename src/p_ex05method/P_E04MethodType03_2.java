package p_ex05method;

import java.util.Scanner;

/*
연습문제] 사용자로부터 2~9사이 숫자중 2개를 입력받아
그에 해당하는 구구단을 출력하는 메소드를 만들거라
무조건 첫번째 숫자가 작아야한다.
예]
	첫번째 숫자 : 3
	두번째 숫자 : 12
	3*1 ~
			12*9=108
메소드명 : inputGugudan(int sNum, int eNum)
 */
public class P_E04MethodType03_2 {
	
	public static void inputGugudan(int sNum, int eNum) {
		
		for(int dan=sNum ; dan<=eNum ; dan++) {
			for(int su=1 ; su<=9 ; su++) {
				System.out.printf("%-2d*%-2d=%-2d", dan, su, (dan*su));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작값 입력해라 : ");
		int s = sc.nextInt();
		System.out.println("종료값 입력해라 :");
		int e = sc.nextInt();
		
		inputGugudan(s, e);
	}
}
