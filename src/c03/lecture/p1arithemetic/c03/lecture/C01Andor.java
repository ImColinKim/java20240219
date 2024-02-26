package c03.lecture.p1arithemetic.c03.lecture;

public class C01Andor {
	public static void main(String[] args) {
		// && : and (논리곱)
		// ||: or (논리합)

		// 피연산자 갯수: 2개
		// 피연산자 타입 : boolean
		// 연산결과 타입 : boolean

		// &&
		// 피연산자가 모두 true일 때 결과가 true, 나머지 모두 false
		// ||
		// 피연산자가 모두 false일 때 결과가 false, 나머지 모두 true
		// true || true : true
		// true || false : true
		// false || true : true
		// false || false : false

		int x = 6;
		int y = 3;

		boolean r1 = x < 10 && y >1;
		boolean r2 = x ==5 || y==5;

		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
	}
}
