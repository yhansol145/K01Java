package ex04controlstatement;

import java.io.IOException;

public class E01If01 {

	public static void main(String[] args) throws IOException {

		int num = 10;
		
		if(num%2==0) {
			System.out.printf("%d는 짝수입니다.", num);
		}
		if(num%2==0 && num>=10) {
			System.out.printf("%n%d는 짝수이고 10보다 크거나 같다.%n", num);
		}
		
		if(true) {
			System.out.println("무조건 실행되는 if문입니다.");
		}
		
		if(num%2 !=0); 
		{
			System.out.printf("%d는 홀수입니다.", num);
		}
		
		if(num%2 == 0)
			System.out.println("\n"+ num +"은 짝수이다.");
		if(num%2 != 0) {
			System.out.println("num은 "+ num +"입니다.");
			System.out.println(num +"은 홀수입니다.");
		}
		
		System.out.print("하나의 문자를 입력하세요:");
		int asciiCode = System.in.read();
		
		if(asciiCode>=48 && asciiCode<=57) {
			System.out.println("입력한 문자는 숫자입니다.");
		}
		else {
			System.out.println("입력한 문자는 숫자가 아닙니다.");
		}
		
		
		boolean isNumber = (asciiCode>='0' && asciiCode<='9');
		if(isNumber==true) {
			System.out.println("입력한 문자는 숫자입니다.");
		}
		else {
			System.out.println("입력한 문자는 숫자가 아닙니다.");
		}
	} // main 끝

} // class 끝
