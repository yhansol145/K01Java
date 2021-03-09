package ex03operator;

public class E07BitOperator {

	public static void main(String[] args) {

		int num1 = 5; 
		int num2 = 3; 
		int num3 =-1;
		
		System.out.println("비트AND:"+ (num1 & num2)); 
		System.out.println("비트OR:"+ (num1 | num2)); 
		System.out.println("비트XOR:"+ (num1 ^ num2)); 
		System.out.println("비트Not:"+ (~num3)); 
	}

}
