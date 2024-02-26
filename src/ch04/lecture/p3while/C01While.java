package ch04.lecture.p3while;

public class C01While {
	public static void main(String[] args) {
		// while: 반복문 정의
		// {}의 명령문들이 () 괄호의 값이 참이면 실행됨
		// {} 명령문 실행 후 다시 ()로 실행 흐름 넘어감

		// ()의 값이 false 이면 while 다음의 실행 흐름으로 넘어감

		System.out.println("statement 1");
		while (true) {
			System.out.println("statement 2");
			System.out.println("statement 3");
			break;
		}
		int rows = 10;

		for (int i = 1; i <= rows; i++ ) {
			for (int j = 1; j <= rows-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
