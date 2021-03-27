package quiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
파일명 : QuRockPaperScissors.java
게임설명 : 가위바위보 게임을 메소드를 통해 구현한다.
1. 난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다.
2. 사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
3. 승부를 판단하여 출력한다.
4. 1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고 재입력을 요구한다.
5. 숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다.
6. 게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다. 재시작(1), 종료(0)
7. 0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.

 */

/*
무한루프 내에서 예외처리 후 생 문제 해결법 (nextLine();)
 */

class WrongNumberException extends Exception {
	public WrongNumberException() {
		super("1,2,3 중에 입력해라");
	}
}

public class QuRockPaperScissors {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int count = 0;
				
		while(true) {
			
			try {
				
			System.out.println("무엇을 내겠습니까?(1.가위,2.바위,3.보)");
			
			int user = sc.nextInt();
			int com = random.nextInt(3)+1;
			if(user<1 || user>3) {
				WrongNumberException wrongNum = new WrongNumberException();
					throw wrongNum;
			}
			
			if(user==1 && com==1) {
				System.out.println("(유저:가위, 컴퓨터:가위) 비겼습니다.");
			}
			else if(user==1 && com==2) {
				System.out.println("(유저:가위, 컴퓨터:바위) 졌습니다.");
			}
			else if(user==1 && com==3) {
				System.out.println("(유저:가위, 컴퓨터:보) 이겼습니다.");
			}
			else if(user==2 && com==1) {
				System.out.println("(유저:바위, 컴퓨터:가위) 이겼습니다.");
			}
			else if(user==2 && com==2) {
				System.out.println("(유저:바위, 컴퓨터:바위) 비겼습니다.");
			}
			else if(user==2 && com==3) {
				System.out.println("(유저:바위, 컴퓨터:보) 졌습니다.");
			}
			else if(user==3 && com==1) {
				System.out.println("(유저:보, 컴퓨터:가위) 졌습니다.");
			}
			else if(user==3 && com==2) {
				System.out.println("(유저:보, 컴퓨터:바위) 이겼습니다.");
			}
			else if(user==3 && com==3) {
				System.out.println("(유저:보, 컴퓨터:보) 비겼습니다.");
			}
			
			count++;
			
			if(count%5==0) {
				System.out.println("한겜더? 1번, 그만? 0번");
				int re = sc.nextInt();
				if(re==1) {
					continue;
				}
				else if(re==0) {
					break;
				}
			}
		}
		
			catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("1,2,3 중에 입력해라");
			}
			
			catch(WrongNumberException e) {
				System.out.println(e.getMessage());
			}
		}

	}	

}


//가위바위보 게임에 다음 조건에 맞는 예외처리 구문을 추가하시오
//숫자대신 문자를 입력할 경우 발생되는 예외를 처리하시오. (가위바위보 입력시, 재시작여부 입력시)
//게임과 관련없는 숫자를 입력했을때 사용자정의 예외클래스를 통해 처리하시오.
//예외처리 클래스명 : WrongNumberException
