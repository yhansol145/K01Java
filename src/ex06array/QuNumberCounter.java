package ex06array;
/*
문제1) 파일명 : QuNumberCounter.java
다음에 주어진 answer 배열에는 1~4까지의 정수가 여러개 저장되어 있다. 
배열 전체의 데이터를 읽어서 각 정수가 몇개씩 있는지 카운트하여 counter 
배열에 순서대로 저장하시오.

샘플코드]
int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
int[] counter = new int[4];


실행결과]
counter[0] => 3
counter[1] => 2
counter[2] => 2
counter[3] => 4
 */
public class QuNumberCounter {

	public static void main(String[] args) {
		
		//문제에서 주어진 샘플코드
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
		//배열을 선언하면 각 요소값이 자동으로 0으로 초기화된다.
		int[] counter = new int[4];
		
		//배열의 크기만큼 반복하면서 순차적으로 요소에 접근함
		for(int i=0 ; i<answer.length ; i++) {
			//만약 1이라면 0번 인덱스를 하나 증가시킨다.
			if(answer[i]==1) counter[0]++;
			else if(answer[i]==2) counter[1]++;
			else if(answer[i]==3) counter[2]++;
			else if(answer[i]==4) counter[3]++;
		}
		
		//counter 배열 출력
		for(int i=0 ; i<counter.length ; i++) {
			System.out.printf("counter[%d] (%d)의 갯수:%d\n",
					i, i+1, counter[i]);
		}
		
		
		//========================================================
		
		
		for(int i=0 ; i<answer.length ; i++) {
			switch(answer[i]) {
			case 1:
				counter[0]++;
				break;
			case 2:
				counter[1]++;
				break;
			case 3:
				counter[2]++;
				break;
			case 4:
				counter[3]++;
				break;
			}
		}
		for(int i=0 ; i<4 ; i++) {
			System.out.println(counter[i]);
		}
	}

}
