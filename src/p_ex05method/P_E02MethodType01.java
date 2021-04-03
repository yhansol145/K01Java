package p_ex05method;

public class P_E02MethodType01 {

	static void noParamNoReturn() {
		System.out.println("==메뉴를 선택하세요==");
		System.out.println("1.열기, 2.계속하기, 3.종료");
		System.out.println("======================");
	}
	
	static void noParamNoReturn2() {
		//경우에따라 메소드는 실행부가 없는 경우도 있음.
	}
	
	static void noParamNoReturn2(int a) {
		//method overoading
	}
	
	static void noParamNoReturn3() {
		int returnValue = 88;
		System.out.println("Return문 이전");
		
		//return : 중간에 리턴을 쓰게되면 함수가 즉시 종료되므로
		//	아래문장은 실행되지 않는 코드가 된다. 반드시 조건문과 함께 사용
		//		단, 마지막 라인에 있을때는 노상관
		
		if(returnValue%2==0) {
			System.out.println(returnValue + "는 짝수");
			return;
		}
		
		System.out.println(returnValue+ "는 홀수");
		System.out.println("return문 이후");
		
	}
	
	
	public static void main(String[] args) {
		
		noParamNoReturn();
		noParamNoReturn2();
		noParamNoReturn3();
	}

}
