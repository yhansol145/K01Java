package ex08class;

//과일판매자를 추상화한 클래스
class FruitSeller{
	
	//멤버변수
	int numOfApple = 100; //판매자의 사과 보유갯수
	int myMoney = 0; //판매수익
	final int APPLE_PRICE = 1000;//사과의 단가
		/*
		클래스의 멤버상수를 선언하는 경우 반드시 선언과 동시에
		초기화 해야한다. 만약 초기화를 별도로 진행한다면 에러가
		발생한다. (복습시 1000 부분을 제거해볼것)
		 */
	
	/*
	판매자가 사과를 판매하는 행위를 표현한 멤버메소드
	1. 구매자로부터 금액을 전달받는다.(매개변수)
	2. 금액/사과의단가=판매할 사과의 갯수를 구함 (5000/1000=5개)
	3. 보유한 사과의 갯수에서 판매할 갯수를 차감한다. (100-5=95개)
	4. 판매수익이 증가한다.(5000원)
	5. 구매자에게 판매한 사과의 갯수만큼 반환한다.
	 */
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	//판매자의 현재 상태를 출력한다.
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:"+ numOfApple);
		System.out.println("[판매자]판매수익:"+ myMoney);
	}
}

//과일구매자를 표현한 클래스
class FruitBuyer{
	
	int myMoney = 5000;//보유금액
	int numOfApple = 0;//구매한 사과의 갯수
	
	/*
	구매자가 판매자에게 사과를 구매하는 행위를 표현한 멤버메소드
	1. 판매자에게 금액을 지불한다.
	== 여기에서 seller객체의 saleApple()메소드가 호출된다. ==
	2. 판매자가 금액에 해당하는 사과의 갯수를 반환하면, 해당 갯수만큼
		보유한 사과의 갯수를 증가시킨다.
	3. 판매자에게 지불한 금액만큼 차감된다.
	 */
	public void buyApple(FruitSeller seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	//구매자의 현재상태 출력
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}
}

public class E06FruitSalesMain1 {

	public static void main(String[] args) {

		FruitSeller seller = new FruitSeller();//판매자 객체
		FruitBuyer buyer = new FruitBuyer();//구매자 객체
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
		
		/*
		구매자가 판매자에게 5000원을 지불하고 사과를 
		구매한 행위를 코드로 표현함
		 */
		
		buyer.buyApple(seller, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
		
	}

}
