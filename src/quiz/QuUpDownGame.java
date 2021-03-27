package quiz;

import java.util.Random;
import java.util.Scanner;

/*
게임설명 : 업다운게임을 메소드를 이용해 구현한다.
컴퓨터는 1~100사이의 숫자 하나를 생성한다.
총 시도횟수는 7번을 부여한다.
사용자는 7번의 시도안에 숫자를 맞춰야 한다.
사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
함수를 사용하여 구현한다.
무한루프에 빠지게 된다면 scan.nextLine()을 활용하여 버퍼에 남아있는 Enter키를 제거해주도록 하자.

업다운 게임에 다음 조건에 맞는 예외처리 구문을 추가하시오.
숫자입력시 1~100을 벗어난 경우 사용자정의 예외클래스를 통해 처리하시오
클래스명 : NumberRangeException
게임 재시작 / 종료 입력시 문자를 입력했을때 발생되는 예외를 처리하시오.
 */

class NumberRangeException extends Exception {
	
	public NumberRangeException() {
		
		super("1~100 중에 입력해라");
	}
}


public class QuUpDownGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int count = 0;
		
		while(true) {
			
			try {
				
				System.out.println("숫자를 말해보거라");
				

				int user = sc.nextInt();
				int com = random.nextInt(100)+1;
				System.out.println(com);
				
				if(user>100 || user<0) {
					NumberRangeException badNum = new NumberRangeException();
					throw badNum;
				}
				
				if(user>com) {
					System.out.println("Down~~");
					count++;
				}
				else if(user<com) {
					System.out.println("Up~~");
					count++;
				}
				else if(user==com) {
					System.out.println("Success!");
					break;
				}
				else
					System.out.println("Fail!");
				
				
				if(count==7) {
					System.out.println("One more? press'1', No? press'0'");
					int re = sc.nextInt();
					if(re==1) {
						continue;
					}
					else if(re==0) {
						break;
					}
				}
				
			}
			
			catch(NumberRangeException e) {
				sc.nextLine();
				System.out.println("1~100 중에 입력");
			}
			
		}
		
	}

}
