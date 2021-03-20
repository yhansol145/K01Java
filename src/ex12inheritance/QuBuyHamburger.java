package ex12inheritance;

/*
문제5) QuBuyHamburger.java
햄버거를 추상화한 클래스와 기본가격, 세트가격을 추상화한 클래스를 정의하여 햄버거를 주문시 
기본가격 혹은 세트가격으로 출력할수 있도록 프로그램을 구현하시오. 
조건은 다음과 같다. 
햄버거
멤버변수 : 버거명, 가격, 패티, 소스, 야채
인자생성자 
멤버메소드 : 가격반환(getter), 햄버거정보출력
햄버거 기본가격 : 햄버거 + 음료 + 프렌치프라이의 합계
멤버변수 : 햄버거종류(객체), 음료가격(1000원으로 고정), 프렌치프라이가격(1500원으로 고정)
인자생성자
멤버메소드 : 기본가격계산, 결제금액출력
세트가격 : 기본가격클래스를 상속받음. 기본가격에서 500원 할인된 금액으로 계산
멤버변수 : 없음
인자생성자
멤버메소드 : 세트가격계산(Overriding), 결제금액출력(Overriding)
 */


class Burger {
	
	//멤버변수
	String burgerName;
	int price;
	String patty;
	String source;
	String vegetable;
	
	public Burger(String burgerName, int price, String patty, String source, String vegetable) {
		this.burgerName = burgerName;
		this.price = price;
		this.patty = patty;
		this.source = source;
		this.vegetable = vegetable;
		
	}
	
	public int getPrice() {
		return price;
	}
	
	public void showBurger() {
		System.out.println("버거명:"+ burgerName);
		System.out.println("가격:"+ getPrice());
		System.out.printf("식재료: %s, %s, %s", patty, source, vegetable);

	}
	
}

class HamburgerPrice {
	
	Burger burger;
	final int COKE = 1000;
	final int POTATO = 1500;
	int sidePrice = COKE + POTATO;
	int sumPrice;
	
	public HamburgerPrice(Burger burger) {
		this.burger = burger;
	}
	
	
	public void totalPrice() {
		sumPrice = burger.getPrice() + sidePrice;
		System.out.println(sumPrice);
	}
	
	public void showPrice() {
		burger.showBurger();
		System.out.println();
		System.out.print("결제금액:");
		totalPrice();
		System.out.println("==========================");
		
	}
	
	
	
	
}

class SetPrice extends HamburgerPrice {
	
	int setPrice;
	
	public SetPrice(Burger burger) {
		super(burger);
	}
	
	@Override
	public void totalPrice() {
		
		setPrice = sidePrice - 500;
		sumPrice = burger.getPrice() + setPrice;
		System.out.println(sumPrice);
		
	}
	
	@Override
	public void showPrice() {
		burger.showBurger();
		System.out.println();
		System.out.print("결제금액:");
		totalPrice();
		System.out.println("==========================");

	}
	
	
}

public class QuBuyHamburger {

	public static void main(String[] args) {

		//치즈버거 객체 생성
		Burger burger1 = new Burger("치즈버거", 2000, "쇠고기패티", "케챱", "피클");
		//치킨버거 객체 생성
		Burger burger2 = new Burger("치킨버거", 3000, "닭고기패티", "마요네즈", "양상치");
		
		
		//치즈버거를 기본 가격으로 구매
		HamburgerPrice price1 = new HamburgerPrice(burger1); 
		price1.showPrice();	// 4500원	
		
		//치킨버거를 세트가격으로 구매
		HamburgerPrice price2 = new SetPrice(burger2); 
		price2.showPrice();	// 5000원

	}

}
