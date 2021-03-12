package ex04controlstatement;

public class Qu_04_09 {

	public static void main(String[] args) {

		for(int a=1 ; a<=9 ; a++) {
			for(int b=2 ; b<=9 ; b++) {
				System.out.print(b + "*" + a + "=" + b*a + " ");
			}
			System.out.println();
		}
		
		//su가 고정된 상태에서 dan이 증가하는 형태로 구성한다.
		for(int su=1 ; su<=9 ; su++) {
			for(int dan=2 ; dan<=9 ; dan++) {
				
				System.out.printf("%2d*%2d=%2d ", dan, su, (dan*su));
			}
			System.out.println();
		}
		
		
	}
}