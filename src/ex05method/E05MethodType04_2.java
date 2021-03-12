<<<<<<< HEAD
package ex05method;

import java.util.Scanner;

public class E05MethodType04_2 {

	public static void main(String[] args) {

		int maxValue1 = returnMaxNumber(4);
		System.out.println("최대값1:"+ maxValue1);
		
		int maxValue2 = returnMaxNumber(6);
		System.out.println("최대값2:"+ maxValue2);
	}
	
	//최대값을 구하여 반환하는 메소드
	static int returnMaxNumber(int numberCnt) {
		Scanner scanner = new Scanner(System.in);
		
		//최대값을 저장할 변수
		int maxVal = 0;
		//매개변수(numberCnt)만큼 반복하여 입력받음
		for(int i=1 ; i<=numberCnt ; i++) {
			System.out.print("정수를 입력하세요:");
			int inputNum = scanner.nextInt();
			
			if(i==1) {
				//입력받은 숫자중 첫번째값을 기준값으로 설정한다.
				maxVal = inputNum;
			}
			else {
				//두번째 입력값부터 maxVal과 비교한다.
				if(maxVal<inputNum) {
					//만약 maxVal보다 입력값이 크다면 입력값으로 교체한다.
					maxVal = inputNum;
				}
				//maxVal이 더 크다면 기존값을 유지하면 되므로 else는 필요없다.
			}
		}
		
		return maxVal;
	}

}
=======
package ex05method;

import java.util.Scanner;

public class E05MethodType04_2 {

	public static void main(String[] args) {

		int maxValue1 = returnMaxNumber(4);
		System.out.println("최대값1:"+ maxValue1);
		
		int maxValue2 = returnMaxNumber(6);
		System.out.println("최대값2:"+ maxValue2);
	}
	
	//최대값을 구하여 반환하는 메소드
	static int returnMaxNumber(int numberCnt) {
		Scanner scanner = new Scanner(System.in);
		
		//최대값을 저장할 변수
		int maxVal = 0;
		//매개변수(numberCnt)만큼 반복하여 입력받음
		for(int i=1 ; i<=numberCnt ; i++) {
			System.out.print("정수를 입력하세요:");
			int inputNum = scanner.nextInt();
			
			if(i==1) {
				//입력받은 숫자중 첫번째값을 기준값으로 설정한다.
				maxVal = inputNum;
			}
			else {
				//두번째 입력값부터 maxVal과 비교한다.
				if(maxVal<inputNum) {
					//만약 maxVal보다 입력값이 크다면 입력값으로 교체한다.
					maxVal = inputNum;
				}
				//maxVal이 더 크다면 기존값을 유지하면 되므로 else는 필요없다.
			}
		}
		
		return maxVal;
	}

}
>>>>>>> refs/remotes/origin/master
