<<<<<<< HEAD
package ex04controlstatement;

public class Qu_04_08 {

	public static void main(String[] args) {

		for (int a=1 ; a<=5 ; a++) {
			for (int b=1 ; b<=5 ; b++) {
				if(b>=a) {
					System.out.print("*");
				}
				else {
					System.out.print("");
				}
			}
			System.out.println("");
		}
		
		//*를 출력한 행의 갯수를 상수로 표현
		final int FLOOR = 5;
		
		/*
		FLOOR(행의갯수) - x + 1
			: 변수 x가 증가함에 따라 점점 감소하는 y를
			표현하기 위한 일반식 정의
		 */
		for(int x = 1 ; x<=5 ; x++) {
			for(int y = 1 ; y<=(FLOOR-x+1) ; y++) {
				System.out.print("* ");
			}
			//하나의 행을 출력 후 줄바꿈
			System.out.println();
		}
	}
=======
package ex04controlstatement;

public class Qu_04_08 {

	public static void main(String[] args) {

		for (int a=1 ; a<=5 ; a++) {
			for (int b=1 ; b<=5 ; b++) {
				if(b>=a) {
					System.out.print("*");
				}
				else {
					System.out.print("");
				}
			}
			System.out.println("");
		}
		
		//*를 출력한 행의 갯수를 상수로 표현
		final int FLOOR = 5;
		
		/*
		FLOOR(행의갯수) - x + 1
			: 변수 x가 증가함에 따라 점점 감소하는 y를
			표현하기 위한 일반식 정의
		 */
		for(int x = 1 ; x<=5 ; x++) {
			for(int y = 1 ; y<=(FLOOR-x+1) ; y++) {
				System.out.print("* ");
			}
			//하나의 행을 출력 후 줄바꿈
			System.out.println();
		}
	}
>>>>>>> refs/remotes/origin/master
}