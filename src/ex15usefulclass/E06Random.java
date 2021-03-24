package ex15usefulclass;

import java.util.Random;

public class E06Random {

	public static void main(String[] args) {
		
		/*
		컴퓨터는 인자로 전달되는 Seed(씨앗)를 기반으로 난수를 생성한다.
		만약 Seed값이 동일하다면 항상 동일한 패턴의 난수만 생성되는데
		이를 가르켜 가짜난수(Pseudo-random number)라고 한다.
		 */
		System.out.println("### 난수생성1 : seed로 32를 사용");
		Random random1 = new Random(32);
		for(int i=0 ; i<10 ; i++) {
			/*
			nextInt()의 인자값 100이 전달되면 0~99사이의
			난수가 생성된다.
			 */
			System.out.println(random1.nextInt(100));
		}
		
		//정상적으로 난수 생성됨
		System.out.println("### 난수생성2 : seed 없음");
		Random random2 = new Random();
		for(int i=0 ; i<10 ; i++) {
			System.out.println(random2.nextInt(100));
		}
		
		System.out.println("### 난수생성3 : 항상 다른 seed를 사용");
		Random random3 = new Random();
		//현재 시간을 밀리 초 단위로 반환하는 메소드를 이용해서 seed를 설정함
		random3.setSeed(System.currentTimeMillis());
		for(int i=0 ; i<10 ; i++) {
			System.out.println(random3.nextInt());
		}
		
		System.out.println("### 난수생성4 : 항상 다른 seed를 사용, nextInt() 인자없음");
		Random random4 = new Random();
		//현재 시간을 밀리 초 단위로 반환하는 메소드
		random4.setSeed(System.currentTimeMillis());
		for(int i=0 ; i<10 ; i++) {
			/*
			nextInt()에 인자값이 없는 경우에는 음수, 양수가 혼용되어
			난수가 생성된다.
			 */
			System.out.println(random4.nextInt());
		}
		
	}

}
