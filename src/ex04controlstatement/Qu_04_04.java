package ex04controlstatement;
/*
문제4)다음 예제는 두개의 if문을 사용하고 있다.이를 하나의 if문으로 변경해보자
public static void main(String[] args)
{
	 int num = 120;
	 if (num > 0) {
		if ((num % 2) == 0) {
			System.out.println("양수이면서 짝수");
		}
	 }
}
 */
public class Qu_04_04 {

	public static void main(String[] args) {

		int num = 120;
//		if (num > 0) {
//			if ((num % 2) == 0) {
//				System.out.println("양수이면서 짝수");
//			}
//		 }
		
		// 2개의 조건을 동시에 만족해야 하므로 논리 And 연산자로 묶어준다.
		if (num>0 && (num%2) == 0) {
			System.out.println("양수이면서 짝수");
		}
	}

}
