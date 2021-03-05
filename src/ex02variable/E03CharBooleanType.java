package ex02variable;

public class E03CharBooleanType {

	public static void main(String[] args) {
		
		char ch1 = '가';
		String chStr = "가나다라";
		System.out.println("ch1="+ ch1);
		System.out.println("chStr="+ chStr);
		
		char ch2 = 'A'; 
		int num1 = 2;
		int num2 = ch2 + num1; 
		System.out.println("num2="+ num2); 
		System.out.println("(char)num2="+ (char)num2); 
		
		char ch3 = (char)(ch2+num1);
		System.out.println("ch3(문자출력)=>"+ ch3);
		System.out.println("ch3(아스키코드출력)=>"+ (int)ch3);
		
		char ch4 = '1'; 
		char ch4_1 = '1' + 1; 
		System.out.println("ch4"+ ch4
				+", ch4_1="+ ch4_1
				+", ch4_1="+ (int)ch4_1); 
		
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn=1"+ bn1 +", bn2="+ bn2);
		
		boolean bn3 = bn1 && bn2;
		System.out.println("bn3(And)="+ bn3); 
		bn3 = bn1 || bn2;
		System.out.println("bn3(Or)="+ bn3); 
		
		bn3 = '가' > 30000; 
		System.out.println("bn3="+ bn3);
	}

}
