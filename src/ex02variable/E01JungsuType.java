package ex02variable;

public class E01JungsuType {

	public static void main(String[] args) {
		
		int int1 = 100;
		int int2 = 200;
		int result1 = int1 + int2;
		System.out.println("int1 + int2 = "+ result1);
		
		result1 = int1 / int2;
		System.out.println("int1 / int2 = "+ result1);
		
		byte byte1 = 50, byte2 = 55;
		int result2 = byte1 + byte2; // byte + byte = int형
		System.out.println("byte1 + byte2 = "+ result2);
		
		short short1 = 60, short2 = 70;
		int result3 = short1 + short2; // short + short = int
		System.out.println("short1 + short2 = "+ result3);
		
		long long1 = 1000, long2 = 2000;
		long result4 = int1 + long1; // int + long = long
		System.out.println("int1 + long1 = "+ result4);
		
		result4 = long1 + long2; // long끼리의 연산이므로 기본규칙 따름
		System.out.println("long1 + long2 = "+ result4);
		
		long long4 = 2200000000L;
		long long5 = 2200000000l;
		
		System.out.println("long4="+ long4);
		System.out.println("long5="+ long5);

	}

}