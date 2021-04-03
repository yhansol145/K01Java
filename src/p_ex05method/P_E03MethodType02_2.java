package p_ex05method;

import java.util.Scanner;

public class P_E03MethodType02_2 {
	
	static String getHakjum() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("국어점수:");
		int kor = sc.nextInt();
		System.out.printf("영어점수:");
		int eng = sc.nextInt();
		System.out.print("수학점수:");
		int math = sc.nextInt();
		
		double avg = (kor+eng+math)/3.0;
		
		String hakjum;
		
		int result = (int)avg/10;
		
		switch(result) {
		case 10: case 9:
			hakjum = "A학점";
			break;
		case 8:
			hakjum = "B학점";
			break;
		case 7:
			hakjum = "C학점";
			break;
		case 6:
			hakjum = "D학점";
			break;
		default:
			hakjum = "F학점";
		}
		return hakjum;
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("너의학점은 "+getHakjum());
		String h = getHakjum();
		System.out.println(h);
	}

}
