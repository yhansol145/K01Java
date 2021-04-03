package p_ex05method;

import java.util.Scanner;

/*
문제5-3) 파일명 : QuTemperature.java  (난이도:중)
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.

공식]
화씨 = 1.8 * 섭씨 + 32
섭씨 = (화씨 - 32) / 1.8
 */
public class QuTemperature {
	
	static double celsiutToFahrenheit(double cel) {
		double resultFah = 1.8 * cel + 32;
		return resultFah;
	}
	
	static double fahrenheitTocelsiut(double fah) {
		double resultCel = (fah - 32) / 1.8;
		return resultCel;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("섭씨를 입력하시오");
		double celsiut = sc.nextDouble();
		System.out.println("화씨 = "+ celsiutToFahrenheit(celsiut));
		
		System.out.println("화씨를 입력하시오");
		double fahrenheit = sc.nextDouble();
		System.out.println("화씨 = "+ fahrenheitTocelsiut(fahrenheit));
	}
}
