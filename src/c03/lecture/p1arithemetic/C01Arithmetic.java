package c03.lecture.p1arithemetic;

public class C01Arithmetic {
	public static void main(String[] args) {
		// 산술 연산자
		// +, - , * , / , %
		// 피연산자 갯수 : 2개
		// 피연산자 : numeric (정수, 실수, 문자)
		// 연산결과의 타입 : 피연산자 중 큰 타입

		int a = 3;
		int b = 9;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(b / a);
		System.out.println(b % a);
	}

	public static class C02Arithemetic {
		public static void main(String[] args) {
			// 증감연산자
			// ++. --
			// 피연산자 갯수: 1개
			// 연산의 결과 타입: 피연산자의 타입
			// 연산의 결과값
			// 1. 피연산자의 값
			// 2. 피연산자의 값 +1 or -1

			int a = 10;
			int a1 = a++;
			System.out.println("a1 = " + a1);
			System.out.println("a = " + a);

			int b = 10;
			int b1 = ++b;
			System.out.println("b1 = " + b1);
			System.out.println("b = " + b);

			int c = 10;
			int c1 = c--;
			System.out.println("c1 = " + c1);
			System.out.println("c = " + c);


			int d = 10;
			int d1 = --d;
			System.out.println("d1 = " + d1);
			System.out.println("d = " + d);

		}
	}
}
