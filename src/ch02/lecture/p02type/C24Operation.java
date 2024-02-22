package ch02.lecture.p02type;

public class C24Operation {
	public static void main(String[] args) {
		//1. 같은 타입끼리 연산 결과는 피연산자의 타입.
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("c = " + c);

		long d = 10;
		long e = 10;
		long f = d+e;
		System.out.println("f = " + f);
		
		//2. 다른 타입끼리 연산 결과는 큰 타입.
		long g = a+d;
		// int h = a+d; 불가 or int h = (int) a+d;
		
		//3. String 과 다른 타입 간 연산은 무조건 String
		String h = " 보다 큰 ";
		String i = d + h + b;
		System.out.println("i = " + i);
		System.out.println(d+h+b);
	}
}
