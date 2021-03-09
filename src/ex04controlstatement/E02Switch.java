package ex04controlstatement;

import java.util.Scanner;

public class E02Switch {

	public static void main(String[] args) {

		/*
		Scanner클래스
			: JDK5.0부터 추가된 클래스로 키보드를 통해 사용자로부터 값을 입력받을때 사용한다.
			nextLine() : 문자열을 입력받음
			nextInt() : 정수를 입력받음
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.");
		int iNum = scanner.nextInt();
		System.out.println("입력한 숫자는:"+ iNum);
		
		int remain = iNum % 3;
		
		switch (remain) {
		case 0:
			System.out.println("나머지는 0입니다.");
			break;
		case 1:
			System.out.println("나머지는 1입니다.");
			break;
		default:
			System.out.println("나머지는 2입니다.");
		}
		
		String title = "자바";
		switch(title) {
		case "자바":System.out.println("자바 좋아");
			break;
		case "JAVA":System.out.println("JAVA Goood");
			break;
		}
		
		int season = 4;
		switch(season) {
		case 3:case 4:case 5: // => if(season==3 || season==4 || .....)
			System.out.println("봄입니다.");
			break;
		case 6:case 7:case 8:case 9:
			System.out.println("여름입니다.");
			break;
		case 10:
			System.out.println("가을입니다.");
			break;
		case 11:case 12:case 1:case 2:
			System.out.println("겨울입니다.");
		}
	}
}