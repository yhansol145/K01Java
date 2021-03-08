package ex02variable;

public class E07TypeCasting {

	public static void main(String[] args) {

		byte b1 = 65;
		short s1;
		s1 = b1;
		System.out.printf("b1은 %d, s1은 %d%n", b1, s1);
		
		int num1 = b1 + s1;
		System.out.println("num1은 "+ num1);
		
		char ch2 = (char)b1;
		System.out.println("b1="+ b1 +", ch2="+ ch2);
		
		short s2 = 100;
		byte b2 = (byte)s2;
		System.out.printf("데이터손실:b2%d, s2=%d\n", b2, s2);
		
		int num3;
		double dl = 3.14;
		num3 = (int)dl;
		System.out.printf("데이터손실:num3=5%d, dl=%.2f %n", num3, dl);
		
		char ch3 = 'A', ch4;
		int num4 = 2;
		
		ch4 = (char)(ch3 + num4);
		System.out.println("ch4="+ ch4);
	}

}
