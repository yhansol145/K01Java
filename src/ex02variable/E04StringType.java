<<<<<<< HEAD
package ex02variable;

public class E04StringType {

	public static void main(String[] args) {

		/*
		String 타입 : 참조형 변수로써 기본자료형이 아님
			문자열을 저장할 수 있는 자료형으로 실제로는 class임
			자바에서는 문자열을 표현할때 ""으로 감싸면 되고,
			연결할 때 + 기호를 사용한다.
		 */
		int number;
		number = 99;
		
		/*
	 	참조형변수와 기본자료형변수 사이에서는 형변환이 불가능하다.
	 	서로 사용하는 메모리 공간이 다르기 때문이다.
	 	- 기본자료형 : 스택(Stack)영역 사용
	 	- 참조형(클래스)변수 : 힙(Heap)영역 사용
		 */
		//int stringNumber1 = (int)"100"; -> 에러발생
		//String stringNumber2 = (String)100; -> 에러발생
		
		
		/*
		문자열 + 정수 -> 문자열
		즉 문자열에 정수가 연결된 형태로 출력된다.
		 */
		String strNumber = "100";
		System.out.println(strNumber + number); //출력 : 10099
		
		/*
		String은 클래스이므로 new 키워드를 이용해서 인스턴스(객체)를 생성한 후 문자열을 참조한다.
		 */
		
		String newString = new String("new 키워드 사용");
		System.out.println(newString);
		
		//문자열 + 문자열 = 문자열 연결됨
		String stringBasic = "클래스지만";
		String plusString = "기본자료형처럼 사용";
		System.out.println(stringBasic +" "+ plusString);
		
		/*
		문자열 + 숫자 -> 우선순위가 없다면 일반적으로 문자열로 출력된다.
		단, 산술연산의 결과를 출력하고 싶다면 아래와 같이 소괄호로 묶어 우선순위에 대한 변화를 주면 된다.
		 */
		int kor=100, eng=99, math=98;
		System.out.println("총점"+kor+eng+math); //1009998
		System.out.println("총점"+(kor+eng+math)); //297
	}

}
=======
package ex02variable;

public class E04StringType {

	public static void main(String[] args) {

<<<<<<< HEAD
		/*
		String 타입 : 참조형 변수로써 기본자료형이 아님
			문자열을 저장할 수 있는 자료형으로 실제로는 class임
			자바에서는 문자열을 표현할때 ""으로 감싸면 되고,
			연결할 때 + 기호를 사용한다.
		 */
		int number;
		number = 99;
		
		/*
	 	참조형변수와 기본자료형변수 사이에서는 형변환이 불가능하다.
	 	서로 사용하는 메모리 공간이 다르기 때문이다.
	 	- 기본자료형 : 스택(Stack)영역 사용
	 	- 참조형(클래스)변수 : 힙(Heap)영역 사용
		 */
		//int stringNumber1 = (int)"100"; -> 에러발생
		//String stringNumber2 = (String)100; -> 에러발생
		
		
		/*
		문자열 + 정수 -> 문자열
		즉 문자열에 정수가 연결된 형태로 출력된다.
		 */
		String strNumber = "100";
		System.out.println(strNumber + number); //출력 : 10099
		
		/*
		String은 클래스이므로 new 키워드를 이용해서 인스턴스(객체)를 생성한 후 문자열을 참조한다.
		 */
		
		String newString = new String("new 키워드 사용");
		System.out.println(newString);
		
		//문자열 + 문자열 = 문자열 연결됨
		String stringBasic = "클래스지만";
		String plusString = "기본자료형처럼 사용";
		System.out.println(stringBasic +" "+ plusString);
		
		/*
		문자열 + 숫자 -> 우선순위가 없다면 일반적으로 문자열로 출력된다.
		단, 산술연산의 결과를 출력하고 싶다면 아래와 같이 소괄호로 묶어 우선순위에 대한 변화를 주면 된다.
		 */
		int kor=100, eng=99, math=98;
		System.out.println("총점"+kor+eng+math); //1009998
		System.out.println("총점"+(kor+eng+math)); //297
=======
		int number;
		number = 99;
		
		String strNumber = "100";
		System.out.println(strNumber + number);
		
		String newString = new String("new 키워드 사용");
		System.out.println(newString);
		
		String stringBasic = "클래스지만";
		String plusString = "기본자료형처럼 사용";
		System.out.println(stringBasic +" "+ plusString);
		
		int kor=100, eng=99, math=98;
		System.out.println("총점"+kor+eng+math);
		System.out.println("총점"+(kor+eng+math));
>>>>>>> refs/remotes/origin/master
	}

}
>>>>>>> refs/remotes/origin/master
