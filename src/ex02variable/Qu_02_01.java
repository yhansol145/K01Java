package ex02variable;
/*
문제1] 파일명 : Qu_02_01.java
1.국어, 영어, 수학점수 및 과목의 총점을 저장할수 있는 변수를 선언하시오.
2.국어 89점, 영어 99점, 수학 78점을 대입한다.
3.국영수 총합을 구해서 총점을 저장할 변수에 대입한다.
4.총합점수를 출력한다.
 */
public class Qu_02_01 {

	public static void main(String[] args) {

		int kor=89, eng=99, math=78;
		int total;
		
		total = kor + eng + math;
		
		System.out.printf("국어:%d, 영어:%d, 수학:%d%n", kor, eng, math);
		System.out.println("총점:"+ total);
		
//		int kor = 89;
//		int eng = 99;
//		int math = 78;
//		int sum = kor+eng+math;
//		System.out.print("국어:" +kor +", "+"영어:" +eng +", "
//				+ ""+"수학:" +math +"\n" +"총점:" +sum);

//		주석표시 : Self;

	}
}