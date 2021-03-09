package ex04controlstatement;

public class E03While {

	public static void main(String[] args) {

		int sum = 0;
		int i=1;
		while(i<=10) { //반복의 조건 설정
			sum += i; //증가하는 i를 sum에 누적해서 더함(1+2+3....)
			i++; //while문을 탈출하기 위한 조건을 위한 증가연산
		}
		System.out.println("1~10까지의 합은:"+ sum);
		
		int dan = 2; //단
		while(dan<=9) { //단은 2~9까지 증가한다.
			int su = 1; //수(하나의 단을 출력한 후 증가하면 수는 1로 초기화된다.)
			while(su<=9) { //수는 1~9까지 증가한다.
				
				System.out.printf("%-2d*%-2d=%2d", dan, su, (dan*su));
				System.out.print(" ");
				su++;
			}
			System.out.println();
			dan++;
		}
		System.out.println("\n===========================\n");
	}
}