package ex04controlstatement;

public class E01If02 {

	public static void main(String[] args) {

		int num = 101;
		
		if(num%2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		
		String numberResult = (num%2==0) ? "짝수임":"홀수임";
		System.out.println("숫자 "+num+"은 "+ numberResult);
		
		int num2 = 120;
		if(num2%2 == 0) { // 짝수일때...
			if(num2>=100) {
			System.out.println("짝수이면서 100이상");
		}
			else {
				System.out.println("짝수이면서 100미만");
			}
		}
		else { // 홀수일때...
			if(num2>=100) {
				System.out.println("홀수이면서 100이상");
			}
			else {
				System.out.println("홀수이면서 100미만");
			}
		}

	}
}
