package ex04controlstatement;

public class Qu_04_07 {

	public static void main(String[] args) {
		
		int sum = 0; //누적합을 위한 변수
		//1~100까지 반복
		for(int i=1 ; i<=100 ; i++) {
			//3의배수 이거나 7의배수
			if(i%3==0 || i%7==0) {
				//3과 7의 공배수가 아닌 경우
				if( i%(3*7)!=0 ) {
					sum += i;
					System.out.print(i+" ");
				}
			}
		}
		System.out.println("\n결과:"+ sum);
	}
}

// 반복의 횟수가 정해져있으면 for문 추천
// 반복의 횟수가 정해져있지 않으면 while문 추천