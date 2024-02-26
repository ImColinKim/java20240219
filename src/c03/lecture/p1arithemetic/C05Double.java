package c03.lecture.p1arithemetic;

import java.math.BigDecimal;

public class C05Double {
	public static void main(String[] args) {
		// double은 근사치를 저장
		double a = 0.1;
		double b = 0.2;
		System.out.println(a+b);

		// 1. BigDecimal 사용
		BigDecimal c = new BigDecimal("0.1");
		BigDecimal d = new BigDecimal("0.2");
		BigDecimal result = c.add(d);
		System.out.println("result = " + result);; // 출력: 0.3
//		
		// 2. 정수로 바꿔서 연산
		int e = (int) (a*10);
		int f = (int) (b*10);
		int g = e+f;
		double h = g/10.0;
		System.out.println("h  = " + h );

		//실수에서 / 연산 시 infinity
		double i = 3.0;
		double j = 0.0;
		double k = i / j;
		System.out.println("k = " + k);

		//실수에서 % 연산 시 NaN(Not a Number)
		double l = 3.0;
		double m = 0.0;
		double n = l % m;
		System.out.println("n = " + n);
		
		// infinity
		boolean o = Double.isInfinite(g);
		System.out.println("o = " + o);

		// NaN
		boolean p = Double.isNaN(k);
		System.out.println("m = " + m);
		

	}
}
