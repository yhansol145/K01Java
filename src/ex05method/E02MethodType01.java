package ex05method;

/*
Method(메소드, 함수)
	: 객체지향 프로그램에서 행동 또는 동작을 의미한다.
	즉 어떤 하나의 업무를 처리하는 모듈(부속품)이라 정의할 수 있다.
규칙
	- 메소드는 반드시 class안에 정의해야 한다.
	- 메소드안에 다른 메소드를 정의할 수 없다.
	- 반환타입이 없더라도 반드시 void를 명시해야 한다.
	- 이름의 규칙은 변수명과 동일하다. (ex. addCalculate())
Java Naming rule(이름규칙)
	- 클래스명 : SimpleFunc -> 대문자로 시작하는 Camel case
	- 메소드명, 변수명 : simpleFunc -> 소문자로 시작하는 변형된 Camel case
	- 상수 : SIMPLE_FUNC -> 전체를 대문자로 표현하고, 연결단어는 언더바를 사용
	- 패키지명 : simple.func -> 전체를 소문자로 표현하고, 연결단어가 있더라도
		언더바를 사용하지 않는다. 언더바 대신 .(닷, 점)을 사용한다.
 */

public class E02MethodType01 {

	static void noParamNoReturn() {
		System.out.println("==메뉴를 선택하세욤==");
		System.out.println("1.열기, 2.계속하기, 3.종료");
		System.out.println("=================");
	}

	static void noParamNoReturn2() {
		// 경우에 따라 메소드는 실행부가 없는 경우도 있음.
	}
	static void noParamNoReturn2(int a) {
		/*
		동일한 이름의 메소드가 정의되었으나 매개변수의 갯수로
		구분할 수 있으므로 다른 함수임.
		"메소드 오버로딩"이라 한다.
		 */
	}
	
	static void noParamNoReturn3() {
		int returnValue = 89;
		System.out.println("[Return문 이전]");
		
		//return;
		/*
		위와 같이 함수 중간에 return을 쓰게되면 함수가 즉시 종료되므로
		아래 문장은 실행되지 않는 쓰레기코드가 된다. 반드시 조건문과 함께
		사용되어야 한다. 단, 마지막 라인에 있을 때는 상관없다.
		 */
		
		if(returnValue%2==0) {
			System.out.println(returnValue +"는 짝수");
			return;
		}
		
		System.out.println(returnValue +"는 홀수");
		System.out.println("[return문 이후]");
	}
	
	public static void main(String[] args) {
		//메소드 호출시에는 메소드의 원형을 그대로 사용하면 된다.
		noParamNoReturn();
		noParamNoReturn2();
		noParamNoReturn3();
		noParamNoReturn3();

	}
}
