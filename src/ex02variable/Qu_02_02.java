<<<<<<< HEAD
package ex02variable;
/*
문제2] 파일명 : Qu_02_02.java
국어,영어,수학 점수를 99, 80, 96점으로 입력하고 
평균점수를 구해서 출력하는 프로그램을 작성하시오.
 */
public class Qu_02_02 {

	public static void main(String[] args) {

		int kor = 99;
		int eng = 80;
		int math = 96;
		double avg = (kor+eng+math)/3.0;
		System.out.println(avg);
		System.out.println((int)avg);
	}

}

=======
package ex02variable;
/*
문제2] 파일명 : Qu_02_02.java
국어,영어,수학 점수를 99, 80, 96점으로 입력하고 
평균점수를 구해서 출력하는 프로그램을 작성하시오.
 */
public class Qu_02_02 {

	public static void main(String[] args) {

<<<<<<< HEAD
		int kor = 99;
		int eng = 80;
		int math = 96;
		double avg = (kor+eng+math)/3.0;
		System.out.println(avg);
		System.out.println((int)avg);
	}

}

=======
		int k=99, e=80, m=96;
		int avg1 = (k+e+m) / 3;  // 정수/정수 => 정수의 결과
		double avg2 = (k+e+m) / 3.0;  // 정수/실수 => 실수의 결과 
		
		System.out.println("평균점수1:"+ avg1);
		System.out.println("평균점수2:"+ avg2);
//		int kor=99, eng=80, math=96;
//		double avg = (kor+eng+math)/3.0;
//		System.out.println(avg);
//		System.out.println((int)avg);
	}

}
>>>>>>> refs/remotes/origin/master
>>>>>>> refs/remotes/origin/master
