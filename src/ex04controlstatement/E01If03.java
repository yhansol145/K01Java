package ex04controlstatement;

public class E01If03 {

	public static void main(String[] args) {

		int kor=99, eng=70, math=64;
		double avg = (kor+eng+math) / 3.0; //실수의 결과를 얻기위해 3.0으로 나눔
		System.out.println("평균점수는(그대로):"+ avg);
		System.out.printf("평균점수는(소수2자리):%.2f\n", avg);
		
		if(avg>=90) {
			System.out.println("A학점");
		}
		else if(avg>=80) {
			System.out.println("B학점");
		}
		else if(avg>=70) {
			System.out.println("C학점");
		}
		else if(avg>=90) {
			System.out.println("D학점");
		}
		else {
			System.out.println("F학점. 학사경고ㅜㅠ;");
		}
		
		System.out.println("잘못된 조건식의 if문");
		if(avg>=60) {
			System.out.println("D학점");
		}
		else if(avg>=70) {
			System.out.println("C학점");
		}
		else if(avg>=80) {
			System.out.println("B학점");
		}
		else if(avg>=90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("F학점. 학사경고ㅜㅠ;");
		}
	}
}
