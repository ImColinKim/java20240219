package ch02.sec01;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		double z = 5 % y ;
		//double z = x % y;

		//잘못된 코드
		System.out.println(z+2);

		// 알맞은 코드
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값: 산출 불가");
		} else {
			System.out.println(z+2);
		}
	}
}