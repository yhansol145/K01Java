package ex02variable;

public class E06EscapeSequence {

	public static void main(String[] args) {
<<<<<<< HEAD
		
		//tab(탭) 기능. 스페이스 4칸이 띄워짐
		System.out.println("4월엔 벚꽃~~!");
		System.out.println("4월엔\t벚꽃~~!");
		
		//줄바꿈(Line feed) 기능.
		System.out.print("KOSMO에 오신걸 환영합니다.\n");
		System.out.print("열심히\n해봅시다.\n");
		
		//더블쿼테이션을 표현하고 싶을 때 사용.
		//System.out.println("나는 "개발자"가 되고싶어요");
		System.out.println("나는 \"개발자\"가 되고싶어요");
		
		//printf() : 문자열을 서식에 맞춰 출력할 때 사용함.
		int kor=81, eng=97, math=79;
		
		System.out.printf("국어:%d, 영어:%d, 수학:%d%n", kor, eng, math); // 정수인 경우 %d 를 사용.
		System.out.println("\n국어:"+ kor +", 영어:"+ eng +", 수학:"+ math);
		double avg = (kor+eng+math) / 3.0;
		System.out.printf("평균점수:%f%n", avg); // 실수인 경우 %f 를 사용.
		
		/*
		사용예) %4d : 정수 출력 시 전체자리수를 4자리로 표현
			%6.2f : 실수 출력 시 전체자리수는 6자리, 소수이하 2자리로 표현.
			
			양수는 우측정렬, 음수는 좌측으로 정렬됨.
		 */
		
		System.out.printf("국어:%d, 영어:%d, 수학:%d," + " 평균:%f %n", kor, eng, math, avg);
		System.out.printf("국어:%6d, 영어:%6d, 수학:%6d," + " 평균:%7.2f %n", kor, eng, math, avg);
		System.out.printf("국어:%-6d, 영어:%-6d, 수학:%-6d," + " 평균:%-7.2f %n", kor, eng, math, avg);
		
	}

}
=======

		System.out.println("4월엔 벚꽃~~!");
		System.out.println("4월엔\t벚꽃~~!");
		
		System.out.println("KOSMO에 오신걸 환영합니다.\n");
		System.out.println("열심히\n해봅시다.");
		
		System.out.println("나는 \"개발자\"가 되고싶어요");
		
		int kor=81, eng=97, math=79;
	
		System.out.printf("국어:%d, 영어:%d, 수학:%d%n", kor, eng, math); 
		System.out.println("\n국어:"+ kor +", 영어:"+ eng +", 수학:"+ math);
		double avg = (kor+eng+math) / 3.0;
		System.out.printf("평균점수:%f%n", avg); 
		
		System.out.printf("국어:%d, 영어:%d, 수학:%d," + " 평균:%f %n", kor, eng, math, avg);
		System.out.printf("국어:%6d, 영어:%6d, 수학:%6d," + " 평균:%7.2f %n", kor, eng, math, avg);
		System.out.printf("국어:%-6d, 영어:%-6d, 수학:%-6d," + " 평균:%-7.2f %n", kor, eng, math, avg);
	}

}
>>>>>>> refs/remotes/origin/master
