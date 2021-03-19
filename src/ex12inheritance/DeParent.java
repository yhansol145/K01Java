package ex12inheritance;

//부모클래스
public class DeParent {

	//멤버변수
	private String name;
	private int age;
	
	//생성자메소드 (인자없는것, 인자있는것)
	public DeParent() {}
	public DeParent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//getter()메소드 (private 멤버를 클래스 외부로 반환할 때 사용)
	public String getName() {
		return name;
	}
	
	/*
	멤버메소드 정의
		-> 4가지 접근지정자를 사용하여 정의한 멤버메소드 
	 */
	private void eat() {
		System.out.println("부모님이 드신다");
	}
	String sleep() {
		System.out.println("부모님이 주무신다");
		return null;
	}
	protected void walk() {
		System.out.println("부모님이 산책하신다");
	}
	protected void excecise() {
		System.out.println("부모님이 운동하신다");
	}
	
	//정보출력용 메소드
	public void printParent() {
		System.out.printf("성함:%s, 연세:%d", name, age);
	}
	
	//정적메소드 정의
	public static void staticMethod() {
		System.out.println("부모님의 정적메소드");
	}
}
